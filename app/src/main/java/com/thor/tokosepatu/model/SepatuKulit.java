package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class SepatuKulit extends Sepatu {

    public String jenis_kulit;

    public void finalize() throws Throwable {
        super.finalize();
    }

    public SepatuKulit(String nama_sepatu, String jenis_kulit, String deskripsi, int harga, int id) {
        this.id = id;
        this.jenis_kulit = jenis_kulit;
        this.deskripsi = deskripsi;
        this.nama_sepatu = nama_sepatu;
        this.harga = harga;
    }
}// end SepatuKulit