package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Double num1,num2;
        List<Integer> test = new ArrayList<>();
        int testing = 0;
        char cal= ' '; //연산기호저장 변수
        String exit= "";

        Scanner sc = new Scanner(System.in);//사용자로부터 입력받기위한 인스턴스
        ArithmeticCalculator calMethod = new ArithmeticCalculator();

        while (true) {
            while (true) {//무한반복
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextDouble();
                if (num1 >= 0) {//입력받은 숫자가 0보다 큰 경우 반복문 탈출
                    break;
                } else {//그외 모든경우
                    System.out.println("0보다 큰 숫자를 입력해주세요 ");
                }
            }
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextDouble();
                if (num2 >= 0) {
                    break;
                } else {
                    System.out.println("0보다 큰 숫자를 입력해주세요 ");
                }
            }
            System.out.println("사칙연산 기호를 입력해주세요 : +, -, *, /");
            cal = sc.next().charAt(0);//입력값중 첫번째글자만 char형태 변수 cal에 저장

            calMethod.Calculator(num1,num2,Character.toString(cal));//숫자2개와 char형을 String으로 변환 후 전달

            System.out.println("더 계산하시겠습니까?\n(exit 입력 시 종료,\t check 입력시 결과확인, \t modify 입력시 결과수정 \t bigger입력시 결과값중 입력값보다 더 큰 값 확인)");
            exit = sc.next();

            if(exit.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (exit.equals("check")) {//컬렉션 필드 게터활용
                System.out.println("결과 확인:"+calMethod.getResults());

            }else if (exit.equals("modify")) {
                System.out.println("결과 확인:"+calMethod.getResults());
                System.out.println("결과값에 삭제하고싶은 인덱스 번호입력");
                testing = sc.nextInt();
                calMethod.delfirstResult(testing);//입력한 숫자에 해당하는 인덱스결과값 삭제
                System.out.println("결과값에 추가하고싶은 숫자입력");
                testing = sc.nextInt();
                calMethod.setResults(testing);//세터 활용
                System.out.println("수정된 결과 확인:"+calMethod.getResults());
            }else if(exit.equals("bigger")){
                System.out.println("숫자 입력해주세요");
                System.out.println("더 큰 값 확인" + calMethod.biggerResults(sc.nextDouble()));
            }
        }


    }

}

