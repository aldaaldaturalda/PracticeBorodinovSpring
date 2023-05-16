//Реализуйте метод getHiddenCard(), который принимает на вход номер кредитки (состоящий из 16 цифр)
// в виде строки и возвращает его скрытую версию, которая может использоваться на сайте для отображения.
// Если исходная карта имела номер 2034399002125581, то скрытая версия выглядит так ****5581.
// Другими словами, функция заменяет первые 12 символов, на звездочки.
// Количество звездочек регулируется вторым необязательным параметром. Значение по умолчанию — 4.
public class Question42 {
    public static void main(String[] args) {
        System.out.println(getHiddenCard("2034399002125581"));
    }
            // BEGIN
            public static String getHiddenCard(String cardNumber, int starsCount) {
                String visibleDigitsLine = cardNumber.substring(12);
                return "*".repeat(starsCount) + visibleDigitsLine;
            }
            public static String getHiddenCard(String cardNumber) {
                return Question42.getHiddenCard(cardNumber, 4);
            }
            // END
        }