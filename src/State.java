import java.util.*;

public class State {
    Map<Integer, String> currenMapping;
    Integer problemNode;
    List<Map<Integer, String>> pathOfStates ;
    int exploredSolutions; //used for final state
    int heuristic=0;

    public State(int numberOfNodes) {
        //default initial state with n=numberOfNodes uncolored nodes
        Map<Integer,String> currentMapping=new HashMap<>();
        Integer problemNode= 0;
        List<Map<Integer, String>> pathOfStates=new ArrayList<>();

        for(int i=0;i<numberOfNodes;i++){
            currentMapping.put(i,"WHITE");
        }

        this.currenMapping = currentMapping;
        this.problemNode = problemNode;
        this.pathOfStates = pathOfStates;
    }

    public State(Map<Integer, String> currenMapping, Integer problemNode, List<Map<Integer, String>> pathOfStates) {
        //if you want to start with diffrent configurations
        this.currenMapping = currenMapping;
        this.problemNode = problemNode;
        this.pathOfStates = pathOfStates;
    }

    public Map<Integer, String> getCurrenMapping() {
        return new HashMap<>(currenMapping);
    }

    public void setCurrenMapping(Map<Integer, String> currenMapping) {
        this.currenMapping = currenMapping;
    }

    public Integer getProblemNode() {
        return problemNode;
    }

    public void setProblemNode(Integer problemNode) {
        this.problemNode = problemNode;
    }

    public List<Map<Integer, String>> getPathOfStates() {

        return  new ArrayList<>(pathOfStates);
    }

    public void setExploredSolutions(int exploredSolutions) {
        this.exploredSolutions = exploredSolutions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(currenMapping, state.currenMapping);
    }
    public void print(){
        if (this.problemNode == -1) {
            System.out.println("No solutions found.");
        } else {

            System.out.println("\033[1;37m" + "\033[4;37m" + "Final result:");
            for (Map.Entry entry : this.currenMapping.entrySet()) {
                if (entry.getValue().equals("RED")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;31m" + entry.getValue());
                }
                if (entry.getValue().equals("BLUE")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;34m" + entry.getValue());
                }
                if (entry.getValue().equals("GREEN")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;32m" + entry.getValue());
                }
                if (entry.getValue().equals("YELLOW")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;33m" + entry.getValue());
                }

            }
            System.out.println("\033[0m" + this.exploredSolutions + " potential solutions were generated.");
            System.out.println("\033[0m" + this.pathOfStates.size() + " states transitioned.");
            System.out.println('\n');
        }
    }
    public void printPathOfStates(){
      //  PRINT THE STATES:
        System.out.println("\033[4;37m" + "States:" + "\033[0m");
        for (int i = 0; i < pathOfStates.size(); i++) {
            int k = i + 1;
            System.out.println("\033[0;37m" + "State " + k + " :");
            for (Map.Entry entry : pathOfStates.get(i).entrySet()) {
                if (entry.getValue().equals("RED")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;31m" + entry.getValue());
                }
                if (entry.getValue().equals("BLUE")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;34m" + entry.getValue());
                }
                if (entry.getValue().equals("GREEN")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;32m" + entry.getValue());
                }
                if (entry.getValue().equals("YELLOW")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;33m" + entry.getValue());
                }
                if (entry.getValue().equals("WHITE")) {
                    System.out.println("\033[0m" + "Node: " + entry.getKey() + " : " + "\033[0;37m" + entry.getValue());
                }

            }

        }
    }

//    public void setPathOfStates(List<Map<Integer, String>> pathOfStates) {
//        this.pathOfStates = pathOfStates;
//    }
}


