package com.thor.tokosepatu.repository;

import com.thor.tokosepatu.model.Sepatu;
import com.thor.tokosepatu.model.SepatuKulit;
import com.thor.tokosepatu.model.SepatuOlahraga;

import java.util.ArrayList;

public class SepatuRepository {
    public ArrayList<SepatuKulit> listSepatuKulit = new ArrayList<SepatuKulit>();
    public ArrayList<SepatuOlahraga> listSepatuOlahraga = new ArrayList<SepatuOlahraga>();

    public SepatuRepository() {
        listSepatuKulit.add(new SepatuKulit("SpKulit satu","Kulit Buaya", "Adidas", 270000, 1));
        listSepatuKulit.add(new SepatuKulit("SpKulit dua", "Kulit Harimau","Adidas", 310000, 2));
        listSepatuKulit.add(new SepatuKulit("SpKulit tiga","Kulit Ayam", "Adidas", 200000, 3));        listSepatuKulit.add(new SepatuKulit("SpKulit satu","Kulit Buaya", "Adidas", 270000, 1));
        listSepatuKulit.add(new SepatuKulit("SpKulit dua", "Kulit Harimau","Adidas", 310000, 2));
        listSepatuKulit.add(new SepatuKulit("SpKulit tiga","Kulit Harimau","Adidas", 310000, 2));
        listSepatuKulit.add(new SepatuKulit("SpKulit tiga","Kulit Harimau","Adidas", 310000, 2));
        listSepatuKulit.add(new SepatuKulit("SpKulit tiga","Kulit Ayam", "Adidas", 200000, 3));        listSepatuKulit.add(new SepatuKulit("SpKulit satu","Kulit Buaya", "Adidas", 270000, 1));
        listSepatuKulit.add(new SepatuKulit("SpKulit dua", "Kulit Harimau","Adidas", 310000, 2));
        listSepatuKulit.add(new SepatuKulit("SpKulit tiga","Kulit Ayam", "Adidas", 200000, 3));

        listSepatuOlahraga.add(new SepatuOlahraga("Yonek121","Lari", "Nike", 6000000, 1));
        listSepatuOlahraga.add(new SepatuOlahraga("Elang5","Gym", "Nike", 6000000, 1));
        listSepatuOlahraga.add(new SepatuOlahraga("Garuda52", "Casual", "Nike", 6000000, 1));

    }

    public ArrayList<SepatuKulit> getListSepatuKulit() {
        return listSepatuKulit;
    }

    public ArrayList<SepatuOlahraga> getListSepatuOlahraga() {
        return listSepatuOlahraga;
    }

    public SepatuKulit getSepatuKulitId(int id){
        for(SepatuKulit sp : getListSepatuKulit()){
            if (sp.id == id){
                return  sp;
            }
        }
        return null;
    }
}
