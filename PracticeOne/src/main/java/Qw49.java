//Реализуйте метод normalizeUrl(), который выполняет так называемую нормализацию данных.
// Он принимает адрес сайта и возвращает его с https:// в начале.
//Метод принимает адреса в виде АДРЕС или https://АДРЕС, но всегда возвращает адрес в виде https://АДРЕС
//
//Можно использовать метод startsWith() чтобы проверить начинается ли строка с префикса https://.
// А потом на основе этого добавлять или не добавлять https://.
public class Qw49 {
    public static void main(String[] args) {
        System.out.println(normalizeUrl("https://ttFF5451f"));
    }
    public static String normalizeUrl(String website){
        if(website.startsWith("https://")){
            return website;
        }else {
            return "https://" + website.trim().toLowerCase();
        }
    }

}
