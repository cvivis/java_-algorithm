package com.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @Test
    void pushTest(){
        Stack01 stack01 = new Stack01(100);
        stack01.push(1);
        stack01.push(2);

        int[] arr = stack01.getArr();
        Assertions.assertEquals(1,arr[0]);
        Assertions.assertEquals(2,arr[1]);

        stack01.pop();
        Assertions.assertEquals(2,arr[1]);

    }

    @Test
    void pushAndPopTest(){
        Stack01 stack01 = new Stack01(100);
        stack01.push(1);
        stack01.push(2);

        Assertions.assertEquals(2,stack01.pop());
        Assertions.assertEquals(1,stack01.pop());


    }

}