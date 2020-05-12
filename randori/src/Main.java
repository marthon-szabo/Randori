import java.util.Arrays;

public class Main {

    public static String text = "java 100\ncpp 65\npython 50";


    public static void listBuilder(String text){

    }

    public static void main(String[] args) {
        String[] x = text.split("\\W+");


        for (int i = 0; i < x.length; i++) {
            if (i == 0) System.out.println("====================");
            if (i % 2 == 1) System.out.println(x[i]);

        }

        System.out.println(Arrays.toString(x));
    }
}
