import java.util.Scanner;

public class assignment4 {
    public static void main (String args[]) {
        System.out.println("The first number in your problem");
        System.out.println(" ");
        try (Scanner number = new Scanner(System.in)) {
            String x = number.nextLine();
            double y = Integer.parseInt(x);

            System.out.println("The operation");
            System.out.println("");
            String a = number.nextLine();

            System.out.println("The second number in your problem");
            System.out.println(" ");
            String d = number.nextLine();
            double f = Integer.parseInt(d);

            System.out.println(" ");


            switch (a) {
                case "*":
                    double p = y*f;
                    System.out.println("The Answer is " + p);
                    break;
                case "/":
                 double u = y / f;
                 System.out.println("The Answer is " + u);
                 break;
                case "+":
                double w = y + f;
                System.out.println("The Answer is " + w);
                break;
                case "-":
                double e = y - f;
                System.out.println("The Answer is " + e);
                break;
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




    }

}
