package Chapter12;

public class ManageStudent {
    public static void main(String[] args) {

        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "01099999999", "aaa@godofjava.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for(Student student: students) {
            System.out.println(student);
        }
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "01012341234", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "01012341234", "ask@godofjava.com");
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
