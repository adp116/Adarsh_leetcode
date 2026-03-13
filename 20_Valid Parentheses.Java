Problem: Given a string of brackets ()[]{}, determine if they are correctly matched and properly ordered.
Solution: Use a stack to store opening brackets and check that each closing bracket matches the most recent opening bracket. If all brackets match correctly and the stack is empty at the end, the string is valid.

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }

        return stack.isEmpty();
    }
}
