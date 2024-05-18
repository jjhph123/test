package test;

import java.util.Stack;

public class Calc {
    public static double eval(String postfix) {
        String[] tokens = postfix.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("연산자를 위한 충분한 피연산자가 없습니다.");
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = applyOperator(a, b, token);
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(token));
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("너무 많은 피연산자.");
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static double applyOperator(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return a / b;
            default:
                throw new IllegalArgumentException("알 수 없는 연산자: " + operator);
        }
    }

    public static void main(String[] args) {
        String postfix1 = Infix2Postfix.convert("21 - 4");
        System.out.println("후위 표기법 (postfix1): " + postfix1);
        System.out.println("평가 결과 (postfix1): " + eval(postfix1));
    }
}