/**
 * Created on 9/29/17.
 * A kidnapper wrote a ransom note but is worried it will be traced back to him.
 * He found a magazine and wants to know if he can cut out whole words from it
 * and use them to create an untraceable replica of his ransom note.
 * The words in his note are case-sensitive and he must use whole words available in the magazine,
 * meaning he cannot use substrings or concatenation to create the words he needs.
 * Given the words in the magazine and the words in the ransom note,
 * print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 */
import java.util.*;

public class HashMapPractice {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public HashMapPractice(String magazine, String note) {

        String[] magazineWords = magazine.split(" ");
        String[] noteWords = note.split(" ");

        magazineMap = new HashMap<String, Integer>(magazineWords.length);
        noteMap = new HashMap<String, Integer>(noteWords.length);

        for(int i = 0; i < magazineWords.length; i++) {
            if(magazineMap.get(magazineWords[i]) == null)
                magazineMap.put(magazineWords[i], 1);
            else magazineMap.put(magazineWords[i], magazineMap.get(magazineWords[i]) + 1);
        }

        for(int i =0; i < noteWords.length; i++) {
            if (noteMap.get(noteWords[i]) == null)
                noteMap.put(noteWords[i], 1);
            else noteMap.put(noteWords[i], noteMap.get(noteWords[i]) + 1);
        }

    }

    public boolean solve() {

        Iterator iterator = noteMap.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry pair = (Map.Entry) iterator.next();
            if(magazineMap.get(pair.getKey()) < (int) pair.getValue())
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        HashMapPractice s = new HashMapPractice(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
