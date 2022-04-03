package pl.sda.maven;

import java.util.Scanner;

public class KlasaWojtek {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imię");
        Scanner scanner = new Scanner(System.in);
        String imię = scanner.next();

        System.out.println("Podaj swoje nazwisko");
        String nazwisko = scanner.next();

        System.out.println("Podaj swój numer buta");
        int numer = scanner.nextInt();

        System.out.println("Oj, " + imię + " " + nazwisko + " - ale masz nogę! Twój rozmiar to " + numer);
    }
}
