package pl.sda.maven;

import java.util.Scanner;

public class KlasaWojtek2 {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imię");
        Scanner scanner = new Scanner(System.in);
        String imię = scanner.next();

        System.out.println("Podaj swoje drugie imię");
        String drugieImię = scanner.next();

        System.out.println("Podaj liczbę zmiennoprzecinkową");
        double liczba = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę zmiennoprzecinkową");
        double drugaLiczba = scanner.nextDouble();

        double różnica = liczba - drugaLiczba;
        double suma = liczba + drugaLiczba;

        System.out.println("Hej " + imię + " " + drugieImię + "!" + " Suma tych liczb wynosi: " + suma + "," + " a różnica" + różnica );

        //zmiany które chcisałbym zmergeować
               // dopisane


    }
}