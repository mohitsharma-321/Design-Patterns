package Builder;

public class Student {
    String name;
    int age;
    String phone;
    String address;

    public Student(String name, int age, String phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }


    public void print() {
        System.out.println("Name = " + name + "\nAge = "+ age + "\nPhone = " + phone + "\nAddress = "+ address);
    }
}
