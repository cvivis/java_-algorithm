package com.stack;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = 0;
    public Stack01(int size){
        this.arr = new int[size];
    }
    public int[] push(int value){
        arr[this.pointer] = value;
        this.pointer++;
        return arr;
    }

    public int pop(){
        int value = arr[this.pointer-1];
        this.pointer--;
        return value;
    }

    public int[] getArr(){
        return arr;
    }
}
