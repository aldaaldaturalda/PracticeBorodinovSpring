import java.util.List;
import java.util.Scanner;

public class CalculatorByMisha {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);
    }

    public static String calc(String input) throws Exception {
        String[] split = input.split(" ");
        List<String> marks = List.of("+", "-", "/", "*");
        int number1 = Integer.parseInt(split[0]);
        int number2 = Integer.parseInt(split[2]);
        String arg = split[1];
        if (number1 < 1 || number1 > 10) {
            throw new Exception();
        }
        if (number2 < 1 || number2 > 10) {
            throw new Exception();
        }
        if (!marks.contains(arg) || split.length != 3) {
            throw new Exception();
        }
        int result;
        switch (arg) {
            case "+" -> result = number1 + number2;
            case "-" -> result = number1 - number2;
            case "*" -> result = number1 * number2;
            case "/" -> result = number1 / number2;
            default -> throw new IllegalArgumentException("Неверный знак операции");
        }
        return String.valueOf(result);
    }
}

