package com.biz.controller;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];
		Random rnd = new Random();
		
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i+1;
		}
		for(int i=0; i < intNum.length; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
		}
		for(int i =0; i<intNum.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
		}
		System.out.println("==================================================");
		System.out.println("빅데이터반 성적표");
		System.out.println("==================================================");
		System.out.println("순위\t국어\t영어\t수학\t총점\t학번");
		System.out.println("==================================================");
		for(int i=0; i<intNum.length; i++) {
			for(int j=i+1; j<intNum.length; j++) {
				if(intTotal[i] < intTotal[j]) {
					int _t = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _t;
					
					int _k = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _k;
					
					int _e = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _e;
					
					int _m = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _m;
					
					int _z = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _z;
					
					
				}
			}

			System.out.printf("%3d\t%3d\t%3d\t%3d\t%5d\t%3d",(i+1),
					intKor[i],intEng[i],intMath[i],intTotal[i],intNum[i]);
			System.out.println();
		}
		System.out.println("---------------------------------------------------------");
	}

}
