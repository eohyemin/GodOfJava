package Chapter03;

public class Profile {
    String name = "hyemin";
    int age = 27;

    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setName("hyemin");
        profile.setAge(27);
        profile.printName();
        profile.printAge();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("My name is " + name);
    }

    public void printAge() {
        System.out.println("My age is " + age);
    }
}
