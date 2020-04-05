import java.util.*;

public class GraphProblem {

    List<List<Integer>> graph;
    State initialState;

    public GraphProblem() {
    }

    public GraphProblem(List<List<Integer>> graph, State initialState) {
        this.graph = graph;
        this.initialState = initialState;
    }

    public boolean isGoalState(State state) {

        for (int i = 0; i < graph.size(); i++) {
            String colorOfFirstNode = state.currenMapping.get(i);
            if (colorOfFirstNode.equals("WHITE")) {
                state.setProblemNode(i);
                return false;
            }
            for (int j = 0; j < graph.get(i).size(); j++) {

                if (colorOfFirstNode.equals(state.currenMapping.get(graph.get(i).get(j)))) {
                    //modifica nodul mare
                   // state.setProblemNode(i);
                    //inainte
                    state.setProblemNode(graph.get(i).get(j));
                    return false;
                }
            }
        }
        return true;
    }

    public List<State> generateSuccesors(State state) {
        List<State> potentialSolutions = new ArrayList<>();
        String currentColor = state.currenMapping.get(state.getProblemNode()); //color of problem node

        if (!currentColor.equals("RED")) {
            State newState1 = new State(state.getCurrenMapping(), state.getProblemNode(), state.getPathOfStates());
            newState1.currenMapping.put(state.getProblemNode(), "RED");//modifica culoarea
            newState1.pathOfStates.add(state.getCurrenMapping());//adauga stateul
            potentialSolutions.add(newState1);
        }
        if (!currentColor.equals("BLUE")) {
            State newState2 = new State(state.getCurrenMapping(), state.getProblemNode(), state.getPathOfStates());
            newState2.currenMapping.put(state.getProblemNode(), "BLUE");//modifica culoarea
            newState2.pathOfStates.add(state.getCurrenMapping());//adauga stateul
            potentialSolutions.add(newState2);

        }
        if (!currentColor.equals("GREEN")) {
            State newState3 = new State(state.getCurrenMapping(), state.getProblemNode(), state.getPathOfStates());
            newState3.currenMapping.put(state.getProblemNode(), "GREEN");//modifica culoarea
            newState3.pathOfStates.add(state.getCurrenMapping());//adauga stateul
            potentialSolutions.add(newState3);

        }
        if (!currentColor.equals("YELLOW")) {
            State newState4 = new State(state.getCurrenMapping(), state.getProblemNode(), state.getPathOfStates());
            newState4.currenMapping.put(state.getProblemNode(), "YELLOW");//modifica culoarea
            newState4.pathOfStates.add(state.getCurrenMapping());//adauga stateul
            potentialSolutions.add(newState4);
        }
        return potentialSolutions;
    }

    public State graphSearchDFS() {

        List<State> explored = new ArrayList<>();
        Stack<State> strategy = new Stack();


        explored.add(initialState);
        strategy.push(initialState);

        while (!strategy.isEmpty()) {

            State node = strategy.pop();

            if (isGoalState(node)) {

                node.setExploredSolutions(explored.size());
                 return node;
            }

            List<State> potentialSolutions = generateSuccesors(node);

            int length = potentialSolutions.size();
            for (int i = 0; i < length; i++) {
                if (!explored.contains(potentialSolutions.get(i))) {
                    explored.add(potentialSolutions.get(i));
                    strategy.push(potentialSolutions.get(i));

                }
            }
        }


//        System.out.println("EXPLORED: "+explored.size());
//        System.out.println("Last state  and its path dfs:");
//        explored.get(explored.size()-1).print();
//        explored.get(explored.size()-1).printPathOfStates();

        State nothing = new State(new HashMap<Integer, String>(), -1, new ArrayList<Map<Integer, String>>());

        return nothing;  //map is empty, node = -1;
    }


