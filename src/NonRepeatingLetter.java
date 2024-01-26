import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingLetter {

    public void nonRepeatingLetter(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            System.out.println("-->"+q);
            while (!q.isEmpty() && freq[ch-'a']>1){
                q.remove();
            }
        }
        System.out.println(q);

        /*System.out.println();
        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i]+" ");
        }
        System.out.println();*/

    }

    // Tushar Soni
    public static void main(String[] args) {
        NonRepeatingLetter nonRepeatingLetter= new NonRepeatingLetter();
        nonRepeatingLetter.nonRepeatingLetter("aabccxb");
    }
}
