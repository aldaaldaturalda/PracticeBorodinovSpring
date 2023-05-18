import java.time.LocalDate;

//Реализуйте метод notToday(), который проверяет что переданная дата это не сегодняшнее число:
//Для получения текущей даты в виде строки: LocalDate.now().toString().
public class Qw47 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(2023, 5, 18);
        LocalDate date2 = LocalDate.of(2023, 5, 19);
        boolean isNotToday1 = notToday(date1, today);
        boolean isNotToday2 = notToday(date2, today);
        System.out.println(date1 + " is not today? " + isNotToday1);
        System.out.println(date2 + " is not today? " + isNotToday2);
    }

    public static boolean notToday(LocalDate date, LocalDate today) {
        return !date.isEqual(today);
    }
//        public static boolean notToday(String dateAsString) {
//        var date = LocalDate.now();
//        return !dateAsString.equals(date.toString());
//    }
}
