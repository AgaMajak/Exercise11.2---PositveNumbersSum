import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumbersFactory {
    private static int SUM;

    static void addNumbers(ArrayList<Integer> list) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 1) {
            System.out.println("Podaj dowolną liczbę całkowitą: ");
            int number = scan.nextInt();
            if (number >= 0) {
                SUM += number;
                list.add(number);
            } else {
                System.out.println("Podano liczbę mniejszą od zera, zakończono wczytywanie liczb od użytkownika.");
                i = 1;
            }
        }
        scan.close();
    }

    static void reverseNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> reverseNumbers = new ArrayList<>(list);
        Collections.reverse(reverseNumbers);
        System.out.print("\nLiczby wprowadzone przez użytkownika i wyświetlone w odwrotnej kolejności: ");
        for (Integer num : reverseNumbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();

    }

    static void showSum(ArrayList<Integer> list) {
        System.out.println("\nSuma wprowadzonych liczb:");
        for (Integer num : list) {
            if (num.equals(list.get(list.size() - 1))) {
                System.out.printf("%d=%d", num, SUM);
            } else {
                System.out.printf("%d+", num);
            }
        }
        System.out.println();
    }
}
