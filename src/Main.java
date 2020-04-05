import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.sql.SQLOutput;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<List<Integer>> graph= GraphConfigurations.shape8();

        State initialState= new State(graph.size());

        GraphProblem graphProblem=new GraphProblem(graph,initialState);

        State resultDFS = graphProblem.graphSearchDFS();
        State resultBFS = graphProblem.graphSearchBFS();
        State resultDijkstra= graphProblem.graphSearchDijkstra();
        State resultA = graphProblem.graphSearchAStar();


        System.out.println("DFS: ");
        resultDFS.print();
        System.out.println("BFS: ");
        resultBFS.print();
        System.out.println("Dijkstra: ");
        resultDijkstra.print();
        System.out.println("A*: ");
        resultA.print();

    }
}
