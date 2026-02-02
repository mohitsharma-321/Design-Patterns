package Builder;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
//        Student obj = new Student("Mohit",18,"abc","xyz");
//        obj.print();


        //Using Map


//        Map<Params,Object> map = new HashMap<>();
//
//        map.put(Params.NAME,"MS");
//        map.put(Params.AGE,20);
//        map.put(Params.PHONE,"dfghuj");
//        map.put(Params.ADDRESS,"abcd");
//
//        StudentUsingMap student = new StudentUsingMap(map);
//        student.print();


        // Using Builder Pattern now

//        Builder builder = new Builder();
//        builder.setName("ms");
//        builder.setAge(24);
//        builder.setPhone("mnb");
//        builder.setAddress("asdf");

        // in Single Line   ->  bss saare setters mein class return krdo


//        Builder builder = new Builder();
//
//        builder.setName("MSS")
//                .setAge(25)
//                .setPhone("kbc")
//                .setAddress("tyuiop");
//
//
//        StudentUsingBuilder studentUsingBuilder = new StudentUsingBuilder(builder);
//        studentUsingBuilder.print();
//
//    }


    // Final Builder Solution now


    StudentUsingBuilderFinal student = StudentUsingBuilderFinal.getBuilder()
            .setName("Mohit")
            .setAge(24)
            .setPhone("sadf")
            .setAddress("polkmn")
            .build();
    }

}
