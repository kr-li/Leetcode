import java.util.Stack;

public class Leetcode20 {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(alpha);
            }

            else if (stack.peek() == ')' || stack.peek() == '}' || stack.peek() == ']'){
                return false;
            }

            else if (stack.peek() == '(' && alpha == ')'){
                stack.pop();
            }
            else if (stack.peek() == '[' && alpha == ']'){
                stack.pop();
            }
            else if (stack.peek() == '{' && alpha == '}'){
                stack.pop();
            }
            else {
                stack.push(alpha);
            }
        }
        return stack.isEmpty();
    }
}
