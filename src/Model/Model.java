package Model;
import View.*;

public class Model<cell> {
    public Model(int width, int height) {

    }

    public void update() {
    }

    public Shape[] getShapes() {
        Point[] points = {new Point(18,20),new Point(19,20),new Point(20,20)};
        return (Shape[])points;
    }
}
