package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class SepatuOlahraga extends Sepatu {

    public String jenis_olahraga;

    public void finalize() throws Throwable {
        super.finalize();
    }

    public SepatuOlahraga(String nama_sepatu, String jenis_olahraga, String deskripsi, int harga, int id) {
        this.id = id;
        this.nama_sepatu = nama_sepatu;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jenis_olahraga = jenis_olahraga;
    }
}// end SepatuOlahraga