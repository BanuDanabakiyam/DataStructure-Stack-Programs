import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class stackDeque {
    static void reverse(Stack<Integer> str){
        Deque<Integer> deque = new LinkedList<>();
        while (!str.isEmpty()){
            deque.add(str.peek());
            str.pop();
        }
        while (!deque.isEmpty()){
            str.push(deque.peek());
            deque.poll();

        }

    }

    public static void main(String[] args){
        Stack st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        reverse(st);

        System.out.println("REVERSE STACK : ");
        while (!st.isEmpty()){
            System.out.println(st.peek() + " ");
            st.pop();
        }
        System.out.println(" ");
    }
}
