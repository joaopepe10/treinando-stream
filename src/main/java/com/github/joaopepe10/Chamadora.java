package com.github.joaopepe10;


import java.util.Arrays;
import java.util.Collection;

public class Chamadora {
    public static void main(String[] args) {
        Produto p1 = new Produto("Iphone 12", 1L);
        Produto p2 = new Produto("Iphone 13", 2L);
        Produto p3 = new Produto("Iphone 14", 3L);
        Produto p4 = new Produto("Iphone X", 4L);
        Produto p5 = new Produto("Iphone 11", 5L);
        Collection<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        System.out.println(produtos);

        System.out.println(produtos);
    }
}
