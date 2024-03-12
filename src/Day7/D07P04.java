package com.learning.core.Day7;

import java.util.Stack;

public class D07P04 {
	public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                while (!operators.isEmpty() && hasPrecedence(currentChar, operators.peek())) {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    operands.push(applyOperation(operand1, operand2, operator));
                }
                operators.push(currentChar);
            }
        }

        while (!operators.isEmpty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            operands.push(applyOperation(operand1, operand2, operator));
        }

        return operands.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
			return false;
		}
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
			return false;
		}
        return true;
    }

    public static int applyOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
					throw new ArithmeticException("Division by zero");
				}
                return operand1 / operand2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println(" " + expression);
        System.out.println(" " + result);
    }

}
