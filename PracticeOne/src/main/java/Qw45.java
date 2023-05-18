public class Qw45 {
    public static void main(String[] args) {
        System.out.println(isInternationalPhone("80297345542"));
        System.out.println(isInternationalPhone("+375447345542"));

    }
            public static boolean isInternationalPhone(String phone){

                return phone.startsWith("+");
                // return phone.charAt(0) == '+'; либо так можно

            }
//            Qw45.isInternationalPhone("89602223423"); // false
//            Qw45.isInternationalPhone("+79602223423"); // true

        }
