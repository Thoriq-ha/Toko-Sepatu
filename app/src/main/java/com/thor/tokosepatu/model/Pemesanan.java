package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Pemesanan {

	private int id_pemesanan;
	public Item m_Item;
	public Keranjang m_Keranjang;
	public Nota m_Nota;
	public StatusPemesanan m_StatusPemesanan;
	private String tanggal_pemesanan;
	private double total;
	private double total_harga;
	public Alamat m_Alamat;

	public void finalize() throws Throwable {

	}

	public Pemesanan() {

	}

	public Pemesanan(int id_pemesanan, String tanggal_pemesanan, double total, Item m_Item, Nota m_Nota,
			StatusPemesanan m_StatusPemesanan) {

	}

	public Nota cetakNota() {
		return null;
	}

	public void updateStatusPemesanan(StatusPemesanan status) {

	}
}// end Pemesanan