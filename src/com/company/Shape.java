package com.company;

public class Shape {

    public static void main(String[] args) {
        Shape s = new Shape();
        s.builder(5, " j");
    }

    public void builder(int længde, String tegn){
        for (int i = 0; i < længde; i++){
            for (int j = 0; j < længde; j++){
                System.out.print( tegn + "    ");
            }
            System.out.println();
        }
    }
}

