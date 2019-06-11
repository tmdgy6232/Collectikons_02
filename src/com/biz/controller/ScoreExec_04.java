package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

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
		
		// number필드를 private로 선언했기 때문에
		// 다음 코드는 사용이 불가하다
		// sco[i].number = ?
		// 때문에 number 값을 저장할 때 사용할 setter method를 만들었다.
		// number필드는 string형인데 i값은 int 형이다.
		// sco[i].setNumber(i); = 오류발생
		
		// 1. i값은 0부터 시작하므로 +1을 해서 1부터 시작하도록 설정해야한다.
		// 2. 따라서 Number 필드에 값을 저자하기 위해서는
		// int형을 string형으로 변환시켜야한다.
		
		//기존 자바 전통문법
		// sco[i].setNumber(Integer.toString(i+1));
		//int형을 string형으로 바꾸는 최근문법
		// sco[i].setNumber(""+(i+1);
		// i값을 괄호안에 넣어서 먼저 실행시키지 않으면 문자열로 인식하여
		//11, 21, 31 등으로 나타남
		
		//3과목의 점수를 셋팅
		
		//점수를 넣는 두가지 방법
		//1. int Kor = rnd.nextInt(50)+51;
		//2. sco[i].setKor(nextInt(50)+51);
		
		//각 방법 당 총점계산
//		//1. int Total = kor;
//			Total += Eng;
//			Total += Math;
		//2. int Total = sco[i].getKor();
//		Total += sco[i].getEng();
//		Total += sco[i].getmath();
		
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
		

	}

}