/*
Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра), содержит ли строка указанную букву.
Метод принимает два параметра: Строка, Буква для поиска
 */
public class Qw61 {
    public static void main(String[] args) {
        System.out.println(hasChar("Renly", 'R'));
    }
    public static boolean hasChar(String str, char ch) {
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }
            i += 1;
        }
        return false;
    }

}
