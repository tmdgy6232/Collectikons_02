package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		
		for(int i =0; i<50; i++) {
			//간접변수, 주소참조변수로서 어떤 클래스를 객체로 생성해서
			//리스트에 추가하고자 할때는
			//값들을 대입하게이 앞서
			//반드시 클래스를 객체로 (새로) 생성해서 사용해야한다.
			
			ScoreVO sVO = new ScoreVO();
			sVO.setNumber(""+(i+1));
			
			sVO.setKor(rnd.nextInt(50)+51);
			sVO.setEng(rnd.nextInt(50)+51);
			sVO.setMath(rnd.nextInt(50)+51);
			
			scList.add(sVO);
			
		}
		for(ScoreVO s : scList) {
			System.out.println(s.toString());
		}
		//리스트의 크기를 알수있는 method로 List.size()가 있다.
		//이 List.size()매서드는 호출할때마다 매번 List의 갯수를 계산한다.
		//따라서 배열에 length와는 성질이 달라서 
		//for문 내에서 가급적 사용하지말고 
		//for가 시작되기전에 미리 계산해서 변수에 저장하고
		//for 반복문을 실행하는것이 좋다.
		int scLen = scList.size();
		
		for(int i =0; i <scLen; i++) {
			//scList의 i번째 위치의 저장된 ScoreVO의 주소를 읽어
			//vo에 담아달라.
			ScoreVO vo = scList.get(i);
			
			int intTotal  =vo.getKor() + vo.getEng() + vo.getMath();
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
			
			intTotal = scList.get(i).getKor();
			intTotal += scList.get(i).getEng();
			intTotal += scList.get(i).getMath();
			
			//build 패턴
			//scList의 주소를 직접 참조하여
			//주소로 부터 Total 변수의 위치를 물어보고
			// 그 Total 변수에 값을 setting하라
			scList.get(i).setTotal(intTotal);
			
		}
		scLen = scList.size();
		for(int i=0; i<scLen; i++) {
			for (int j=i+1; j<scLen; j++) {
				ScoreVO v1 = scList.get(i);
				ScoreVO v2 = scList.get(j);
				if(v1.getTotal() < v2.getTotal()){
					ScoreVO _score = scList.get(i);
					scList.set(i,v2);
					scList.set(j,_score);
				}
				
			}
		}
	}

}
