public class assignment1 {
    public static void main(String[] args) {
        System.out.println(" ");
        for(int y=1; y<=12; y++) {
            System.out.printf("%5d", y);
        }
        System.out.println();
        for(int x=1; x<=12; x++) {
            System.out.print(x );
            for(int i=1; i<=12; ++i) {
            System.out.printf("%5d", x*i);
            }
            System.out.println();
        }
    }
}