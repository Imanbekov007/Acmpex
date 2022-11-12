import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[]lessons={"Softskill,english"};
        String[]lessons1={"Softskill,english,Java"};
      MyClass myClass=new MyClass("Osmon","Imanbekov",17,lessons,"Manty");
        System.out.println(myClass.getName()+"\n"+myClass.getSurname()+"\n"+myClass.getAge()+"\n"+Arrays.toString(myClass.getLessons())+"\n"+myClass.getFood()+"\n");
        MyClass myClass1=new MyClass(lessons1,"Burger");

        System.out.println(Arrays.toString(myClass1.getLessons())+"\n"+myClass1.getFood());
    }
}