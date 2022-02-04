package com.company;

import java.util.Scanner;

public class Græs {
    double nuværendeHøjde;
    double maximumHøjde;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Græs græs = new Græs();
        System.out.println("Hvad er højden på dit græs?");
        double nuværendeHøjde = sc.nextDouble();
        System.out.println("Hvad er maximumhøjden du vil have på dit græs?");
        double maximumHøjde = sc.nextDouble();


        System.out.println("Dage til græsset skal slås: " + græs.skalGræssetSlås(nuværendeHøjde, maximumHøjde));
    }


    public Græs() {
    }

    public int skalGræssetSlås(double nuværendeHøjde, double maximumHøjde) {

        int counter = 1;

        while (nuværendeHøjde < maximumHøjde) {
            counter++;
            nuværendeHøjde = nuværendeHøjde + 0.8;
            if (maximumHøjde <= nuværendeHøjde)
                return counter;
        }
        return counter;
    }
}
