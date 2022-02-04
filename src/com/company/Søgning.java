package com.company;

import java.util.Scanner;

public class Søgning {

    public static void main(String[] args) {

    Søgning søgning = new Søgning();
    String[] strArray = new String[]{"Adam", "Peter", "Mille", "William", "Oskar"};

        System.out.println(søgning.Søgning(strArray, "Hello"));


    }
    public int Søgning(String[] ordArray, String søgeOrd) {

        int index = -1;
        try {
            for (int i = 0; i < ordArray.length; i++) {
                if (ordArray[i].equals(søgeOrd)) {
                    return i;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return index;
    }

}
