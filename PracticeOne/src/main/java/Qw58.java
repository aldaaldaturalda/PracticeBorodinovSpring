/* Реализуйте такой же метод reverse(), но выполняющий обход строки не с первого элемента по последний, а наоборот,
от последнего к первому. Общая структура функции при этом останется такой же.
Изменится начальный индекс, условие окончания цикла, сборка новой строки и формирование нового индекса в цикле.*/
public class Qw58 {
    public static void main(String[] args) {
        System.out.println(reverse("Nikolay"));
        System.out.println("!!!!!!!!!");
        System.out.println(reverseLastSymbol("Nicolay"));

    }
    public static String reverse(String str) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < str.length()) {
            // Соединяем в обратном порядке
            result.insert(0, str.charAt(i));
            i += 1;
        }
        return result.toString();
    }
    public static String reverseLastSymbol(String str){
        int i = str.length() -1;
        StringBuilder result = new StringBuilder();
        while (i >= 0){
            result.append(str.charAt(i));
            i = i - 1;
        }
        return result.toString();
    }
}