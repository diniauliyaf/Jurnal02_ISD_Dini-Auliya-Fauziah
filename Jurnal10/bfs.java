import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    private int nodes;
    private LinkedList<Integer> adj[];
    private Queue<Integer> vertexQueue;

    // untuk pembuatan list adjacency dan inisialisasi vertexQueue
    public bfs(int vertex) {
        nodes = vertex;
        // untuk menginisialisasi linkedlist untuk menyimopan tetangga
        adj = new LinkedList[nodes];
        for (int i = 0; i < vertex; i++) {
            adj[i] = new LinkedList<>();
        }
        vertexQueue = new LinkedList<Integer>();
    }

    // List Adjacency, penambahan edge
    public void insertEdge(char source, char dest) {
        adj[source - 'A'].add(dest - 'A');
    }

    // untuk melihat hasil List Adjacency
    public void getAdj() {
        for (LinkedList<Integer> linkedList : adj) {
            System.out.println(linkedList);
        }
    }

    // Penelusuran BFS
    public void bfs(char sumber) {
        // membuat queue untuk verteks yang sudah dikunjungi
        boolean traversalOrder[] = new boolean[nodes];
        // nilai awal verteks yang dikunjungi
        int vertexDikunjungi = 0;
        traversalOrder[sumber - 'A'] = true;// vertex sumber di-visit dan dimasukkan kedalam queue
        vertexQueue.add(sumber - 'A'); // menambahkan simpul awal ke dalam antrian

        while (!vertexQueue.isEmpty()) {
            // ambil dan hapus vertex pertama
            vertexDikunjungi = vertexQueue.poll();
            // print vertex pertama
            System.out.print((char) (vertexDikunjungi + 'A') + " ");
            // cek tetangga dari vertex awal
            for (int tetangga : adj[vertexDikunjungi]) {
                // jika tetangga belum dikunjungi, kunjungi tetangga
                if (!traversalOrder[tetangga]) {
                    // untuk menandai bahwa simpul tetangga telah dikunjungi
                    traversalOrder[tetangga] = true;
                    // untuk menambahkan tetangga yang belum dikunjungi ke dalam antrian
                    vertexQueue.add(tetangga);
                }
            }
        }
    }
}