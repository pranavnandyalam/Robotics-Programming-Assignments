import java.util.Scanner;

public class assignment6 {
        public static void guessingGame() {
            try (Scanner hm = new Scanner(System.in)) {
                int number = 1 +(int) (100 * Math.random());
                int i = 1000;
                int l, guess;

                for(l = 1; l < i; l++) {
                    System.out.println("Guess the number:");
                    guess = hm.nextInt();

                    if (guess == number) {
                        System.out.println("Nice, you got it");
                        System.out.println("Number of tries: " + l);
                        break;
                    }
                    else if (guess > number) {
                        System.out.println("Too high");
                    }
                    else if (guess<number) {
                        System.out.println("Too low");
                    }
                }
            }
        }

            public static void main(String args[]) {
                guessingGame();
        }
}
