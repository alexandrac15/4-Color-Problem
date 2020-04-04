import java.util.Comparator;

public class StateComparator implements Comparator<State> {

    public int compare (State s1,State s2){
        return (s1.heuristic-s2.heuristic);

    }
}
