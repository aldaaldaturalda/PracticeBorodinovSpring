/*
 Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение и возвращает зашифрованное.
 */

public class Qw62 {
    public static void main(String[] args) {
        System.out.println(encrypt("attack"));
    }
    public static String encrypt(String str) {
        StringBuilder result = new StringBuilder();
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result.append(nextSymbol).append(str.charAt(i));
        }return result.toString();
    }
}