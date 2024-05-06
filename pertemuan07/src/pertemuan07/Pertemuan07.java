
package pertemuan07;

/**
 *
 * @author Dian Sariani (2201010254)
 * TGL : 2024-05-06
 */
public class Pertemuan07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk a2 = new induk("ss",8);
        turunan1 a1 = new turunan1();
        
        
        System.out.println("1. Isi dari variabel nama "+a1.getNAMA());
        a1.setNAMA("Luh Putu Dian Sariani");
        System.out.println("2. Isi dari variabel nama "+a1.getNAMA());
        
        a1.setNAMA();
        System.out.println("3. Isi dari variabel nama "+a1.getNAMA());
        
        a2.cetakNAMA();
        a1.cetakNAMA();
    }
    
}
