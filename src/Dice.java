import java.util.Random;

public class Dice {


    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public void turns(){
        int total = 0;
        int NUMBER_OF_TURNS = 5;
        int SPACES_TO_WIN = 20;

        for(int i = 1; i <= NUMBER_OF_TURNS; i++) {
            System.out.println("#" + i + " " + "You Rolled a" + " " + randomNumber());
            total += randomNumber();
        }
            System.out.println("Your total is " + total +"!");


        if(total == SPACES_TO_WIN){
                System.out.println("YOU WIN!");
            } else{
                System.out.println("You Lose:(");
            }
        }




    }






