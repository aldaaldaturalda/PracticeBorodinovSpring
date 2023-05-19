//public static int abs(int number) {
//  return number >= 0 ? number : -number;
//}
//Общий шаблон выглядит так:
//
//<predicate> ? <expression on true> : <expression on false>

import org.apache.maven.surefire.shared.utils.StringUtils;

public class Qw51 {
    public static void main(String[] args) {
        System.out.println(convertString("hEllo"));
        System.out.println(convertString("аСАЛАМАЛЕЙКУМ"));
        System.out.println(convertString("АСАЛАМАЛЕЙКУМ"));
        System.out.println(convertString(""));

    }

    public static String convertString(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (Character.isLowerCase(str.charAt(0))) {
            return StringUtils.reverse(str);
        } else if (Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return str;
    }
    }