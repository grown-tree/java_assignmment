package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int num1,num2 = 0;//사용자입력 숫자저장 변수
        char cal= ' '; //연산기호저장 변수
        int result = 0; //결과저장 변수
        String exit= ""; //종료 변수
        
        Scanner sc = new Scanner(System.in);//사용자로부터 입력받기위한 인스턴스
        Calculator calMethod = new Calculator();
        while (true) {
            while (true) {//무한반복
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
                if (num1 >= 0) {//입력받은 숫자가 0보다 큰 경우 반복문 탈출
                    break;
                } else {//그외 모든경우
                    System.out.println("0보다 큰 숫자를 입력해주세요 ");
                }
            }
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();
                if (num2 >= 0) {
                    break;
                } else {
                    System.out.println("0보다 큰 숫자를 입력해주세요 ");
                }
            }
            System.out.println("사칙연산 기호를 입력해주세요 : +, -, *, /");
            cal = sc.next().charAt(0);//입력값중 첫번째글자만 char형태 변수 cal에 저장

            calMethod.Calculator(num1,num2,cal);//사칙연산을 수행 후, 결과값 반환 메서드

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();

            if(exit.equals("exit")){

                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }


    }

}

