package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    //저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력해주는 메서드
    public List<Number> biggerResults(Number num){

        //스트림으로 준비 필터로 더큰값 분류후 콜렉트로 모아서 리스트로만들어서 넣어줌
        List<Number> biggerResults = getResults().stream().filter(n ->n.doubleValue() > num.doubleValue()).collect(Collectors.toList());

        return biggerResults;
    }
}
