import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie pierwszego zbioru
        System.out.print("Podaj elementy pierwszego zbioru (oddzielone przecinkami): ");
        String inputA = scanner.nextLine();
        Set<Integer> zbiorA = parseSet(inputA);

        // Wprowadzenie drugiego zbioru
        System.out.print("Podaj elementy drugiego zbioru (oddzielone przecinkami): ");
        String inputB = scanner.nextLine();
        Set<Integer> zbiorB = parseSet(inputB);

        // Wykonanie operacji
        Set<Integer> suma = new HashSet<>(zbiorA);
        suma.addAll(zbiorB);

        Set<Integer> roznicaAB = new HashSet<>(zbiorA);
        roznicaAB.removeAll(zbiorB);

        Set<Integer> czescWspolna = new HashSet<>(zbiorA);
        czescWspolna.retainAll(zbiorB);

        Set<Integer> roznicaSymetryczna = new HashSet<>(suma);
        roznicaSymetryczna.removeAll(czescWspolna);

        // Wyświetlenie wyników
        System.out.println("Suma zbiorów: " + suma);
        System.out.println("Różnica zbiorów A - B: " + roznicaAB);
        System.out.println("Część wspólna zbiorów: " + czescWspolna);
        System.out.println("Różnica symetryczna zbiorów: " + roznicaSymetryczna);
    }

    // Metoda pomocnicza do przekształcenia wprowadzonej sekwencji w zbiór liczb całkowitych
    private static Set<Integer> parseSet(String input) {
        Set<Integer> set = new HashSet<>();
        String[] elements = input.split(",");
        for (String element : elements) {
            try {
                int value = Integer.parseInt(element.trim());
                set.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawny format elementu. Pomijanie: " + element);
            }
        }
        return set;
    }
}