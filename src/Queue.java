import java.util.Stack;

//How to implement a queue by using two stacks
public class Queue {
    static Stack<Integer> s1 = new Stack<Integer>();
   static Stack<Integer> s2 = new Stack<Integer>();


    public static void enQueue(int x){
        while (!s1.isEmpty()){
            s2.push(s1.pop());

        }
        s1.push(x);

        while (!s2.empty()){
            s1.push(s2.pop());
        }
    }
    public static int deQueue(){
        if(s1.isEmpty()){
            return -1;
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());


    }
}
