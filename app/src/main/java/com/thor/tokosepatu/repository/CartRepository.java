package com.thor.tokosepatu.repository;

import com.thor.tokosepatu.model.Item;
import com.thor.tokosepatu.model.Keranjang;
import com.thor.tokosepatu.model.Sepatu;

import java.util.ArrayList;

public class CartRepository {
    SepatuRepository sepatuRepository = new SepatuRepository();

    Keranjang keranjang;
    public ArrayList<Item> listItem = new ArrayList<Item>();

    public CartRepository() {
        Item item = new Item(120000, 3, sepatuRepository.listSepatuKulit.get(1));
        Item item2 = new Item(120000, 3, sepatuRepository.listSepatuKulit.get(2));
        Item item3 = new Item(120000, 3, sepatuRepository.listSepatuKulit.get(3));
        listItem.add(item);
        listItem.add(item2);
        listItem.add(item3);
    }

    public void setListItem(ArrayList<Item> listItem) {
        this.listItem = listItem;
        keranjang = new Keranjang(listItem);
    }

    public ArrayList<Item> getListItem() {
        return listItem;
    }

    public void addCartItem(Item item){
        listItem.add(item);
        keranjang = new Keranjang(listItem);
    }
}
