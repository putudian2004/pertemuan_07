
package pertemuan07;

/**
 *
 * @author Dian Sariani (2201010254)
 * TGL : 2024-05-06
 */
public class induk {
    private String nama;
    public int nilai=0;
    
    public induk(String nm, int nl){
        nama = nm;
        nilai = nl;
    }
    
    public void setNAMA(String nVAL){
        this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = "Nothing";
    }
    public String getNAMA(){
        return this.nama;
    }
    public void cetakNAMA(){
        System.out.printf("Isi Variabel nama: %s dengan tinggi badan %d \n\n",this.nama,this.nilai);
    }
}
