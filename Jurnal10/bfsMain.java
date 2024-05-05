public class bfsMain {
    public static void main(String[] args) {
        // untuk membuat objek bfs dengan 9 simpul
        bfs graf = new bfs(9);
        graf.insertEdge('A', 'B');
        graf.insertEdge('A', 'D');
        graf.insertEdge('A', 'E');
        graf.insertEdge('B', 'E');
        graf.insertEdge('D', 'G');
        graf.insertEdge('E', 'H');
        graf.insertEdge('E', 'F');
        graf.insertEdge('G', 'H');
        graf.insertEdge('H', 'I');
        graf.insertEdge('F', 'H');
        graf.insertEdge('F', 'C');
        graf.insertEdge('I', 'F');
        graf.insertEdge('C', 'B');
        System.out.println("Berikut output dari BFS : ");
        graf.bfs('A');
    }
}