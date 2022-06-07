package com.thor.tokosepatu.ui.main.cart;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thor.tokosepatu.R;
import com.thor.tokosepatu.databinding.CartItemBinding;
import com.thor.tokosepatu.model.Item;
import com.thor.tokosepatu.model.Sepatu;

import java.util.ArrayList;

public class CartAdapter extends
        RecyclerView.Adapter<CartAdapter.ViewHolder> {
    ArrayList<Item> listItem;

    public CartAdapter(ArrayList<Item> listItem) {
        this.listItem = listItem;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CartItemBinding binding;

        public ViewHolder(CartItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CartItemBinding binding = CartItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = listItem.get(position);
        holder.binding.namaSepatu.setText(item.m_Sepatu.nama_sepatu);
        holder.binding.hargaSepatu.setText(String.valueOf(item.harga));
        holder.binding.imageView.setImageResource(R.drawable.img);

    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

}
