//На электронной карте Вестероса, которую реализовал Сэм,
// союзники Старков отображены зеленым кружком, враги — красным, а нейтральные семьи — серым.
//Напишите для Сэма метод whoIsThisHouseToStarks(), который принимает на вход фамилию семьи и
//возвращает одно из трех значений: "friend", "enemy", "neutral".

public class Qw50 {
    public static void main(String[] args) {
        System.out.println(whoIsThisHouseToStarks("FrEy"));

    }
    public static String whoIsThisHouseToStarks(String colour){
        if ("Karstark".equalsIgnoreCase(colour) || "Tally".equalsIgnoreCase(colour)) {
            return "friend";
        } else if ("Lannister".equalsIgnoreCase(colour) || "Frey".equalsIgnoreCase(colour)) {
            return "enemy";
        }
        return "neutral";
    }

}
