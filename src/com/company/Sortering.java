package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] ord = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Indtast dit ord: ");
            ord[i] = sc.next();
        }
        Arrays.sort(ord, Collections.reverseOrder());

        System.out.println(Arrays.toString(ord));

    }
}
