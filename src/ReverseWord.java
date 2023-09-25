import java.util.Stack;

public class ReverseWord {
    public static void reverse(String str){
        Stack <Character> stack = new Stack<Character>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));

            } else {
//                while (stack.isEmpty() == false){
//                    System.out.println(stack.pop());
//                }
                System.out.println(" ");
            }
        }
            while (stack.empty() == false){
                sb.append(stack.pop());

            }
        System.out.println(sb.toString());


    }

    public static void main(String []args) {
        String str = "Hello Welcome";
        reverse(str);



    }
}
