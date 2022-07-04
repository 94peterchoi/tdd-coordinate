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
            throw new IllegalArgumentException("유효 범위가 아닙니다 (좌표 유효범위: 0~24)");
        }
    }

    @Override
    public String toString() {
        return pos + "";
    }
}
