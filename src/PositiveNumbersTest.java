import java.util.ArrayList;
import java.util.Collections;

public class PositiveNumbersTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        NumbersFactory.addNumbers(numbers);
        NumbersFactory.reverseNumbers(numbers);
        NumbersFactory.showSum(numbers);


        Collections.sort(numbers);
        System.out.println("\nNajmniejsza wprowadzona liczba to " + numbers.get(0));
        System.out.println("\nNajwiększa wprowadzona liczba to " + numbers.get(numbers.size() - 1));

    }
}