    public State graphSearchBFS(){

        List<State> explored = new ArrayList<>();
        Queue<State> strategy = new LinkedList<>();


        explored.add(initialState);
        strategy.add(initialState);

        while (!strategy.isEmpty()) {

            State node = strategy.remove();

            if (isGoalState(node)) {

                node.setExploredSolutions(explored.size());
                return node;
            }

            List<State> potentialSolutions = generateSuccesors(node);

            int length = potentialSolutions.size();
            for (int i = 0; i < length; i++) {
                if (!explored.contains(potentialSolutions.get(i))) {
                    explored.add(potentialSolutions.get(i));
                    strategy.add(potentialSolutions.get(i));

                }
            }
        }
       // System.out.println("EXPLORED BFS: "+explored.size());
        State nothing = new State(new HashMap<Integer, String>(), -1, new ArrayList<Map<Integer, String>>());

        return nothing;  //map is empty, node = -1;

    }

    public Map<Integer, Integer> proability(){
        Map<Integer,Integer> probability=new HashMap();
        int count=0;
        for(int i=0;i< graph.size();i++){
             count=count+graph.get(i).size();
        }
        for(int i=0;i< graph.size();i++){
            int percent=( graph.get(i).size()/count)*100;
            probability.put(i,percent);
        }
        return probability;
    }
    public int computeHeuristic(State state){

        int rpp=0;
        int bpp=0;
        int gpp=0;
        int ypp=0;
        int r=0;
        int b=0;
        int g=0;
        int y=0;
        for(Map.Entry entry: state.getCurrenMapping().entrySet()){
            //compute probability of each color
            if(entry.getValue()=="RED"){
                rpp=rpp+this.proability().get(entry.getKey()) ;     //cat se apx ca e ;
                r++; //cat e
            }else if(entry.getValue()=="YELLOW"){
                ypp=ypp+this.proability().get(entry.getKey()) ;
                y++;
            }else if(entry.getValue()=="BLUE"){
                bpp=bpp+this.proability().get(entry.getKey()) ;
                b++;
            }else {
                gpp=gpp+this.proability().get(entry.getKey()) ;
                g++;
            }
        }
        //percenteges of current mapping;
        r=(r/4)*100;
        b=(b/4)*100;
        g=(g/4)*100;
        y=(y/4)*100;
        //compute difference
        int heuristic=0;
        heuristic=heuristic+ Math.abs(r-rpp)+Math.abs(b-bpp)+Math.abs(g-gpp)+Math.abs(y-ypp);

        //compute the distance:
        int distance=state.pathOfStates.size();
        //int h = distance +heuristic;
        int h = heuristic;


        return h;

    }
    public State graphSearchAStar() {

        List<State> explored = new ArrayList<>();
        PriorityQueue<State> strategy = new PriorityQueue<>(new StateComparator());
        initialState.heuristic=computeHeuristic(initialState);
        explored.add(initialState);
        strategy.add(initialState);

        while (!strategy.isEmpty()) {

            State node = strategy.remove();

            if (isGoalState(node)) {

                node.setExploredSolutions(explored.size());
                return node;
            }

            List<State> potentialSolutions = generateSuccesors(node);

            int length = potentialSolutions.size();
            for (int i = 0; i < length; i++) {
                potentialSolutions.get(i).heuristic=computeHeuristic(potentialSolutions.get(i));
                if (!explored.contains(potentialSolutions.get(i))) {
                    explored.add(potentialSolutions.get(i));
                    strategy.add(potentialSolutions.get(i));

                }
            }
        }
      //  System.out.println("EXPLORED:  A*"+explored.size());
        State nothing = new State(new HashMap<Integer, String>(), -1, new ArrayList<Map<Integer, String>>());

        return nothing;  //map is empty, node = -1;






    }

    public State graphSearchDijkstra(){

        List<State> explored = new ArrayList<>();
        PriorityQueue<State> strategy = new PriorityQueue<>(new StateComparatorPathLength());


        explored.add(initialState);
        strategy.add(initialState);

        while (!strategy.isEmpty()) {

            State node = strategy.remove();

            if (isGoalState(node)) {

                node.setExploredSolutions(explored.size());
                return node;
            }

            List<State> potentialSolutions = generateSuccesors(node);

            int length = potentialSolutions.size();
            for (int i = 0; i < length; i++) {
                if (!explored.contains(potentialSolutions.get(i))) {
                    explored.add(potentialSolutions.get(i));
                    strategy.add(potentialSolutions.get(i));

                }
            }
        }

        State nothing = new State(new HashMap<Integer, String>(), -1, new ArrayList<Map<Integer, String>>());

        return nothing;  //map is empty, node = -1;

    }

}
