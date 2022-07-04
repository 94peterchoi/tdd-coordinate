public class PointerApp {
    public static void main(String[] args) {

        System.out.print("   |");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                if ((i == 1 && j == 3) || (i == 4 && j ==9)) {
                    System.out.printf("%3s", "·");
                } else {
                    System.out.printf("%3s", "");
                }
            }
        }

    }
}
