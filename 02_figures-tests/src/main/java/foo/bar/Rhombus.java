package foo.bar;

public class Rhombus implements Figure {

    private final int a;
    private final int h;

    public Rhombus(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public int area() {
        return a * h;
    }

    @Override
    public int circumference() {
        return a*4;
    }
}
