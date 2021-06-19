package Chapter20.lang.practice;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
        numberObjects.paresLong("r1024");
        numberObjects.paresLong("1024");
        numberObjects.printOtherBase(1024);
    }
    public long paresLong(String data) {
        long retLong = -1;
        try {
            retLong = Long.parseLong(data);
            System.out.println(retLong);
        } catch (NumberFormatException ne) {
            System.out.println(data + " is not a number");
        } catch (Exception e) {

        }
        return retLong;
    }
    public void printOtherBase(long value) {
        System.out.println("Original:" + value);
        System.out.println("Binary  :" + Long.toBinaryString(value));
        System.out.println("Hex     :" + Long.toHexString(value));
        System.out.println("Octal   :" + Long.toOctalString(value));
    }
}
