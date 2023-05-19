/*
Метод из теории учитывает регистр букв. То есть A и a с его точки зрения разные символы.
 Реализуйте вариант этого же метода, так чтобы регистр букв был не важен:
App.countChars("HexlEt", 'e'); // 2
App.countChars("HexlEt", 'E'); // 2
 */

public class Qw57 {
    public static void main(String[] args) {
        System.out.println(countChars("HexlEt", 'e'));

    }
    public static int countChars(String str, int num) {
        int i = 0;
        int count = 0;
       while (i<str.length()){
           int currentInt = Character.toLowerCase(str.charAt(i));
           if (currentInt == Character.toLowerCase(num)){
               count = count+1;
           }
           i = i+1;
       }return count;
        }
    }
