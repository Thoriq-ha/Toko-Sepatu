package com.thor.tokosepatu.model;

import java.util.ArrayList;
import java.util.List;

public class Keranjang {

    public ArrayList<Item> m_Item;
    public StatusPembayaran m_StatusPembayaran;

    public Keranjang(ArrayList<Item> m_Item) {
        this.m_Item = m_Item;
    }

    public Pemesanan bayar(StatusPembayaran status_pembayaran) {
        return null;
    }

    public void hapus() {
        m_Item.clear();
    }

    public void hapus(Item items) {
        m_Item.remove(items);
    }

    public void update() {

    }

    public void update(Item items) {
        hapus();
        hapus(new Item());
    }
}//end Keranjang