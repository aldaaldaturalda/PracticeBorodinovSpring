import org.apache.maven.surefire.shared.utils.StringUtils;

/*
Реализуйте статический метод App.printReversedNameBySymbol(),
который печатает переданное слово посимвольно, как в примере из теории, но делает это в обратном порядке.
А второй метод посимвольно.
 */
public class Qw56 {
    public static void main(String[] args) {
        printReversedNameBySymbol("Arya");
        System.out.println("!!!!!");
        printNumbersBySymbol("Arya");
    }
    public static void printReversedNameBySymbol(String name){
        int i = name.length()-1;
        while (i>=0){
            System.out.println(name.charAt(i));
            i -= 1;
        }
    }
    public static void printNumbersBySymbol(String name){
        int i = 0;
        while (i<name.length()){
            System.out.println(name.charAt(i));
            i +=1;
        }
    }
}
