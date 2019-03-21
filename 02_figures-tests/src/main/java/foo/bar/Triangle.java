package foo.bar;

public class Triangle implements Figure {
int sideLenght ;
int height;

    public Triangle(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    public Triangle(int sideLenght, int height) {
        this.sideLenght = sideLenght;
        this.height = height;
    }

    @Override
    public int area() {
        return sideLenght * height / 2;
    }

    @Override
    public int circumference() {
        return 3 * sideLenght;
    }
}
