package com.thor.tokosepatu.repository;

import com.thor.tokosepatu.model.Alamat;
import com.thor.tokosepatu.model.Pembeli;
import com.thor.tokosepatu.model.Penjual;
import com.thor.tokosepatu.model.StatusPembeli;

import java.util.ArrayList;

public class UserRepository {
    public ArrayList<Pembeli> listUserPembeli = new ArrayList<Pembeli>();
    public ArrayList<Penjual> listUserPenjual = new ArrayList<Penjual>();
    private Alamat alamat = new Alamat("saa", "sa", "as", "sa", "sa", "ass");

    public UserRepository() {
        listUserPembeli.add(new Pembeli("password", "ahmadC", alamat, "ahmad@gmail.com", "Ahmad", "088888888",
                1000000, StatusPembeli.aktif));
        listUserPembeli.add(new Pembeli("password", "jorge", alamat, "jorge@gmail.com", "Ahmad", "088888888",
                1000000, StatusPembeli.aktif));
        listUserPenjual.add(new Penjual("password", "admin", "owner", "Fani"));
        listUserPenjual.add(new Penjual("password", "employe1", "employer", "Pejo"));
    }

    public ArrayList<Pembeli> getListUserPembeli() {
        return listUserPembeli;
    }

    public ArrayList<Penjual> getListUserPenjual() {
        return listUserPenjual;
    }
}
