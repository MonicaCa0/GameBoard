public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Dice dice = new Dice();
        System.out.println("Welcome! Here you have 5 chances to roll an equal number of 20 to win the game");
        System.out.println("Any more or less, you lose!!");
        dice.turns();

    }
}