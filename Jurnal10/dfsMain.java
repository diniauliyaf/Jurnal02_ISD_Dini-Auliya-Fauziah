public class dfsMain {
    public static void main(String[] args) {
        // untuk membuat objek DFSTraversal denhan 9 simpul
        dfs g = new dfs(9);
        g.addEdge('A', 'B');
        g.addEdge('B', 'E');
        g.addEdge('E', 'H');
        g.addEdge('H', 'I');
        g.addEdge('I', 'F');
        g.addEdge('F', 'C');
        g.addEdge('C', 'B');
        g.addEdge('C', 'D');
        g.addEdge('D', 'G');
        System.out.println("Berikut output dari DFS :");
        g.dfs('A');
    }
}