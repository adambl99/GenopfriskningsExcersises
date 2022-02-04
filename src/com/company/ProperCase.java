package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class ProperCase {
    public static void main(String[] args) {
        ProperCase properCase = new ProperCase();
        System.out.println(Arrays.toString(properCase.properCase("HEJ med dig")));

    }
    public ProperCase(){

}
public String[] properCase(String sætning){

        String[] array = sætning.split(" ");

        for (int i = 0; i < array.length; i++){
            if (array[i].length() > 3){
                String bogstav1 = array[i].substring(0,1).toUpperCase();
                String restOrd = array[i].substring(1).toUpperCase();
                array[i] = bogstav1 + restOrd;
            } else if (array[i].length() <= 3 && !Objects.equals(array[i], array[i].toUpperCase())){
                array[i] = array[i].toLowerCase();
            }
        }
        return array;
}





}
