package com.array;

public class GenericClass {

    public static void main(String[] args) {

        Integer [] intArrays = {1,3,4,6,7,8};
        Double [] doubleArrays = {2.5,4.5,5.5,6.5,8.8,3.5};
        Character[] charArrays = {'A', 'B', 'P', 'G'};
        String[] stringArrays = {"Dein", "John", "Bimpe"};

        //display(intArrays);
        //display(doubleArrays);
        //display(charArrays);
        //display(stringArrays);
        System.out.println(getFirst(intArrays));

    }

    public static <T> void display(T [] arr ){

        for (T i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T [] arr){
        return arr[0];
    }


}
