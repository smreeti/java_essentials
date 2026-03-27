package leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
* You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:
The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.


Example 1:
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

Constraints:
1 <= tokens.length <= 104
tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
* */
public class EvaluateReversePolishNotation_150 {

    /*
    * start = []
    * 1. "10" -> push [10]
    * 2. "6" -> push [10, 6]
    * 3. "9" -> push [10.6,9]
    * 4. "3" -> push [10,6,9,3]
    * 5. "+" -> pop 3, 9 => 9+3 = 12 and push 12 => [10,6,12]
    * 6. "-11" -> push [10,6,12,-11]
    * 7. "*" -> pop -11, 12 => -12*11 = -132 and push [10,6,-132]
    * 8. "/" -> pop -132, 6 => 6/(-132) = 0 and push [10,0]
    * 9. "*" -> pop 0, 10 => 10 * 0 = 0 and push [0]
    * 10. "17" -> push [0,17];
    * 11. "+" -> pop 17, 0 => 0+17 and push [17]
    * 12. "5" -> push [17,5]
    * 13. "+" -> pop and "5+17" = push [22]
    * */
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        System.out.println(stack.pop());
    }

    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
