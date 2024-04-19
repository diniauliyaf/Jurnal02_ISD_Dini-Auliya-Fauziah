import java.util.HashMap;
import java.util.Map;

class Mahasiswa {
    private String nama;
    private String kelas;
    private double nilai;

    public Mahasiswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = 0.0; // Default nilai awal
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

public class ProgramMahasiswa {
    private static Map<String, Mahasiswa> dataMahasiswa = new HashMap<>();

    public static void tambahMahasiswa(String nim, String nama, String kelas) {
        Mahasiswa mahasiswa = new Mahasiswa(nama, kelas);
        dataMahasiswa.put(nim, mahasiswa);
    }

    public static void hapusMahasiswa(String nim) {
        dataMahasiswa.remove(nim);
    }

    public static void simpanNilai(String nim, double nilai) {
        Mahasiswa mahasiswa = dataMahasiswa.get(nim);
        if (mahasiswa != null) {
            mahasiswa.setNilai(nilai);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void tampilkanNilaiDanRataRata() {
        double totalNilai = 0.0;
        int jumlahMahasiswa = 0;

        for (Map.Entry<String, Mahasiswa> entry : dataMahasiswa.entrySet()) {
            Mahasiswa mahasiswa = entry.getValue();
            totalNilai += mahasiswa.getNilai();
            jumlahMahasiswa++;
            System.out.println("NIM: " + entry.getKey() + ", Nama: " + mahasiswa.getNama() + ", Kelas: " + mahasiswa.getKelas() + ", Nilai: " + mahasiswa.getNilai());
        }

        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Rata-rata Nilai: " + rataRata);
    }

    public static void main(String[] args) {
        tambahMahasiswa("123456", "John Doe", "A1");
        tambahMahasiswa("789012", "Jane Smith", "B2");

        simpanNilai("123456", 85.5);
        simpanNilai("789012", 78.0);

        tampilkanNilaiDanRataRata();
    }
}
