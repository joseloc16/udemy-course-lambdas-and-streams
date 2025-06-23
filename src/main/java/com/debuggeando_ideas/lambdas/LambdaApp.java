package com.debuggeando_ideas.lambdas;

public class LambdaApp {
    public static void main(String[] args) {
        Math substract = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a-b;
            }
        };
        System.out.println(substract.execute(30.0, 20.0));

        Math mulñtiply = (a, b) -> a * b;
        System.out.println(mulñtiply.execute(30.0, 20.0));

        Math divide = (a, b) -> {
            System.out.println("Dividing " + a + " by " + b);
            return a / b;
        };
        System.out.println(divide.execute(30.0, 20.0));

        System.out.println(divide.sum(30.0, 20.0));
    }
}
