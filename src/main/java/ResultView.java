import java.util.List;

public class ResultView {
    public static void printPointers(Coordinate coordinate) {

        System.out.print("   |");

        for (int i = 1; i <= 24; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println("\n---+-------------------------------------------------------------------------");

        for (int x = 1; x <= 24; x++) {
            System.out.printf("%2d |", x);
            for (int y = 1; y <= 24; y++) {
                if (coordinate.isPositionRightPlace(x, y)) {
                    System.out.printf("%3s", "★");
                } else {
                    System.out.printf("%3s", "");
                }
            }
            System.out.println();
        }
    }


}
