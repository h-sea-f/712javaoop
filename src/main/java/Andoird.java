public class Andoird extends Phone {
    public Andoird(String name, String modle) {
        super(name, modle);
    }

    @Override
    public String sendMessage(String messageContent) {
        return "Adnroid" + super.sendMessage(messageContent);
    }
}
