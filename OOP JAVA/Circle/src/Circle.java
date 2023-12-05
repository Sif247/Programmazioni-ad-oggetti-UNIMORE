import java.awt.*;

public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter()
    {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    public double getArea()
    {
        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }

    public boolean contains(Point point)
    {
        return Math.hypot(point.x - center.x, point.y - center.y) < radius;
    }

    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}

        //2*r*pgreco, area:  r^2 pgreco
