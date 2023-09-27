import java.util.LinkedList;
import java.util.Queue;
//Implement a stack using a single queue
public   class  SingleQueue {
    static class Stack{
        static Queue<Integer> q = new LinkedList<>();
        public static void push(int val){
            int size = q.size();
            q.add(val);
            for (int i = 0; i < size; i++){
                int x = q.remove();
                q.add(x);
            }
        }
        public static int pop(){
            if(q.isEmpty()){
                return -1;
            }
            int x = q.remove();
            return x;
        }
        public static int top(){
            if(q.isEmpty()){
                System.out.println("No elemnets");
                return -1;
            }
            int x = q.peek();
            return x;
        }
        public boolean isEmpty(){
            return q.isEmpty();
        }
        public static void main(String args[]){
            Stack stack = new Stack();
            stack.push(20);
            stack.push(30);
            System.out.println("The pop element : " + stack.pop());
            stack.push(50);
            System.out.println("The top element :" + stack.top());

        }
    }
}
