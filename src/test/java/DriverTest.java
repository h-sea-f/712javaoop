import java.util.ArrayList;
import java.util.List;

public class DriverTest {
    public static void main(String[] args) {
        JipuCar jipuCar = new JipuCar("JimmyCar", "blue");
        Driver jimmy = new Driver("Jimmy", 80, jipuCar);
        List<Phone> phoneList = new ArrayList<>();
        Andoird xiaoMi9 = new Andoird("XiaoMi9", "9");
        IOS iphoneXs = new IOS("iphoneXs", "xs");
        phoneList.add(xiaoMi9);
        phoneList.add(iphoneXs);
        jimmy.setPhoneList(phoneList);
        jimmy.driveAndCall("1819585746", xiaoMi9.getName());
        jimmy.driveAndCall("1819585746", iphoneXs.getName());
        jimmy.getCar().brake();
        for (Phone phone : jimmy.getPhoneList()
        ) {
            phone.sendMessage("I buy two new phone");
        }
        Roadster roadster = new Roadster("JimmyRoadster", "red");
        jimmy.setCar(roadster);
        jimmy.getCar().brake();
    }
}
