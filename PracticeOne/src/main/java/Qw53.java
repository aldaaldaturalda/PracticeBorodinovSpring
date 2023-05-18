//Модифицируйте метод printNumbers() так, чтобы она выводила числа в обратном порядке.
// Для этого нужно идти от верхней границы к нижней.
// То есть счётчик должен быть инициализирован максимальным значением, а в теле цикла его нужно уменьшать до нижней границы.
public class Qw53 {
    public static void main(String[] args) {
        printNumbers(4);

    }
    public static void printNumbers(int firstNumber) {
        var i = firstNumber;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
    }

}
