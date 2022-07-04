public class Pointer {

    Position xPos;
    Position yPos;

    public Pointer(int xPos, int yPos) {
        this.xPos = new Position(xPos);
        this.yPos = new Position(yPos);
    }

    @Override
    public String toString() {
        return "x:" + xPos.toString() + ", y:" + yPos.toString();
    }
}
