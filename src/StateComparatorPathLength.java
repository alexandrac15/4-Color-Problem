import java.util.Comparator;

public class StateComparatorPathLength implements Comparator<State> {

    public int compare (State s1,State s2){
        return (s1.getPathOfStates().size()-s2.getPathOfStates().size());

    }
}
