public class Qw48 {
    public static void main(String[] args) {
        System.out.println(getSentenceTone("ПРИВЕТ"));

    }
    public static String getSentenceTone(String type){
       if(type.toUpperCase().equals(type)) {
           return "scream";
       }else {
           return "normal";
       }
        }
}
