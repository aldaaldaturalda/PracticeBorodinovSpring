/*Реализуйте метод multiplyNumbersFromRange(), который перемножает числа в указанном диапазоне
включая границы диапазона. Пример вызова: multiplyNumbersFromRange(1, 5); // 1 * 2 * 3 * 4 * 5 = 120
 */
public class Qw54 {
    public static void main(String[] args) {
        System.out.println(multiplyNumbersFromRange(1,5));

    }
    public static int multiplyNumbersFromRange(int start, int finish){
        int i = start;
        int sumOf = 1;
        while (i<=finish){
            sumOf = sumOf*i;
            i = i+1;
        }
        return sumOf;
        }
    }

