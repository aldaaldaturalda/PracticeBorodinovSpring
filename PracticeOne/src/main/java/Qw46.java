//Реализуйте метод isLeapYear(), который определяет является ли год високосным или нет.
// Год будет високосным, если он кратен (то есть делится без остатка) 400 или он одновременно кратен 4 и не кратен 100.
// Как видите, в определении уже заложена вся необходимая логика, осталось только переложить её на код:
public class Qw46 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(500));

    }
    public static boolean isLeapYear( int name){
         return  name % 400 == 0  || (name % 4 == 0)  && (name % 100 != 0)   ;

    }
}
// Проверяем что number кратен 10
//        number % 10 == 0
//
// Проверяем что number не кратен 10
//        number % 10 != 0