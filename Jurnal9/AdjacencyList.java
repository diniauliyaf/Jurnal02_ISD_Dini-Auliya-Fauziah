import java.util.*;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];

    // constructor
    AdjacencyList(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {
        adjListArray[src - 'A'].add(dest);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + (char) ('A' + i) + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}