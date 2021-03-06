import java.util.ArrayList;
import java.util.List;

public class Coordinate {

    List<Pointer> pointers = new ArrayList<>();

    public void addPointers(String twoNums) {
        if (pointers.size() > 1) {
            throw new IllegalStateException("이미 저장된 좌표가 존재합니다.");
        }

        String[] pointerArr = twoNums.split("-");

        for (String strPointer : pointerArr) {
            Pointer pointer = createPointer(strPointer);
            pointers.add(pointer);
        }
    }

    public Pointer createPointer(String strNum) {
        String[] numArr = strNum.split(",");

        // 여기서 트캐를 해야하나 (암튼 예외처리가 필요함)
        int x = Util.strToInt(numArr[0]);
        int y = Util.strToInt(numArr[1]);

        return new Pointer(x, y);
    }

    public double getDistanceBetweenTwoPointers() {
        Pointer p1 = pointers.get(0);
        Pointer p2 = pointers.get(1);

        int[] posDiffs = p1.subtract(p2);
        return Math.sqrt(Math.pow(posDiffs[0], 2) + Math.pow(posDiffs[1], 2));
    }

    public boolean isPositionRightPlace(int x, int y) {
        return pointers.stream().anyMatch((pointer) -> pointer.equals(new Pointer(x, y)));
    }

    @Override
    public String toString() {
        return pointers.get(0).toString() + " / " + pointers.get(1).toString();
    }
}
