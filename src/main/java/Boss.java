public class Boss extends People {
    private Callable callable;

    public Boss(String peopleName, double peopleWeight) {
        super(peopleName, peopleWeight);
    }

    public void setCallable(Callable callable) {
        this.callable = callable;
    }

    public Callable getCallable() {
        return callable;
    }
}
