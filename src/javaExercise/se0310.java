package javaExercise;
import java.util.Scanner;
import java.util.Stack;

public class se0310 {
//斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。

   /* public static int Fibonacci(int n) {

        if(n<=0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println(Fibonacci(a));
    }*/

    // 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
    //其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
    //不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
    //对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在

//即除去所有A【i】的值相乘
       /* public int[] multiply ( int[] A){
            int[] B = new int[A.length];
            int temp = 0;
            for (int i = 0; i < A.length; i++) {
                temp = A[i];
                A[i] = 1;
                B[i] = 1;
                for (int j = 0; j < A.length; j++) {
                    B[i] *= A[j];
                }
                A[i] = temp;
            }
            return B;
        }*/

   /* Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);

    }

    public int pop() {

        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Quque is empty");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }*/


    public static void main(String[] args) {
        int[] a={3,4,5,1,2};
        for(int i=0;i<a.length;i++){
            int m=i/2;
            //int[] b=new int [a.length];
            if(i>m){
                a[m+i]=a[0];
            }else{
                a[i]=a[m+i];
            }
            System.out.println(a[i]);
        }

    }

}
