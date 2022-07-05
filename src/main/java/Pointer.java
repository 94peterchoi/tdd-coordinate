import java.util.Objects;

public class Pointer {

    private Position xPos;
    private Position yPos;

    public Pointer(int xPos, int yPos) {
        this.xPos = new Position(xPos);
        this.yPos = new Position(yPos);
    }

    @Override
    public String toString() {
        return "x:" + xPos.toString() + ", y:" + yPos.toString();
    }

    public int[] subtract(Pointer pointer) {
        int[] postions = new int[]{xPos.getDiff(pointer.xPos), yPos.getDiff(pointer.yPos)};

        return postions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pointer)) return false;
        Pointer pointer = (Pointer) o;
        return Objects.equals(xPos, pointer.xPos) && Objects.equals(yPos, pointer.yPos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPos, yPos);
    }
}
