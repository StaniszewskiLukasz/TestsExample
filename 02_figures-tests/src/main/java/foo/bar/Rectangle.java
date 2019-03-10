package foo.bar;

public class Rectangle implements Figure {

    private final int a;
    private final int b;

    @Override
    public int area() {
        return a *b;
    }

    @Override
    public int circumference() {
        return a * 2 + b * 2;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
