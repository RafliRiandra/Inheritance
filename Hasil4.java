/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasil4;

/**
 *
 * @author HP
 */
public class Hasil4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PegawaiSemen ps = new PegawaiSemen();
        ps.Nama="Muhammad Rafli Firman Riandra";
        ps.Umur=22;
        ps.jk="laki laki";
        ps.IdentitasPegawai();
        ps.BagianPekerjaan();
        System.out.println("Semen yang harus didapat per bulan: "+ps.CekSemen(100)+"kg");
        System.out.println("Semen yang harus didapat per tahun: "+ps.CekSemen(1200)+"kg");
        
        
                
    }
    
}
