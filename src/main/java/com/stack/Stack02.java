package com.stack;

public class Stack02 {



    private  Integer[] arr;
    private int top;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(Integer size) {
        this.arr = new Integer[size];
    }


    public Integer[] getArr(){
        return arr;
    }
    public void push(int value) {
        arr[top] = value;
        top++;
    }
    public Integer peek(){
        if(isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }

        return arr[top-1];
    }

    public Integer pop(){
        if(isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }
        int value = arr[top-1];
        arr[top-1] = null;
        top--;
        return value;
    }

    public boolean isEmpty() {
        if(top == 0){
            return true;
        }else{
            return false;
        }
    }
}
