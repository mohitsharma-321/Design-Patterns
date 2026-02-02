package Singleton;



//Normal Singleton Class

//public class MySingletonClass {
//
//    private static MySingletonClass instance = null;
//
//    private MySingletonClass() {}
//
//    public static MySingletonClass getInstance() {
//
//        if(instance == null) {
//            instance = new MySingletonClass();
//                }
//        return instance;
//    }
//
//
//}




// Singleton with  syncronized  but will slow performance


//public class MySingletonClass {
//
//    private syncronized static MySingletonClass instance = null;
//
//    private MySingletonClass() {}
//
//    public static MySingletonClass getInstance() {
//
//        if(instance == null) {
//            instance = new MySingletonClass();
//                }
//        return instance;
//    }
//
//
//}







// two-phase locking

public class MySingletonClass {

    private static MySingletonClass instance = null;

    private MySingletonClass() {}

    public static MySingletonClass getInstance() {

        if(instance == null) {
            synchronized (MySingletonClass.class) {
                if(instance == null) {
                    instance = new MySingletonClass();
                }
            }
        }
        return instance;
    }


}
