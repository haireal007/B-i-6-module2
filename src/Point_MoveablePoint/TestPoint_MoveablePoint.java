package Point_MoveablePoint;

public class TestPoint_MoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 3, 4);
        moveablePoint.Move();
        System.out.println(moveablePoint);
    }
}
