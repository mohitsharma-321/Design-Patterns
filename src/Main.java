import Singleton.MySingletonClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Program starts !! \n");

        MySingletonClass obj1 = MySingletonClass.getInstance();

        MySingletonClass obj2 = MySingletonClass.getInstance();


        System.out.println(obj1);
        System.out.println(obj2);
    }
}