package test;

import java.util.*;

public class Infix2Postfix {
    public static String convert(String exp) {
        exp = exp.replaceAll("\\(", " ( ");
        exp = exp.replaceAll("\\)", " ) ");
        exp = exp.replaceAll("\\+", " + ");
        exp = exp.replaceAll("\\*", " * ");
        exp = exp.replaceAll("/", " / ");
        exp = exp.replaceAll("-", " - ");
        exp = exp.replaceAll("\\s+", " ").trim();

        String[] str = exp.split(" ");

        ArrayList<String> sb = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            String now = str[i];

            // 음수 부호 처리
            if (now.equals("-")) {
                if (i == 0 || (i > 0 && (str[i - 1].equals("(") || isOperator(str[i - 1])))) {
                    sb.add("0");
                }
            }

            switch (now) {
                case "+":
                case "-":
                case "*":
                case "/":
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
                        sb.add(stack.pop());
                    }
                    stack.push(now);
                    break;
                case "(":
                    stack.push(now);
                    break;
                case ")":
                    while (!stack.isEmpty() && !stack.peek().equals("(")) {
                        sb.add(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.add(now);
            }
        }

        while (!stack.isEmpty()) {
            sb.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();
        for (String item : sb) {
            result.append(item).append(" ");
        }
        return result.toString().trim();
    }

    public static int priority(String operator) {
        if (operator.equals("(") || operator.equals(")")) {
            return 0;
        } else if (operator.equals("+") || operator.equals("-")) {
            return 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            return 2;
        }
        return -1;
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    
    public static int opType(String operator) {
        switch (operator) {
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String exp1 = "-3 + 5";
        String exp2 = "3 + (-4 * 5)";
        String exp3 = "3 + (4 * -5)";
        String exp4 = "21 - 4";

        System.out.println("후위 표기법 (exp1): " + convert(exp1));
        System.out.println("후위 표기법 (exp2): " + convert(exp2));
        System.out.println("후위 표기법 (exp3): " + convert(exp3));
        System.out.println("후위 표기법 (exp4): " + convert(exp4));
    }
}
