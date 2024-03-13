import java.util.Stack;

public class paranthesis {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String input1 = "({[]})";
        String input2 = "({[})";
        
        System.out.println("Is input1 balanced? " + isValid(input1));
        System.out.println("Is input2 balanced? " + isValid(input2));
    }
}
