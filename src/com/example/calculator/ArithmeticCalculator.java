package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T extends Number> {

    private List<Number> results = new ArrayList<>();//연산결과 저장하는 컬렉션 타입 필드선언 및 생성

    public List<Number> Calculator(Number n1, Number n2, String cal){

        OperatorType op = OperatorType.fromSymbol(cal);

        results.add(op.apply(n1,n2));

        return results;

    }

    //입력한 번호에 인덱스 데이터를 삭제하는 메서드
    public void delfirstResult(int n){
        getResults().remove(n);
    }


    public List<Number> getResults() {
        return results;
    }
    //입력한 숫자를 컬렉션 필드에 추가하는 메서드
    public void setResults(Number n) {
        this.results.add(n);
    }

    public void setResults(List<Number> results) {
        this.results = results;
    }
}
