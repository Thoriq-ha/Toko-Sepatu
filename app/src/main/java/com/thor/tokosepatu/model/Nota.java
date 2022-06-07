package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Nota {

	private String tanggal_pesan;
	private String tanggal_terakhir_pembayaran;
	private double total;

	public Nota(String tanggal_pesan, String tanggal_terakhir_pembayaran, double total) {
		this.tanggal_pesan = tanggal_pesan;
		this.tanggal_terakhir_pembayaran = tanggal_terakhir_pembayaran;
		this.total = total;
	}
}// end Nota