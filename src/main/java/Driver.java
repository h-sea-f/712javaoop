import java.util.ArrayList;
import java.util.List;

public class Driver extends People implements Callable{
    private Car car;
    private List<Phone> phoneList = new ArrayList<>();

    public Driver(String peopleName, double peopleWeight, Car car, List<Phone> phoneList) {
        super(peopleName, peopleWeight);
        this.car = car;
        this.phoneList = phoneList;
    }

    public Driver(String peopleName, double peopleWeight, Car car) {
        super(peopleName, peopleWeight);
        this.car = car;
        this.car.accelerate(10);
    }

    public void driveAndCall(String phoneNumber,String phoneName){
        if(phoneList.size() != 0) {
            for (Phone phone:phoneList
                 ) {
                if(phone.getName().equals(phoneName)) {
                    phone.callToPointPeople(phoneNumber);
                    break;
                }
            }
        }
    }

    public Car getCar() {
        return car;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public void callTargetNumber(String phoneNumber) {
        System.out.println("Driver call:\n");

    }
}
