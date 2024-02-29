
public class Mainclass{
    public static void main(String[] args) {
        GenArraylist<Atk> daftarAtk = new GenArraylist<>(5);
        GenArraylist<Bag> daftarBag = new GenArraylist<>(5);
        daftarAtk.addData(new Atk("a12", "pensil", "joyko", 5));
        daftarAtk.addData(new Atk("a11", "pulpen", "kenko", 12));
        daftarAtk.addData(new Atk("a10", "buku gambar", "sidu", 25));
        daftarAtk.addData(new Atk("a16", "penghapus", "pilot", 50));
        daftarAtk.addData(new Atk("a14", "penggaris", "fc", 25));

        daftarBag.addData(new Bag("b12", "tas", "charles and keith", 10));
        daftarBag.addData(new Bag("b02", "tas", "eiger", 12));
        daftarBag.addData(new Bag("b03", "tas", "converse", 55));
        daftarBag.addData(new Bag("b09", "tas", "gucci", 56));
        daftarBag.addData(new Bag("b08", "tas", "kenko", 23));

        daftarAtk.display();
        daftarBag.display();
    }
}