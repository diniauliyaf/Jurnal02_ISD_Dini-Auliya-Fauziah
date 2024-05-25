public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();

        System.out.println("Inserting the following values: ");
        // deklarasikan nilai yang ingin di eksekusi
        char[] values = { 'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J' };

        for (char value : values) {
            System.out.printf("%c ", value);
            tree.insertNode(value);
        }

        // untuk print preorder
        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();

        // untuk print inorder
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();

        // print postorder
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();

        // dan untuk print hasil penelusuran
        System.out.println();
        tree.searchBST('K');
        tree.searchBST('A');
    }
}