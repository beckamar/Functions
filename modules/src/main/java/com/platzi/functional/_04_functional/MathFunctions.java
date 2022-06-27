package com.platzi.functional._04_functional;
import java.util.function.Function;
import java.util.function.Predicate;

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

    /*Definicion mas simple de la funcion
     * Recibe un entero y devuelve un boolean
    */
    Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
    System.out.println(isOdd.apply(5));


    /*PREDICATE
     * Especie de funcion que trabaja sobre un tipo pero genera un boolean, testea si algo es valido
     */

     Predicate<Integer> isEven = x -> x % 2 == 0;
    //Invocando funcion:
    System.out.println(isEven.test(4));

    /*Predicado que recibe un Student y nos dice que si aprobó
    Recibe un student y nos retornará si aprobó o no diciéndole que éste tiene que ser mayor o igual a 6
    */

    Predicate<Student> isApproved = student -> student.getCalificacion() >= 6-0;

    //Uso del predicate
    Student rebeca = new Student(5);
    System.out.println(isApproved.test(rebeca));


    public static class Student{
        private double calificacion;
        private String name;

        Student(double calificacion){
            this.calificacion = calificacion;
        }

        Student(Double calificacin, String name){
            this.calificacion = calificacion;
            this.name = name;
        }

        public double getCalificacion(){
            return calificacion;
        }
    }



    Function<Student,String> textAproved = student -> isApproved.test(student)?"Aprobado":"Reprobado";

        Student student2 = new Student(5.3, "Ana");
        System.out.println( "\nel student (%s): " + textAproved.apply(student2), student2.getNombre());

        Student student3 = new Student(6.0,"Pancho");
        System.out.println( "\nel student (%s): " + textAproved.apply(student3), student3.getNombre()); 


}