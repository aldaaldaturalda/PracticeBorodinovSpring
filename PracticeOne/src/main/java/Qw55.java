/* Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:
App.joinNumbersFromRange(1, 1); // "1"
App.joinNumbersFromRange(5, 10); // "5678910"
*/
public class Qw55 {
    public static void main(String[] args) {
        System.out.println(joinNumbersFromRange(5,10));

    }
    public static String joinNumbersFromRange(int start, int finish) {
        int i = start;
        String result = "";
        while (i <= finish){
            result = result + i;
            i =  i + 1;
        }
return result;
    }
}
