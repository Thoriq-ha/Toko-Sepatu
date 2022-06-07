package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Pembeli extends User {

    public String email;
    public Alamat m_Alamat;
    public Keranjang m_Keranjang;
    public Pemesanan m_Pemesanan;
    public StatusPembeli m_StatusPembeli;
    private String nama_pembeli;
    private String no_telp;
    private int saldo;

    public Pembeli(String password, String username, Alamat alamat, String email, String nama_pembeli, String no_telp,
                   int saldo, StatusPembeli m_StatusPembeli) {

        this.password = password;
        this.username = username;
        this.m_Alamat = alamat;
        this.email = email;
        this.nama_pembeli = nama_pembeli;
        this.no_telp = no_telp;
        this.saldo = saldo;
        this.m_StatusPembeli = m_StatusPembeli;

    }

    public void kosongkanKeranjang() {

    }
}// end Pembeli