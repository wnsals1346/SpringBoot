package singletone;

public class Car {
    private String carName;
    private final int serialNum;

    public Car(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getCarNum() {
        return serialNum;
    }
}
