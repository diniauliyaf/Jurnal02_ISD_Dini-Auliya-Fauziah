public class TreeNode<E extends Comparable<E>> {
    private TreeNode<E> leftNode;
    private E data;
    private TreeNode<E> rightNode;

    // konstruktor untuk mendeklarasikan data dan membuat node sebagai leaf
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    // getter untuk mendapatkan data node
    public E getData() {
        return data;
    }

    // untuk mendapatkan node kiri
    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    // untuk mendapatkan node kanan
    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    // method untuk menyisipkan node baru sekaligus mencari titik penyisipannya
    public void insert(E insertValue) {
        // untuk menyisipkan di sebelah kiri
        if (insertValue.compareTo(data) < 0) {
            // jika node kiri masih null
            if (leftNode == null) {
                // maka akan disisipkan node baru di sebelah kiri nya
                leftNode = new TreeNode<E>(insertValue);
            } else {
                // tapi jika sebelah kiri nya tidak kosong maka akan menyisipkan di sebelah kiri
                // secara rekursif
                leftNode.insert(insertValue);
            }
        }
        // untuk menyisipkan disebelah kanan
        else if (insertValue.compareTo(data) > 0) {
            // jika node kanan masih null
            if (rightNode == null) {
                // maka akan disisipkan node baru di sebelah kanan nya
                rightNode = new TreeNode<E>(insertValue);
            } else {
                // tapi jika sebelah kanan nya tidak kosong maka akan menyisipkan di sebelah
                // kanan secara rekursif
                rightNode.insert(insertValue);
            }
        }
    }
}