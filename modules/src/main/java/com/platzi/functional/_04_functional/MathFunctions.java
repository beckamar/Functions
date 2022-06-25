package com.platzi.functional._04_functional;

import java.util.function.Function;

public class MathFunctions{


    public static void main(String[] args) {

        //go to definition or ctrl + (select Function)
        Function<Integer, Integer> squareFunction = new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer x) {
                // TODO Auto-generated method stub
                return x*x;
            }
        };

        //Invocando funcion
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));
        System.out.println(square(5));
    }

    //Utilizando un método para realizar lo mismo en lugar de una funcion

    public static int square (int x){
        return x * x ;
    }
}