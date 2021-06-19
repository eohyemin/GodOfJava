package Chapter15.string.practice;

import java.util.Locale;

public class UseStringMethods {
    public static void main(String[] args) {

    }
    public void printWords(String str) {
        String[] words = str.split(" ");
        for(String tmpStr: words) {
            System.out.println(tmpStr);
        }
    }
    public void findString(String str, String findStr) {
        int idx = str.indexOf(findStr);
        if(idx != -1) {
            System.out.println(findStr+" is appeared at " +idx);
        }
    }
    public void findAnyCaseString(String str, String findStr) {
        String lowerStr = str.toLowerCase();
        String lowerFindStr = findStr.toLowerCase();
        int idx = lowerStr.indexOf(lowerFindStr);
        if(idx != -1) {
            System.out.println(findStr+" is appread at " +idx);
        }
    }
    public void countChar(String str, char c) {
        char[] strArray = str.toCharArray();
        int count = 0;
        for(char tmpChar: strArray) {
            if(tmpChar == c) count++;
        }
        System.out.println("char \'"+c+"\' count is " + count);
    }
    public void printContainWords(String str, String findStr) {
        String[] words = str.split(" ");
        for(String tmpStr: words) {
            if(tmpStr.contains(findStr)) {
                System.out.println(tmpStr + " contains " + findStr);
            }
        }
    }
}
