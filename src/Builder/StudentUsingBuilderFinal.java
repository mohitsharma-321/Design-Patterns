package Builder;

public class StudentUsingBuilderFinal {

    private String name;
    private int age;
    private String phone;
    private String address;

    private StudentUsingBuilderFinal() {}

    private StudentUsingBuilderFinal(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;

        System.out.println("Name = " + name + "\nAge = "+ age + "\nPhone = " + phone + "\nAddress = "+ address);
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String phone;
        private String address;

        public StudentUsingBuilderFinal build() {
            return new StudentUsingBuilderFinal(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
    }



    public void print() {
        System.out.println("Name = " + name + "\nAge = "+ age + "\nPhone = " + phone + "\nAddress = "+ address);
    }

}
