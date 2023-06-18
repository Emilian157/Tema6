package org.fasttrackit.tema6;

import java.util.Random;
import java.util.Scanner;

public class Tema6 {

    private static int[] numbers = new int[]{12, 3, 43, 24, 67, 22};

    private static String phrase = "Propozitia cu numarul 1.Propozitia cu numarul 2.Propozitia cu numarul 3.";
    public static void main(String[] args) {
        ex1(numbers);
        ex2(numbers);
        ex3(numbers);
        ex4();
        ex5();
        ex6(phrase);
    }

//    1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static void ex1(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

//2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
    public static void ex2(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " ");
            }
        }
    }

//    3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg.
//    Returnati toate numerele mai mari decat numarul primit
    public static void ex3(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int number : numbers) {
            if (num < number) {
                System.out.println(number);
            }
        }
    }

//    4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
//    Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita.
//    Cand ajungem la suma dorita afisam un mesaj de succes.
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a donation target: ");
        int donationTarget = scanner.nextInt();
        int donationTotal = 0;
        while (donationTarget > donationTotal) {
            Random random = new Random();
            int randomDonation = random.nextInt(500, 1000);
            donationTotal += randomDonation;
            System.out.println("New donation of " + randomDonation + " dollars!");
        }
        System.out.println("The donation target has been reached! ");
        System.out.println("We have reached " + donationTotal + " dollars!");
    }

//    5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii.
//    Cand acesta se termina, campania se va incheia
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a donation target: ");
        int donationTarget = scanner.nextInt();
        System.out.print("Enter a donations limit: ");
        int donationsLimit = scanner.nextInt();
        int donationTotal = 0;
        int donationNumber = 0;

        Random random = new Random();

        while (donationNumber < donationsLimit && donationTotal < donationTarget) {
            int randomDonation = random.nextInt(500, 1000);
            donationTotal += randomDonation;
            donationNumber++;
            System.out.println("New donation of " + randomDonation + " dollars!");
        }
        if (donationTotal >= donationTarget) {
            System.out.println("The donation target has been reached!");
        }else {
            System.out.println("The donation target has not been reached!");
        }
        System.out.println("We have reached " + donationTotal + " dollars!");
        System.out.println("The number of donations was " + donationNumber + "!");
    }

//    6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct).
//    Printati fiecare propozitie pe o linie noua
    public static void ex6(String phrase) {
        String[] sentences = phrase.split("\\.");
        for (String sentence : sentences) {
            String trimmedSentence = sentence.trim();
            if (!trimmedSentence.isEmpty()) {
                System.out.println(trimmedSentence);
            }
        }
    }
}






