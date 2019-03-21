package foo.bar;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int extract (int a, int b) {
        return a-b;
    }

    public int multiply (int a, int b) {
        return a*b;
    }

    public int divide (int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Can't divide by 0");
        }
        return 1;
    }
}
