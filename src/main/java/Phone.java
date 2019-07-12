public class Phone implements Callable {
    private String name;

    private String modle;

    public String getName() {
        return name;
    }

    public String getModle() {
        return modle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public Phone(String name, String modle) {
        this.name = name;
        this.modle = modle;
    }

    public Phone() {
    }

    public String sendMessage(String messageContent) {
        return messageContent;
    }

    public String callToPointPeople(String phoneNumber) {
        return "call to " + phoneNumber;
    }

    @Override
    public void callTargetNumber(String phoneNumber) {
        System.out.println("call to " + phoneNumber);
    }
}
