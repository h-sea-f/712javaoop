public class Roadster extends Car {
    public Roadster(String carName, String carColor) {
        super(carName, carColor);
    }

    public void drift() {
        if (this.getSpeed() >= 30) {
            this.setSpeed(this.getSpeed() - 30);
        } else {
            this.setSpeed(0);
        }
    }
}
