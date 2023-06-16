import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj sekwencję binarną: ");
        String sekwencja = scanner.nextLine();

        int liczbaDziur = zliczDziuryBinarne(sekwencja);
        System.out.println("Liczba dziur binarnych: " + liczbaDziur);
    }

    private static int zliczDziuryBinarne(String sekwencja) {
        int liczbaDziur = 0;
        boolean wewnatrzDziury = false;

        for (int i = 1; i < sekwencja.length(); i++) {
            char obecnyZnak = sekwencja.charAt(i);
            char poprzedniZnak = sekwencja.charAt(i - 1);

            if (obecnyZnak == '0' && poprzedniZnak == '1') {
                wewnatrzDziury = true;
            }

            if (obecnyZnak == '1' && poprzedniZnak == '0' && wewnatrzDziury) {
                liczbaDziur++;
                wewnatrzDziury = false;
            }
        }

        return liczbaDziur;
    }
}