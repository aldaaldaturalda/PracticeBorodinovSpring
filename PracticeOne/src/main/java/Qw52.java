//Реализуйте метод getNumberExplanation(), который принимает на вход число и возвращает объяснение этого числа.
// Если для числа нет объяснения,то возвращается just a number. Объяснения есть только для следующих чисел:

public class Qw52 {
    public static void main(String[] args) {
        System.out.println(getExplanation(666));
    }
    public static String getExplanation(int count){
        return switch (count) {
            case 666 -> "devil number";
            case 42 -> "answer for everything";
            case 7 -> "prime number";
            default -> "just a number";
        };
    }
}
