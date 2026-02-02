package Builder;

import java.util.Map;

public class StudentUsingMap {
    String name;
    int age;
    String phone;
    String address;

    public StudentUsingMap(Map<Params,Object> values) {
        this.name = (String) values.get(Params.NAME);
        this.age = (Integer) values.get(Params.AGE);
        this.phone = (String) values.get(Params.PHONE);
        this.address = (String) values.get(Params.ADDRESS);
    }


    public void print() {
        System.out.println("Name = " + name + "\nAge = "+ age + "\nPhone = " + phone + "\nAddress = "+ address);
    }
}
