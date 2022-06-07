package com.thor.tokosepatu.model;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Alamat {

	private String desa;
	private String jalan;
	private String kabupaten;
	private String kecamatan;
	private String no_rumah;
	private String provinsi;

	public Alamat(String desa, String jalan, String kabupaten, String kecamatan, String no_rumah, String provinsi) {
		this.desa = desa;
		this.jalan = jalan;
		this.kabupaten = kabupaten;
		this.kecamatan = kecamatan;
		this.no_rumah = no_rumah;
		this.provinsi = provinsi;

	}
}// end Alamat