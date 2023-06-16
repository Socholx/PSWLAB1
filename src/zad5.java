import java.util.Scanner;

public class zad5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        boolean czyPierwsza = sprawdzCzyPierwsza(liczba);

        if (czyPierwsza) {
            System.out.println(liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println(liczba + " nie jest liczbą pierwszą.");
        }
    }

    private static boolean sprawdzCzyPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false;
            }
        }

        return true;
    }
}