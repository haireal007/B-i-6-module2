package Point2D_Point3D;

public class TestPoint2D_Point3D {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(2, 3);
        System.out.println("point2D " + "{" +point2D.toString() + "}");
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(2, 3, 4);
        System.out.println("point3D " + point3D.toString());
    }
}
