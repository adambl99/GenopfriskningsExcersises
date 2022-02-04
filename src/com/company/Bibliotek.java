package com.company;

import java.util.ArrayList;

public class Bibliotek {
    public static void main(String[] args) {
        Bibliotek bibliotek = new Bibliotek();
        Bog bog = new Bog(1092, "Submarino", 2007);
        System.out.println(bibliotek.checkBogliste(bog));
    }

    ArrayList<Bog> bogListe = new ArrayList<>();

    public Bibliotek(){
        bogListe.add(new Bog(1743, "Lord of the Flies", 1974));
        bogListe.add(new Bog(1982, "Animal Farm", 1977));
        bogListe.add(new Bog(1092, "Submarino", 2007));
    }
    public boolean checkBogliste(Bog bog){
        boolean checkedBook = false;
        for (Bog bog1 : bogListe){
            if (bog.getISBN() == bog1.getISBN()){
                checkedBook = true;
            } else {
                checkedBook = false;
            }
        }
        return checkedBook;

    }
}



    class Bog {
        int ISBN;
        String titel;
        int udgivelsesÅr;

        public Bog(int ISBN, String titel, int udgivelsesÅr){
            this.ISBN = ISBN;
            this.titel = titel;
            this.udgivelsesÅr = udgivelsesÅr;
        }

        public int getISBN() {
            return ISBN;
        }

        public void setISBN(int ISBN) {
            this.ISBN = ISBN;
        }

        public String getTitel() {
            return titel;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public int getUdgivelsesÅr() {
            return udgivelsesÅr;
        }

        public void setUdgivelsesÅr(int udgivelsesÅr) {
            this.udgivelsesÅr = udgivelsesÅr;
        }

        @Override
        public String toString() {
            return "ISBN = " + ISBN + " Titel = " + titel + " udgivelsesÅr = " + udgivelsesÅr;

        }
}
