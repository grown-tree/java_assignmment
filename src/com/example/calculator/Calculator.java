package com.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int num1,num2 = 0;//사용자입력 숫자저장 변수
        String cal = ""; //연산기호저장 변수
        int result = 0; //결과저장 변수

        Scanner sc = new Scanner(System.in);//사용자로부터 입력받기위한 인스턴스

        while(true){//무한반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
            if (num1 >=0){//입력받은 숫자가 0보다 큰경우 반복문 탈출
                break;
            }else{//그외 모든경우
                System.out.println("0보다 큰 숫자를 입력해주세요 ");
            }
        }
        while(true) {
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();
            if (num2 >=0) {
                break;
            } else {
                System.out.println("0보다 큰 숫자를 입력해주세요 ");
            }
        }


        System.out.print("첫번째 숫자: "+num1+"\n2번째 숫자: "+num2);//출력문으로 동작확인


    }
}

