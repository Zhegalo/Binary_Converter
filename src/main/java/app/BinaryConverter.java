/**
 * Created by Hanna_Zhahala on 13.02.2017.
 */
public class BinaryConverter {

    /*public static void main(String[] args) {
        int i = 4;
        System.out.println("Number is " + i);
        System.out.println("Binary is " + Integer.toBinaryString(i));
    }*/


    public static void main(String[] args) {
        String i = new BinaryConverter().converter(3);
        System.out.println(i);
    }

    public String converter(int number) {

        return ("Binary is " + Integer.toBinaryString(number));
    }



}