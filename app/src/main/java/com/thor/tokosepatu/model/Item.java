package com.thor.tokosepatu.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author THOR
 * @version 1.0
 * @created 10-May-2022 14:32:15
 */
public class Item implements Parcelable {

	public int harga;
	public int jumlah;
	public Sepatu m_Sepatu;


	protected Item(Parcel in) {
		harga = in.readInt();
		jumlah = in.readInt();
	}

	public static final Creator<Item> CREATOR = new Creator<Item>() {
		@Override
		public Item createFromParcel(Parcel in) {
			return new Item(in);
		}

		@Override
		public Item[] newArray(int size) {
			return new Item[size];
		}
	};

	public Item(){

	}

	public Item(int harga, int jumlah, Sepatu m_Sepatu){
		this.m_Sepatu = m_Sepatu;
		this.harga = harga;
		this.jumlah = jumlah;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeInt(harga);
		parcel.writeInt(jumlah);
	}
}//end Item