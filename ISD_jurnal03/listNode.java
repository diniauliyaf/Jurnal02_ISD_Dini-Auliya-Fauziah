public class listNode {
    buku data;
    listNode next;

    public listNode(buku data) {
        this.data = data;
        this.next = null;
    }

    public buku getData() {
        return data;
    }
}