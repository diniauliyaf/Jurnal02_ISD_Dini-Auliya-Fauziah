import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class dfs {
    // untuk menyimpan jumlah simpul di graf
    private int verteks;
    // untuk menyimpan daftar tetangga dari tetangga
    private LinkedList<Integer> adj[];

    // array penanda visited
    private boolean visited[];

    // Constructor
    @SuppressWarnings("unchecked")
    public dfs(int v) {
        verteks = v;
        // inisialisasi linkedlist untuk menyimoan tetangga
        adj = new LinkedList[verteks];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<Integer>();

        visited = new boolean[verteks];
        // untuk mengatur semua simpul sebagai yang belum dikunjungi
        for (int i = 0; i < verteks; i++) {
            visited[i] = false;
        }
    }

    public void addEdge(char source, char dest) {
        adj[source - 'A'].add(dest - 'A');
    }

    public void dfs(char sourceVertex) {
        // membuat stack untuk dfs
        Stack<Integer> stack = new Stack<>();

        // untuk menambakan simpul awal ke dalam stack
        stack.push(sourceVertex - 'A');

        while (!stack.isEmpty()) {
            // untuk mengambil simpul dari atas stack
            int source = stack.pop();

            if (!visited[source]) {
                // akan menandai simpul sebagai yang sedang dikunjungi
                visited[source] = true;
                System.out.print((char) (source + 'A') + " ");

                // Mendapatkan tetangga dari simpul yang diambil dari stack
                // Jika tetangga belum dikunjungi, maka ditambahkan ke dalam stack
                Iterator<Integer> itr = adj[source].iterator();
                while (itr.hasNext()) {
                    int v = itr.next();
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }
}