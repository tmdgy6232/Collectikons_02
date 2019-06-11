package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		// 1. ScoreVO 클래스를 비용해서 10개의 배열 생성
		// 2. 넘버는 1번부터 순서대로 저장
		// 3. 이름은 저장하지 않음.
		// 4. kor, eng, math 점수를 51~100점 범위의 임의의 값으로 생성하여 저장
		// 5. 총점과 평균을 계상
		// 6. 저장된 값을 toString()을 호출하여 확인
		ScoreVO[] sco = new ScoreVO[20];
		Random rnd = new Random();
		

		for (int i = 0; i < sco.length; i++) {
			sco[i] = new ScoreVO();
		}

		for(int i=0; i<sco.length; i++) {
			
			int n = rnd.nextInt(50);
			
		
		sco[i].setNumber(""+(i+1));
		
		
		sco[i].setKor(n+51);
		n = rnd.nextInt(50);
		sco[i].setEng(n+51);
		n = rnd.nextInt(50);
		sco[i].setMath(n+51);
	
		int total =0;
		total = sco[i].getKor();
		total += sco[i].getEng();
		total += sco[i].getMath();
		
		sco[i].setTotal(total);
		
		int avg= total/3;
		sco[i].setAverage(avg);
		
		
		System.out.println(sco[i].toString());
		
		
		
		}
		for(int  i=0; i<sco.length;i++) {
			System.out.println(sco[i].toString());
		}
			
		
		System.out.println("=======================");
		System.out.println("빅데이터반 성적처리");
		System.out.println("=======================");
		System.out.println("학번\t국어\t수학\t총점\t평균\t석차");
		System.out.println("-----------------------");

		for(ScoreVO vo : sco){
		
		System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%5d\t%3d\n",
				vo.getNumber(),
				vo.getKor(),
				vo.getEng(),
				vo.getMath(),
				vo.getTotal(),
				vo.getAverage(),
				vo.getRank()
				
				);
		
		}
	}
}
