import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorByMisha {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);
    }

    public static String calc(String input) throws Exception {
        Pattern pattern  = Pattern.compile("(\\d+) ([\\+\\-\\*\\/] \\d+)*");
        Matcher matcher = pattern.matcher(input);
        boolean isCheck = matcher.matches();
        if (!isCheck){
            throw new Exception("Неверное математическое выражение");
        }
        String[] split = input.split(" ");
        List<String> marks = List.of("+", "-", "/", "*");
        int number1 = Integer.parseInt(split[0]);
        int number2 = Integer.parseInt(split[2]);
        String arg = split[1];
        if (number1 < 1 || number1 > 10) {
            throw new Exception("Число не может быть меньше одного либо больше десяти");
        }
        if (number2 < 1 || number2 > 10) {
            throw new Exception("Число не может быть меньше одного либо больше десяти");
        }
//        if (!marks.contains(arg)) {
//            throw new Exception("");
//        }
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

