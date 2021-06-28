package thisisjava;
//9-4
public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire();

        Car.Engine engine = new Car.Engine();
    }
}
