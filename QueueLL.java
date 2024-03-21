import java.util.*;

public class QueueLL<E> {
    private LinkedList<E> daftarTugas;

    public QueueLL() {
        daftarTugas = new LinkedList<E>();
    }

    // untuk menambah nama pekerjaan
    public void InputData(E inputBaru) {
        daftarTugas.add(inputBaru);
        System.out.println("Tugas telah diinputkan");
    }

    // untuk menampilkan
    public void TampilData() {
        System.out.println(daftarTugas.peek());

    }

    // untuk menghapus
    public E DeleteData() throws NoSuchElementException {
        return daftarTugas.remove();
    }

    // untuk menampilkan semua data to do list
    public void TampilSemuaData() {
        Iterator<E> iterator = daftarTugas.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println("- " + value + " ");

        }
    }
}