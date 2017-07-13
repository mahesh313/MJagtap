/**
 * Created by jagtapm on 7/13/2017.
 */
public class Circle {
    void paint(double size) {
        System.out.println("pencil painting with size " + size);
    }
    void paint(float thickness) {
        System.out.println("brush painting with thickness " + thickness);
    }
    void paint(int finger ){
        System.out.println("finger painting with finger " + finger);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.paint(8.00d);
        c.paint(6.00f);
        c.paint(7);
    }
}
