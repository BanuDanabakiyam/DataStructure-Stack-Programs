import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisChecker {

    public static Boolean isChecker(String expression) {
        Deque<Character> stack = new ArrayDeque<Character>() ;

                for(int i = 0; i < expression.length(); i++) {
                    char checker = expression.charAt(i);
                    if(checker == '{' || checker == '[' || checker == '(') {
                        stack.push(checker);
                    }
                    if(stack.isEmpty()){
                        return false;
                    }
                    char check;
                    switch (checker) {
                        case '}':
                            check = stack.pop();
                            if(check == ']' || check == ')') {
                                return false;
                            }
                            break;
                        case ']' :
                            check = stack.pop();
                            if(check == '}' || check == ')') {
                                return false;
                            }
                            break;
                        case ')' :
                            check = stack.pop();
                            if(check == '}' || check == ']') {
                                return false;
                            }
                            break;
                    }
                }
                return stack.isEmpty();
    }
    public  static void main(String args[]) {
        String parenthesisChecker = "{]}";
        if(isChecker(parenthesisChecker)){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
}
