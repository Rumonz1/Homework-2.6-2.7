public class Main {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса боксёров составила     " + differenceBoxersWeight + " кг!");
        differenceBoxersWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница веса боксёров составила     " + differenceBoxersWeight + " кг!");
    }
}