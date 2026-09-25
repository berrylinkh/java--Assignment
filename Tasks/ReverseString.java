


 public class ReverseString {
    public static void main (String [] args) {
    
    String name = "Aderonke";

    for (int count = name.length() - 1; count >= 0; count --) {
    char letter = name.charAt(count);
    System.out.print (letter);
    }
    }
}
