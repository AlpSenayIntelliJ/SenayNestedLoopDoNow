public class Main {
    public static void main(String[] args) {
        System.out.println("                Multiplication Table           ");
        System.out.print("  ");
        for (int col = 1; col <= 12; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println("\n---------------------------------------------------");

        for (int col = 1; col <= 12; col++) {
            System.out.printf("%2d", col);
            System.out.printf("%2s", "|");
            for (int row = 1; row <= 12; row++) {
                System.out.printf("%4d", row*col);
            }
            System.out.println();
        }
    }
}
