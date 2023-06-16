import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Random random = new Random();
        int szukanaLiczba = random.nextInt(100) + 1; // Losowanie liczby z zakresu od 1 do 100
        int zgadnieteLiczby = 0;
        boolean znaleziono = false;


        while (!znaleziono) {
            System.out.print("Podaj liczbę: ");
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            zgadnieteLiczby++;

            if (liczba < szukanaLiczba) {
                System.out.println("Szukana liczba jest większa.");
            } else if (liczba > szukanaLiczba) {
                System.out.println("Szukana liczba jest mniejsza.");
            } else {
                System.out.println("Brawo! Zgadłeś liczbę " + szukanaLiczba + " po " + zgadnieteLiczby + " próbach.");
                znaleziono = true;
            }
        }
    }
}