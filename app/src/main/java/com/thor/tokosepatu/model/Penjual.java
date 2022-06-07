package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Penjual extends User {

    private String jabatan;
    public Pemesanan m_Pemesanan;
    private String nama_penjual;


    public Penjual(String password, String username, String jabatan, String nama_penjual) {
        this.password = password;
        this.username = username;
        this.jabatan = jabatan;
        this.nama_penjual = nama_penjual;
    }

    public void tambahSepatuKulit(SepatuKulit s_kulit) {

    }


    public void tambahSepatuOlahraga(SepatuOlahraga s_olahraga) {

    }

    public void terimaDataBarang() {

    }

    public void terimaLaporanPenjualan() {

    }
}// end Penjual