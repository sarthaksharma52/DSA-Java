package Stack;

import java.util.Scanner;

public class Stackprogram {
    private int[] stackarr;
    private int capacity;
    private int top;

    public Stackprogram(int size){
        stackarr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        top++;
        stackarr[top] = val;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stackarr[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public void show(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("Elements in Stack are:-");
        for (int i = 0; i <= top; i++) {
            System.out.println(stackarr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of stack");
        int size = sc.nextInt();

        Stackprogram Stack = new Stackprogram(size);

        Stack.push(22);
        Stack.push(25);
        Stack.push(77);
        Stack.show();
        Stack.pop();

    }
}
