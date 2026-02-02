package Builder;

import java.util.Map;

public class StudentUsingBuilder {

    String name;
    int age;
    String phone;
    String address;

    public StudentUsingBuilder(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
    }


    public void print() {
        System.out.println("Name = " + name + "\nAge = "+ age + "\nPhone = " + phone + "\nAddress = "+ address);
    }


}
