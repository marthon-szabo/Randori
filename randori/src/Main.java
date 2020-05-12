import java.util.Arrays;

public class Main {

    public static String text = "java 100\ncpp 65\npython 50";


    public static void listBuilder(String text){

    }

    public static void main(String[] args) {
        String[] x = text.split("\\W+");

        System.out.println("====================");
        for (int i = 0; i < x.length; i = i+2) {
            //if (i % 2 == 1) System.out.println(x[i]);
            System.out.printf("%-14s %03d %n", x[i], Integer.parseInt(x[i+1]));

        }
        System.out.println("====================");

        System.out.println(Arrays.toString(x));
    }
}
