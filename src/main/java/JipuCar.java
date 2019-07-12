public class JipuCar extends Car {

    public JipuCar( String carName, String carColor) {
        super( carName, carColor);
    }

    public void jump() {
        if (this.getSpeed() >= 10) {
            this.setSpeed( this.getSpeed() - 10);
        } else {
            this.setSpeed(0);
        }
    }
}
