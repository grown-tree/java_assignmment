package com.example.calculator;

public enum OperatorType {
    // 1. 각 상수가 수행할 실제 연산 로직을 익명 클래스 형태로 구현
    PLU("+") {
        @Override
        public <T extends Number> Number apply(Number x, Number y) { return x.doubleValue() +y.doubleValue(); }
    },
    MIN("-") {
        @Override
        public <T extends Number> Number apply(Number x, Number y) { return x.doubleValue()-y.doubleValue(); }
    },
    MUL("*") {
        @Override
        public <T extends Number> Number apply(Number x, Number y) { return x.doubleValue() * y.doubleValue(); }
    },
    DIV("/") {
        @Override
        public <T extends Number> Number apply(Number x, Number y) {
            if (y.doubleValue() == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
            return x.doubleValue()/y.doubleValue();
        }
    };

    private final String symbol;

    // 생성자
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    //연산기호를 받아와 선언된 상수들과 일치하는지 확인
    public static OperatorType fromSymbol(String symbol) {
        for (OperatorType op : values()) {
            if (op.symbol.equals(symbol)) return op;
        }
        throw new IllegalArgumentException("잘못된 연산자입니다.");
    }

    // 기호 반환 메서드
    public String getSymbol() { return symbol; }

    // 2. 모든 연산자가 공통으로 가져야 할 추상 메서드 선언
    public abstract <T extends Number> Number apply(Number n1, Number n2);
}

