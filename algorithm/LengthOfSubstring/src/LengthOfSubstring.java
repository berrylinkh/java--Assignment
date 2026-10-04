import java.util.ArrayList;
import java.util.HashSet;

public class LengthOfSubstring {
    public static void main (String[] args){
        String word = "abcabcbb";
        int longest =0;

        HashSet<Character> characters = new HashSet<>();
        ArrayList<Character> wordholder= new ArrayList<>();
        for (char letter: word.toCharArray()){
            while(characters.contains(letter)) {
                char removed = wordholder.remove(0);
                characters.remove(removed);
            }
            wordholder.add(letter);
            characters.add(letter);
            if (wordholder.size() > longest){
                longest = wordholder.size();
            }
        }
        System.out.print(longest);
    }
}
