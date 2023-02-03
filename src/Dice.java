import java.util.Random;

public class Dice {
    private final int NUMBER_OF_SIDES = 6;
    private final int NUMBER_OF_TURNS = 5;
    private final int SPACES_TO_WIN = 20;


    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public void turns(){
        int total = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("#" + i + " " + "You Rolled a" + " " + randomNumber());
            total += randomNumber();
        }
            System.out.println("Your total is " + total +"!");
        }



    }






