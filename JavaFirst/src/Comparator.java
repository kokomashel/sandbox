/**
 * Created on 10/27/17.
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem
 * Given an array of  Player objects,
 * write a comparator that sorts them in order of decreasing score;
 * if  or more players have the same score, sort those players alphabetically by name.
 * To do this, you must create a Checker class that implements the Comparator interface,
 * then write an int compare(Player a, Player b) method implementing the
 * Comparator.compare(T o1, T o2) method.
 */
public class Comparator {
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if(a.score > b.score)
            return 1;
        else if(a.score < b.score)
            return -1;
        else {
            String aName = a.name;
            String bName = b.name;
            int res = aName.compareTo(bName);
            return res;
        }
        return 0;
    }
}