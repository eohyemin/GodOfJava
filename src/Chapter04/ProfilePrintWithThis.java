package Chapter04;

public class ProfilePrintWithThis {
    private byte age;
    private String name;
    private boolean isMarried;

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public static void main(String[] args) {
        ProfilePrintWithThis profile = new ProfilePrintWithThis();
        byte age = 20;
        String name = "hyemin";
        boolean isMarried = false;

        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }
}
