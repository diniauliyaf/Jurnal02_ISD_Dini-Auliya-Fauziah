public class Bag {
    private String KodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;
    
    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        KodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }
    public String getKodeBarang() {
        return KodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        KodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    @Override
    public String toString() {
        return "Bag [KodeBarang=" + KodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stok=" + stok + "]";
    }
    
}
