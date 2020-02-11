public class Application {
    public static void main(String[] args) {
        Bus takeBus = new Bus();
        Plane takePlane = new Plane();
        Train takeTrain = new Train();
        Car driveCar = new Car();

        int fee = 300;
        takeBus.select(fee);
        takePlane.select(fee);
        takeTrain.select(fee);
        driveCar.select(fee);


    }
}
