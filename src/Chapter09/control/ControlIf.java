package Chapter09.control;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf controlIf = new ControlIf();
        controlIf.ifStatement();
    }
    public void ifStatement() {
        if(true);
        if(true) System.out.println("true");
        if(true)
            System.out.println("also true");
        if(false) System.out.println("false");
    }
}
