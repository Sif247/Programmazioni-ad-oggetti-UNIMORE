import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices)
    {
        this.vertices = vertices;
    }

    public double getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }
        return perimeter;
    }

    public double getArea() {
        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return Math.abs(area / 2.0);
    }

    @Override
    public String toString() {
        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + '}';
    }
}
