package Stack;

class Stack {
    int top;
    int size;
    int a[];
//    boolean isEmpty()
//    {
//        return (top < 0);
//    }


    Stack(int n) {
        this.top = -1;
        this.size = n;
        this.a = new int[this.size];
    }
    boolean push(int x){
        if(top >= size){
            System.out.println("Stack overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }

    }
    int pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
}


class Main{
    public static void reverse(int arr[], int n){
        Stack stack = new Stack(n);
        for(int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for(int i = 0; i < n; i++) {
             arr[i] = stack.pop();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Reversed Items " + arr[i]);
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int arr[] = new int[] {100,200,300,400,500};
        reverse(arr, n);
    }
}

