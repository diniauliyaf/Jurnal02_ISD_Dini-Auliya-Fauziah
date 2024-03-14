import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class Tugas implements Comparable<Tugas> {
    String matkul;
    String namaTugas;
    String deadline;

    public Tugas(String matkul, String namaTugas, String deadline) {
        this.matkul = matkul;
        this.namaTugas = namaTugas;
        this.deadline = deadline;

    }

    @Override
    public int compareTo(Tugas other) {
        return this.deadline.compareTo(other.deadline);
    }

    // Getter untuk mendapatkan nilai deadline, matkul, dan namaTugas
    public String getDeadline() {
        return deadline;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    // Metode toString() untuk mencetak informasi tugas
    @Override
    public String toString() {
        return "Tugas [matkul=" + matkul + ", tugas=" + namaTugas + ", deadline=" + deadline + "]";
    }
}