/* Реализуйте статический метод filterString(), принимающую на вход строку и символ, и возвращающую новую строку,
в которой удален переданный символ во всех его позициях.
 */
public class Qw59 {
    public static void main(String[] args) {
        System.out.println(filterString("If I look back I am lost",'I'));
    }
    public static String filterString(String str, char ch) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result.append(currentChar);
            }
            i += 1;
        }
        return result.toString();
    }

}
