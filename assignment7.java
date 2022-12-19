import java.util.Scanner;
import java.util.Random;

public class assignment7 {
    public static void main (String args[]){
        
        Scanner cmp = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        int highNumber = 100;
        int leastNumber = 1;
        String myAnswer = "";

        do {
            randNum = rand.nextInt(highNumber - leastNumber + 1) + leastNumber;
            System.out.println("I think it is " + randNum);
            myAnswer = cmp.nextLine();

            if (myAnswer.equals("too low")) {
                leastNumber = randNum + 1;
            }
            else if (myAnswer.equals("too high")){
                highNumber = randNum - 1;
            }
            
        } while (!myAnswer.equals("yes"));
            cmp.close();
            System.out.println("I did it!");
        
    }
}
