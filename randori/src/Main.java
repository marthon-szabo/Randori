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



        for (int i = 0; i < words.length; i++) {
            /*for (int j = 0; j < i.length(); j++) {

            }*/
            ArrayList<String> sentence = (ArrayList<String>) Arrays.asList(words[i].split("\\W+"));
            for (int j = 0; j < sentence.size(); j++) {
                for (int k = j + 1; k < sentence.size(); k++) {
                    if (sentence.get(j).equals(sentence.get(k))) {
                        sentence.remove(sentence.get(k));
                    }
                }
            }
        }
        for (String s: words) {
            System.out.println(s);
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
