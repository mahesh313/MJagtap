package Assignment_13_7;

/**
 * Created by jagtapm on 7/13/2017.
 */
public class Operator {
    public static void main(String[] args) {
        Automobile auto = new Automobile("Acty","Honda", 3200, 1400, 1700, 1900, 870, 86000.00, 500, 300, 0, false, 200);
        auto.display();
        auto.accelerate();
        System.out.println("======================");
        auto.display();
        SportsCar sportsCar = new SportsCar("Agera", "Koenigsegg", 4200, 2000, 1120, 1500, 1500, 80000000.00, 1200, 800, 0, false, 450, "Sports car", "2 door targa top");
        sportsCar.display();
        sportsCar.accelerate();
        System.out.println("=======================");
        sportsCar.display();
    }
}
