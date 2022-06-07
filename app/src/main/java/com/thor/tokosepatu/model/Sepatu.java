package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Sepatu implements ProductService {

    public int id;
    public String nama_sepatu;
    public String deskripsi;
    public int harga;
    private String harga_setelah_diskon;

    public Sepatu() {

    }

    public void setDiskon(double diskon) {

    }
}// end Sepatu