package io.github.joaopepe10;

import java.util.Arrays;
import java.util.List;

public class MaiorQue {

     static void maiorQue(Integer i){
        if (i > 8){
            System.out.println("Esse " + i +" numero e maior!");
        }
        System.out.println("Esse " + i +" numero e menor!");
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 4, 65, 9,656 ,67, 12);
        nums.forEach(x->maiorQue(x));
    }
}
