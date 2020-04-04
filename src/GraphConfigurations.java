import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphConfigurations {


    public static List<List<Integer>> shape1() {
        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1, 4));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(0, 2, 3, 4));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(1, 3));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(1, 2, 4));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(0, 1, 3));

        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4));
        return graph;

    }

    public static List<List<Integer>> shape2() {
        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1, 4,3,5));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(0, 2, 3));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(1, 5,3));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(1, 2, 0,5));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(0, 5));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(0, 4,2, 3));

        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5));
        return graph;

    }

    public static List<List<Integer>> shape3() {

        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(2,4,5));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(0,1,3,4));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(0,2));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(1,2,5));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(1,4));




        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5));
        return graph;
    }
    public static List<List<Integer>> shape4() {

        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(0,2,7));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(0,1,3,7));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(0,2,4,7));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(0,3,5,7));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(0,4,6,7));
        List<Integer> ar6 = new ArrayList<>(Arrays.asList(0,5,7));
        List<Integer> ar7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));




        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5,ar6,ar7));
        return graph;
    }

    public static List<List<Integer>> shapeNo1() {
        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1,2,3,6,7,8));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(2,0,8));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(1,0,3,4));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(0,2,4,5,6));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(2,3,5));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(6,3,4));
        List<Integer> ar6 = new ArrayList<>(Arrays.asList(0,3,5,7));
        List<Integer> ar7 = new ArrayList<>(Arrays.asList(0,6,8));
        List<Integer> ar8 = new ArrayList<>(Arrays.asList(1,0,7));


        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5,ar6,ar7,ar8));
        return graph;

    }
    public static List<List<Integer>> shapeNo2() {
        //am corectat nodurile
        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(2,4,5,0));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(0,1,3,4,6));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(0,2,6));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(1,2,5,6));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(1,4,6));
        List<Integer> ar6 = new ArrayList<>(Arrays.asList(2,3,4,5));



        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5,ar6));
        return graph;

    }
    public static List<List<Integer>> shapeNo3() {




        List<Integer> ar0 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(0,2,9));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(0,1,9,3));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(0,2,10,4));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(0,3,5));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(0,4,6,7,8));
        List<Integer> ar6 = new ArrayList<>(Arrays.asList(0,5,7));
        List<Integer> ar7 = new ArrayList<>(Arrays.asList(6,5,8));
        List<Integer> ar8 = new ArrayList<>(Arrays.asList(5,7,9,10));
        List<Integer> ar9 = new ArrayList<>(Arrays.asList(1,2,8,10));
        List<Integer> ar10 = new ArrayList<>(Arrays.asList(3,8,9));

        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5,ar6,ar7,ar8,ar9,ar10));
        return graph;

    }
    public static List<List<Integer>> shapeNo4() {




        List<Integer> ar0 = new ArrayList<>(Arrays.asList(2,1));
        List<Integer> ar1 = new ArrayList<>(Arrays.asList(0,2,5,4,3));
        List<Integer> ar2 = new ArrayList<>(Arrays.asList(3,1,0,6));
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(1,2,6,8,4));
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(5,3,1,8));
        List<Integer> ar5 = new ArrayList<>(Arrays.asList(1,4));
        List<Integer> ar6 = new ArrayList<>(Arrays.asList(7,8,2,3));
        List<Integer> ar7 = new ArrayList<>(Arrays.asList(8,6));
        List<Integer> ar8 = new ArrayList<>(Arrays.asList(7,3,6,4));


        List<List<Integer>> graph = new ArrayList<>(Arrays.asList(ar0, ar1, ar2, ar3, ar4, ar5,ar6,ar7,ar8));
        return graph;

    }
}
