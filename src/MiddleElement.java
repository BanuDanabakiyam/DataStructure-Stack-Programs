import java.util.Stack;
import java.util.Vector;

public class MiddleElement {

    public static void main(String args[]) {
        Stack <Character> st = new Stack<Character>();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        st.push('8');

        Vector<Character> vector = new Vector<Character>();
        while(!st.empty()) {
            vector.add(st.pop());
        }
        int n = vector.size();
        if( n % 2 == 0) {
            int target = (n / 2);
            for (int i = 0; i < n; i++) {
                if (i == target)
                    continue;
                st.push(vector.get(i));

            }
        }

        else {
            int target = (int) Math.ceil(n / 2);
            for (int i = 0; i < n; i++) {
                if (i == target)
                    continue;
                st.push(vector.get(i));
            }
        }
            while (!st.empty()) {
                char p = st.pop();
                System.out.println("After middle element deleted: " + p);
            }
        }


    }

