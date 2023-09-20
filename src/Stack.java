//public class Stack {
//    static int top;
//     static int size;
//    static char[] a;
//
//    Stack(int n){
//        this.top = -1;
//        this.size = n;
//        this.a = new char[size];
//    }
//     boolean push(char x){
//        if(top >= size){
//            System.out.println("Stack is overflow");
//        }
//        else {
//            top++;
//            a[top] = x;
//        }
//        return true;
//    }
//    char pop() {
//        char x = '0' ;
//        if (top < 0) {
//            System.out.println("Stack is underflow");
//        } else {
//            top--;
//             x = a[top];
//        }
//        return x;
//    }
//
//    }
//
//
//
