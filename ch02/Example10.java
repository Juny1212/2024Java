package ch02;

public class Example10 {
    public static void main(String[] args) {

        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}
