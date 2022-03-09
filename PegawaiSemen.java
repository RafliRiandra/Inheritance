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
public class PegawaiSemen extends PabrikSemen {
    public String Nama;
    public int Umur;
    public String jk;
    public int pspb;
    
    public void IdentitasPegawai(){
        System.out.println("Nama: "+Nama);
        System.out.println("umur: "+Umur);
        System.out.println("Jenis kelamin: "+jk);
    }
    public void BagianPekerjaan(){
        System.out.println("Bagian bidang: "+super.bidang);
    }
    public int CekSemen(int PendapatanSemenPerBulan){
        this.pspb=PendapatanSemenPerBulan;
        return pspb;
    }
    public void CekSemen (double PendapatanSemenPerTahun){
        System.out.println("Pendapatan semen per tahun : "+PendapatanSemenPerTahun);
    }
}
