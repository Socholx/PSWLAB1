import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zad2{
    public static void main(String[] args) {
        Set<Integer> unikalneLiczby = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadzaj liczby całkowite (wpisz 'q' aby zakończyć):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }

            try {
                int liczba = Integer.parseInt(input);
                unikalneLiczby.add(liczba);
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawny format liczby. Spróbuj ponownie.");
            }
        }

        int liczbaUnikalnych = unikalneLiczby.size();
        System.out.println("Liczba unikalnych liczb: " + liczbaUnikalnych);
    }
}
