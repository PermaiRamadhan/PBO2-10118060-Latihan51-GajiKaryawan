/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg51.gajikaryawan;

/**
 *
 * @author 
 * NAMA     : Permai Ramadhan
 * KELAS    : IF-2
 * NIM      : 10118060
 * Deskripsi Program : Membuat program berbasis objek untuk menghitung gaji
 * karyawan
 */
public class Karyawan {
 protected String nik,nama,jabatan;
    protected int golongan;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
   
    }
    
}
