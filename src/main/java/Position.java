import java.util.Objects;

public class Position {

    private final int MIN_POS = 1;
    private final int MAX_POS = 24;

    private final int pos;

    public Position(int pos) {
        validationCheck(pos);
        this.pos = pos;
    }

    private void validationCheck(int pos) {
        if (pos < MIN_POS || MAX_POS < pos) {
            throw new IllegalArgumentException("올바른 좌표 정보를 입력하세요. (좌표 유효범위: 0~24)");
        }
    }

    public int getDiff(Position pos) {
        return this.pos - pos.pos;
    }

    @Override
    public String toString() {
        return pos + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return pos == position.pos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos);
    }
}
