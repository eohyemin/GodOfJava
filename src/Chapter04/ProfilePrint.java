package Chapter04;

public class ProfilePrint {
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

    public void setAge(byte paramAge) {
        age = paramAge;
    }

    public void setName(String paramName) {
        name = paramName;
    }

    public void setMarried(boolean paramIsMarried) {
        isMarried = paramIsMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
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
