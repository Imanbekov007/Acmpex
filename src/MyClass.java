public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[]lessons;
    private String food;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String[] getLessons() {
        return lessons;
    }

    public String getFood() {
        return food;
    }

    public MyClass(String name, String surname, int age, String[] lessons, String food) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
        this.food = food;
    }

    public MyClass(String[] lessons, String food) {
        this.lessons = lessons;
        this.food = food;
    }
}
