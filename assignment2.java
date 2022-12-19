public class assignment2 {
    public static void main (String[] args) {
        for (int y=0; y<=100; y++) {
            if (y%3 ==0)
                System.out.println("Fizz");
            else if (y%5 == 0) {
                System.out.println("Buzz");
            }
            else if ((y%5 == 0) && (y%3 == 0)) {
                System.out.println("Fizz Buzz");
            }
            else {
                String num = Integer.toString(y);
                num = num.replace("3 ", "Fizz");
                System.out.println(num);
            }
        }
    }
}