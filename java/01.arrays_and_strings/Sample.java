import java.util.ArrayList;

/**
 * @author Emi Yoshihara
 */
public class Sample {
    /* p.105
     * variable length arrays(array lists)
     */
    ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sequence = new ArrayList<String>();
        for (String w : words) sequence.add(w);
        for (String w : more) sequence.add(w);
        return sequence;
    }

    String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String w: words) sentence.append(w);
        return sentence.toString();
    }

    public static void main(String[] args) {
        String[] words = new String[2];
        words[0] = "aaa";
        words[1] = "bbb";

        String[] words2 = new String[2];
        words2[0] = "ccc";
        words2[1] = "ddd";

        Sample sample = new Sample();

        System.out.println(sample.merge(words, words2));
        System.out.println(sample.joinWords(words));
    }
}
