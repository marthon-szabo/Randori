import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static String text = "java 100\ncpp 65\npython 50";
    public static String[] words = {"5","Goodbye bye bye world world world",
            "Sam went went to to to his business",
            "Reya is is the the best player in eye eye game",
            "in inthe",
            "Hello hello Ab aB"};
    public static void listBuilder(String text){

    }

    public static void main(String[] args) {
        List<String> x = new ArrayList<>();

        ArrayList<String> sentence = Arrays.asList(words[1].split("\\W+"));

        for (int i = 0; i < words.length; i++) {
            /*for (int j = 0; j < i.length(); j++) {

            }*/



        }


/*        String[] x = text.split("\\W+");

        System.out.println("=======================");
        for (int i = 0; i < x.length; i = i+2) {
            //if (i % 2 == 1) System.out.println(x[i]);
            System.out.printf("%s               %03d %n", x[i], Integer.parseInt(x[i+1]));

        }
        System.out.println("=======================");

        System.out.println(Arrays.toString(x));*/

    }
}
