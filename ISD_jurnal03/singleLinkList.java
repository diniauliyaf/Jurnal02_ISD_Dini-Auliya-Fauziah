public class singleLinkList<E> {
    listNode head;

    public singleLinkList() {
        head = null;
    }

    public void addNode(buku data) {
        listNode newNode = new listNode(data);
        if (head == null) {
            head = newNode;
        } else {
            listNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Buku berhasil ditambahkan");
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println();
        } else if (head.next == null) {
            System.out.println();
        } else {
            listNode current = head;
            listNode previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            System.out.println("Buku berhasil dihapus");
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("tidak ada buku");
        } else {
            listNode current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;

            }
        }
    }
}