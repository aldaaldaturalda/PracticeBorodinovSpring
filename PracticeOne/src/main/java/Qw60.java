/*
Реализуйте статический метод App.makeItFunny(), который принимает на вход строку и возвращает её копию,
у которой каждый n-ный элемент переведен в верхний регистр. n – задается на входе в функцию.
Для определения каждого n-ного элемента понадобится остаток от деления %. Подумайте, как его можно использовать.
 */
public class Qw60 {
    public static void main(String[] args) {
        System.out.println(makeItFunny("Do you do Local or Do it Well",1));
    }
    public static String makeItFunny(String str, int n) {
        var i = 0;
        StringBuilder result = new StringBuilder();
        while (i < str.length()) {
            var current = str.charAt(i); //current - текущее значение
            if ((i + 1) % n == 0) {
                result.append(Character.toUpperCase(current));
            } else {
                result.append(current);
            }
            i++;
        }
        return result.toString();
    }

}
