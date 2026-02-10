package Exercise;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "{[()]}";
        if (yoxla(input)) {
            System.out.println("Balanslıdır !");
        } else {
            System.out.println("Balanssızdır !");
        }
        
    }
    public static boolean yoxla(String str){
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c=='}' || c ==')') {
                if (stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                if (c == ']' && pop != '['
                || c == '}' && pop != '{'
                || c == ')' && pop != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

