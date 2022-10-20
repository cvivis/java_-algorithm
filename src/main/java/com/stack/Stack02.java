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
    public Integer pop(){
        return arr[top-1];
    }

    public Integer peek(){
        int value = arr[top-1];
        arr[top-1] = null;
        top--;
        return value;
    }

    public boolean isEmpty() {
        if(arr.length == 0){
            return true;
        }else{
            return false;
        }
    }
}
