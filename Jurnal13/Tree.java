public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    // konstruktor untuk menginisialisasi tree yang kosong
    public Tree() {
        root = null;
    }

    // method untuk menyisipkan node baru ke dalam BST
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue); // untuk buat node root
        } else {
            root.insert(insertValue); // untuk panggil method insert nya
        }
    }

    // method untuk memulai preorder
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // method rekursif untuk penelususran preorder
    private void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // print data
        preorderHelper(node.getLeftNode()); // menelusuri subtree kiri
        preorderHelper(node.getRightNode()); // menelusuri subtree kanan
    }

    // method untuk memulai inorder
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // method rekursif untuk penelususran inorder
    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode()); // menelusuri subtree kiri
        System.out.printf("%s ", node.getData()); // print data
        inorderHelper(node.getRightNode()); // menelusuri subtree kanan
    }

    // method untuk memulai postorder
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // method rekursif untuk penelususran postorder
    private void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftNode()); // menelusuri subtree kiri
        postorderHelper(node.getRightNode()); // menelusuri subtree kanan
        System.out.printf("%s ", node.getData()); // print
    }

    // method untuk mencari nilai dalam BST
    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);
        if (hasil)
            System.out.println("Data ditemukan " + key);
        else
            System.out.println("Data tidak ditemukan " + key);
    }

    // method rekursif untuk mencari nilai dalam BST
    public boolean searchBSTHelper(TreeNode<E> node, E key) {
        boolean result = false;
        if (node != null) {
            if (key.equals(node.getData()))
                result = true;
            else if (key.compareTo(node.getData()) < 0)
                result = searchBSTHelper(node.getLeftNode(), key);
            else
                result = searchBSTHelper(node.getRightNode(), key);
        }
        return result;
    }
}