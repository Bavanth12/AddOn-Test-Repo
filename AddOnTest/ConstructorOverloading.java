package AddOnTest;

public class ConstructorOverloading {
    int length;
    int breadth;

    // Default constructor
    ConstructorOverloading() {
        this.length = 1;
        this.breadth = 1;
    }

    // Parameterized constructor
    ConstructorOverloading(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        ConstructorOverloading r1 = new ConstructorOverloading();         // Calls default constructor
        ConstructorOverloading r2 = new ConstructorOverloading(5, 10);    // Calls parameterized constructor

        System.out.println("Area (default): " + r1.area());
        System.out.println("Area (5,10): " + r2.area());
    }
}
