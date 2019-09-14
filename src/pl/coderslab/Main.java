package pl.coderslab;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randonNumber = random.nextInt(10);
        System.out.println("Zgadnij liczbę:");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Nie podałeś liczby. Spróbuj jeszcze raz:");
        }
        int userNumber = scanner.nextInt();
        boolean result = false;
        while (result == false) {
            if (randonNumber == userNumber){
                result = true;
                System.out.println("Zgadłeś!");
                }else if (randonNumber > userNumber) {
                    result = false;
                    System.out.println("Za mało! Zgaduj dalej:");
                    userNumber = scanner.nextInt();
                } else if (randonNumber < userNumber) {
                     result = false;
                    System.out.println("Za dużo! Zgaduj dalej:");
                    userNumber = scanner.nextInt();
                }
        }
    }
}
