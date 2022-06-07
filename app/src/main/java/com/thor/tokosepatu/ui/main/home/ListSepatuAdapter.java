package com.thor.tokosepatu.ui.main.home;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thor.tokosepatu.R;
import com.thor.tokosepatu.databinding.ShoesItemBinding;
import com.thor.tokosepatu.model.Sepatu;
import com.thor.tokosepatu.model.SepatuKulit;

import java.util.ArrayList;

public class ListSepatuAdapter extends
        RecyclerView.Adapter<ListSepatuAdapter.ViewHolder> {
    ArrayList<SepatuKulit> listSepatu;

    private OnItemClickCallback onItemClickCallback;

    interface OnItemClickCallback {
        public void onItemClicked(int id);
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    public ListSepatuAdapter(ArrayList<SepatuKulit> listSepatu) {
        this.listSepatu = listSepatu;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ShoesItemBinding binding;

        public ViewHolder(ShoesItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ShoesItemBinding binding = ShoesItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Sepatu sepatu = listSepatu.get(position);
        holder.binding.namaSepatu.setText(sepatu.nama_sepatu);
        holder.binding.hargaSepatu.setText(String.valueOf(sepatu.harga));
        holder.binding.imageView.setImageResource(R.drawable.img);


        holder.itemView.setOnClickListener(view -> {
          onItemClickCallback.onItemClicked(sepatu.id);
        });
        Log.e("Thor", String.valueOf(sepatu.harga));
    }

    @Override
    public int getItemCount() {
        return listSepatu.size();
    }

}
