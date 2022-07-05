public class PointerApp {
    public static void main(String[] args) {

        System.out.print("   |");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println("\n---+---------------------------");

        for (int x = 1; x <= 9; x++) {
            System.out.printf("%2d |", x);
            for (int y = 1; y <= 9; y++) {
                if ((x == 1 && y == 3) || (x == 4 && y ==9)) {
                    System.out.printf("%3s", "·");
                } else {
                    System.out.printf("%3s", "");
                }
            }
            System.out.println();
        }

    }
}
