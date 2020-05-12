import java.util.Arrays;

public class Main {

    public static String text = "java 100\ncpp 65\npython 50";


    public static void listBuilder(String text){

    }



    public static void main(String[] args) {
        String[] x = text.split("\\W+");

        System.out.println(Arrays.toString(x));
    }
}
