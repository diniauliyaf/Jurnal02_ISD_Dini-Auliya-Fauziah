import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Doubly {
    LinkedList<Tugas> daftarTugas;

    public Doubly() {
        daftarTugas = new LinkedList<>();
    }

    public void inputData(Tugas inputBaru) {
        daftarTugas.add(inputBaru);
        System.out.println("Tugas telah diinputkan");
    }

    public void hapusDataDepan() {
        daftarTugas.removeFirst();
        System.out.println("Tugas telah dihapus");
    }

    public void hapusDataBelakang() {
        daftarTugas.removeLast();
        System.out.println("Tugas telah dihapus");
    }

    public void tampilan() {
        for (Tugas Tugas : daftarTugas) {
            System.out.println("mata kuliah = " + Tugas.matkul);
            System.out.println("mata kuliah = " + Tugas.namaTugas);
            System.out.println("mata kuliah = " + Tugas.deadline);
        }

    }

    public void tampilanTerurut(Comparator<Tugas> comparator) {
        LinkedList<Tugas> sortedList = new LinkedList<>(daftarTugas);
        Collections.sort(sortedList, comparator);
        for (Tugas tugas : sortedList) {
            System.out.println(tugas);
        }

    }
}