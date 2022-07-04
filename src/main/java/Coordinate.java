import java.util.ArrayList;
import java.util.List;

public class Coordinate {

    List<Pointer> pointers = new ArrayList<>();

    public void makeTwoPointers(String twoNums) {
        String[] pointerArr = twoNums.split("-");
        Pointer pointer1 = makePointer(pointerArr[0]);
        Pointer pointer2 = makePointer(pointerArr[1]);

        pointers.add(pointer1);
        pointers.add(pointer2);
    }

    public Pointer makePointer(String strNum) {
        String[] numArr = strNum.split(",");

        // 여기서 트캐를 해야하나
        int x = Util.strToInt(numArr[0]);
        int y = Util.strToInt(numArr[1]);

        return new Pointer(x, y);
    }

    @Override
    public String toString() {
        return pointers.get(0).toString() + " / " + pointers.get(1).toString();
    }
}
