public class Car {
    private double speed;
    private String carName;
    private String carColor;

    public Car( String carName, String carColor) {
        this.speed = 0;
        this.carName = carName;
        this.carColor = carColor;
    }

    public Car() {
    }

    public void accelerate() {
        this.speed += 30;
    }

    public void accelerate(double appointSpeed) {
        this.speed += appointSpeed;
    }

    public void slowDown() {
        if (this.speed >= 50) {
            this.speed -= 50;
        } else {
            this.speed = 0;
        }
    }

    public void slowDown(double appointSpeed) {
        if (this.speed >= appointSpeed) {
            this.speed -= appointSpeed;
        } else {
            this.speed = 0;
        }
    }

    public void brake() {
        this.speed = 0;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getSpeed() {
        return speed;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }
}
