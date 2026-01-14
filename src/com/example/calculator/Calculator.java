package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calculator {

    private List<Integer> results = new ArrayList<>();//연산결과 저장하는 컬렉션 타입 필드선언 및 생성
    public List<Integer> Calculator(int n1, int n2, char cal){

            switch (cal) {
                case '+':
                    results.add(n1+n2);
                    break;
                case '-':
                    results.add(n1-n2);
                    break;
                case '*':
                    results.add(n1*n2);
                    break;
                case '/':

                    if (n2 == 0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    results.add(n1/n2);
                    break;
                default:
                    System.out.println("+, -, *, / 중 하나를 입력해주세요.");
                    break;
            }
        return results;

    }

    //입력한 번호에 인덱스 데이터를 삭제하는 메서드
    public void delfirstResult(int n){
        getResults().remove(n);
    }


    public List<Integer> getResults() {
        return results;
    }
    //입력한 숫자를 컬렉션 필드에 추가하는 메서드
    public void setResults(int n) {
        this.results.add(n);
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }
}
