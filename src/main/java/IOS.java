public class IOS extends Phone {
    public IOS(String name, String modle) {
        super(name, modle);
    }

    @Override
    public String sendMessage(String messageContent) {
        return "IOS"+super.sendMessage(messageContent);
    }
}
