import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueLL<String> queue = new QueueLL<>();

        while (true) {
            // print menu pilihan
            System.out.println("1. Input Tugas");
            System.out.println("2. Tampilkan tugas yang harus diprioritaskan");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Tampilkan seluruh isi to-do-list");
            System.out.println("5. Keluar");

            // input nomor pilihan
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    // ketika pengguna memilih pilihan 1
                    System.out.print("Masukkan nama tugas = ");
                    String inputTugas = input.nextLine();
                    queue.InputData(inputTugas);
                    break;

                case 2:
                    // untuk menampilkan tugas yang diprioritaskan
                    System.out.print("Tugas yang harus diprioritaskan = ");
                    queue.TampilData();
                    break;

                case 3:
                    // untuk menghapus objek
                    System.out.println("Data Telah Dihapus");
                    queue.DeleteData();
                    break;

                case 4:
                    // untuk menampilkan semua to do list yang ada
                    System.out.println("Berikut To Do List yang ada : ");
                    queue.TampilSemuaData();
                    break;

                case 5:
                    // untuk keluar dari sistem
                    System.out.println("Sistem telah selesai");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");

            }
        }
    }
}