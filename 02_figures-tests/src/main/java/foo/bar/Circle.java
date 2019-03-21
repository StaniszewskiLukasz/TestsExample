package foo.bar;

public class Circle {

    private final double pi = 3.14;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double area(int radius) {
        return pi * radius * radius;
    }


    public double circumference(int radius) {
        return pi * radius * 2;
    }
}
