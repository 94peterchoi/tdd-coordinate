import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class CoordinateTest {

    @Test
    @DisplayName("x,y 좌표를 입력받는다")
    void getCoordinate() {
        String strPtr = "10,10";
        String[] numArr = strPtr.split(",");

        assertThat(numArr.length).isEqualTo(2);
        assertThat(Util.strToInt(numArr[0])).isEqualTo(10);
        assertThat(Util.strToInt(numArr[1])).isEqualTo(10);

        strPtr = "(10,10)";
        numArr = strPtr.split(",");

        int x = Util.strToInt(numArr[0]);
        int y = Util.strToInt(numArr[1]);

        Pointer pointer = new Pointer(x, y);
        assertThat(pointer.toString()).isEqualTo("x:10, y:10");

    }


    @Test
    @DisplayName("입력받은 문자열을 가지고 좌표 2개를 만든다")
    void getTwoCoordinates() {
        String strPtrs = "(10,10)-(1,4)";

        Coordinate coordinate = new Coordinate();
        coordinate.addPointers(strPtrs);
        assertThat(coordinate.toString()).isEqualTo("x:10, y:10 / x:1, y:4");

        strPtrs = "(5,6)-(7,8)";

        Coordinate coordinate2 = new Coordinate();
        coordinate2.addPointers(strPtrs);
        assertThat(coordinate2.toString()).isEqualTo("x:5, y:6 / x:7, y:8");
    }


    @Test
    @DisplayName("두 좌표 사이의 거리를 구한다")
    void getDistanceBetweenTwoPointers() {
        String strPtrs = "(3,4)-(3,4)";
        Coordinate coordinate = new Coordinate();
        coordinate.addPointers(strPtrs);
        double distance = coordinate.getDistanceBetweenTwoPointers();

        assertThat(distance).isEqualTo(0, offset(0.09));


        strPtrs = "(10,10)-(14,15)";
        Coordinate coordinate2 = new Coordinate();
        coordinate2.addPointers(strPtrs);
        distance = coordinate2.getDistanceBetweenTwoPointers();

        assertThat(distance).isEqualTo(6.403124, offset(0.09));
    }

    @Test
    @DisplayName("좌표 출력 테스트")
    void printPointers() {

        List<Pointer> pointers = new ArrayList<>();
//        pointers.add(new Pointer(1, 1));
//        pointers.add(new Pointer(1, 1));
//        pointers.add(new Pointer(3, 4));
//        pointers.add(new Pointer(5, 7));
//        pointers.add(new Pointer(9, 9));
//        pointers.add(new Pointer(17, 20));

        String strPtrs = "(10,10)-(14,15)";
        Coordinate coordinate = new Coordinate();
        coordinate.addPointers(strPtrs);

        ResultView.printPointers(coordinate);
        System.out.println(coordinate.getDistanceBetweenTwoPointers());

        System.out.println();
        System.out.println();

        strPtrs = "(1,1)-(17,20)";
        Coordinate coordinate2 = new Coordinate();
        coordinate2.addPointers(strPtrs);

        ResultView.printPointers(coordinate2);
        System.out.println(coordinate2.getDistanceBetweenTwoPointers());

    }




}
