public class People {
    private final String peopleName;
    private double peopleWeight;
    private int heartRate = 60;

    public People(String peopleName, double peopleWeight) {
        this.peopleName = peopleName;
        this.peopleWeight = peopleWeight;
    }

    public People(){
        this.peopleName = "initName";
    }

    public void eatFood() {
        this.peopleWeight += 1;
    }

    public void introduceItself() {
        this.heartRate += 30;
    }
}
