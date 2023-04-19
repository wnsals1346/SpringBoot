package singletone;


public class CarFactory {
    private static int serialNum = 10000;
    private static CarFactory instance = new CarFactory();
    private CarFactory() {

    }
    private CarFactory(int i) {

    }
    public static CarFactory getInstance() {
        return instance;
    }
    public Car createCar() {
        serialNum++;
        Car car = new Car(serialNum);
        return car;
    }
}
