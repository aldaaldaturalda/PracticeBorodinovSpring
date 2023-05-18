import org.apache.maven.surefire.shared.utils.StringUtils;

public class Qw44 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aga"));

    }
    public static boolean isPalindrome(String word ){
        String reversedWord = StringUtils.reverse(word);
        return  word.equalsIgnoreCase(reversedWord);
    }
}
