import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner element = new Scanner(System.in);

        System.out.println("Please enter you first digit");
        String first_number = element.nextLine();

        System.out.println("Please enter you math operator");
        String math_op = element.nextLine();
        System.out.println("Please enter you second digit");
        String second_number = element.nextLine();

        boolean first_is_arabic = first_number.charAt(0) < 65;
        boolean second_is_arabic = second_number.charAt(0) < 65;

        if (first_is_arabic != second_is_arabic) {
            System.err.println("Both operands must be either arabic or roman digits");
            return;
        }

        if (!first_is_arabic) {
            RomanToArabic art = new RomanToArabic();
            first_number = art.ArabToRim(first_number);
            second_number = art.ArabToRim(second_number);
        }

        Calculator calc = new Calculator();
        System.out.println("Your answer is: " + calc.calc(first_number, math_op, second_number));
    }
}
