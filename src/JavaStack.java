import java.util.*;

public class JavaStack {

   // private static final Deque<Character> sQueue = new ArrayDeque<>();

    private static boolean isBalanced(String str) {

        Deque<Character> sQueue = new ArrayDeque<>();
        int len = str.length();
        boolean failed = false;
        for (int ix = 0; !failed && ix < len; ++ix) {
            char currChar = str.charAt(ix);
            switch (currChar) {
                case '(':
                case '[':
                case '{':
                    sQueue.addFirst(currChar);
                    break;
                case ']':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '[');
                    break;
                case ')':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '(');
                    break;
                case '}':
                    failed = sQueue.size() == 0 || (sQueue.removeFirst() != '{');
                    break;
                default:
                    failed = true;
                    break;
            }
        }
        failed |= (sQueue.size() != 0);
        return !failed;
    }



    public void isbalanced2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            Stack<Character> stack = new Stack<>();
            String line = scanner.nextLine();
            for(char c : line.toCharArray()) {
                if(c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                }

                if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }

                if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }

                if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                    continue;
                }

                if(c == '}' || c == ')' || c == ']') {
                    stack.push(c);
                    break;
                }
            }
            System.out.println(stack.isEmpty());
        }
    }




    public static void main(String[] args) {

        String s = "({()})";
        boolean statement = false;
        int a = 10;
        int b = 20;



        System.out.println(isBalanced(s));

    }


}
