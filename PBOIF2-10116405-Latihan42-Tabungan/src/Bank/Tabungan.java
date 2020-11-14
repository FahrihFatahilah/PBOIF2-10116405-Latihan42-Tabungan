package Bank;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program penarikan uang
 */
public class Tabungan {
    private int saldo;
    
    public void Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    } 
}
