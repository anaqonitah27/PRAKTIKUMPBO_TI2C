package Pertemuan_3;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;
    
    Anggota(String noKtp, String nama, int limitPeminjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        jumlahPinjaman = 0;
    }
    public void setNoKtp(String noKtp){
        this.noKtp = noKtp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNoKtp(String noKtp){
        return noKtp;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPeminjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    
    public void angsur(int angsur){
        double minimum = jumlahPinjaman * 0.1;
        if(angsur > (int)minimum){
            jumlahPinjaman -= angsur;
        } else {
            System.out.println("Maaf, anggaran harus 10% dari jumlah pinjaman!");
        }
    }
    
    public void pinjam(int jumlahPeminjaman){
       if(limitPeminjaman > jumlahPeminjaman){
           this.jumlahPinjaman += jumlahPeminjaman;
           limitPeminjaman -= jumlahPeminjaman;
       } else {
           System.out.println("Maaf, jumlah pinjaman melebihi limit!\n");
       }
    }
}
