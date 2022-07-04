import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;


public class CoordinateTest {

    @Test
    @DisplayName("x,y 좌표를 입력받는다")
    void getCoordinate() {
        String twoNums = "10,10";
        String[] numArr = twoNums.split(",");

        assertThat(numArr.length).isEqualTo(2);
        assertThat(Util.strToInt(numArr[0])).isEqualTo(10);
        assertThat(Util.strToInt(numArr[1])).isEqualTo(10);

        twoNums = "(10,10)";
        numArr = twoNums.split(",");

        int x = Util.strToInt(numArr[0]);
        int y = Util.strToInt(numArr[1]);

        Pointer pointer = new Pointer(x, y);
        assertThat(pointer.toString()).isEqualTo("x:10, y:10");

    }


    @Test
    @DisplayName("입력받은 문자열로 좌표 2개를 만든다")
    void getTwoCoordinates() {
        String twoNums = "(10,10)-(1,4)";

        Coordinate coordinate = new Coordinate();
        coordinate.makeTwoPointers(twoNums);
        assertThat(coordinate.toString()).isEqualTo("x:10, y:10 / x:1, y:4");

    }

}
