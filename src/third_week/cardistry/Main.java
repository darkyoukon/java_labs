package third_week.cardistry;

public class Main {

    public static void main(String[] args) {
        Deck sample = new Deck();
//        sample.shuffle();
        sample.drawOne();
        Card smp = sample.drawOne();
        System.out.println(smp.getSuit().getName() + " " + smp.getRank().getName());
    }
}