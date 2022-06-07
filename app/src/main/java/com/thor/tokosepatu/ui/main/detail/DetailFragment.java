package com.thor.tokosepatu.ui.main.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.thor.tokosepatu.R;
import com.thor.tokosepatu.databinding.FragmentDetailBinding;
import com.thor.tokosepatu.model.Item;
import com.thor.tokosepatu.model.Sepatu;
import com.thor.tokosepatu.repository.SepatuRepository;

public class DetailFragment extends Fragment {

    private DetailViewModel mViewModel;
    SepatuRepository sepatuRepository = new SepatuRepository();
    private FragmentDetailBinding binding;

    public static DetailFragment newInstance() {
        return new DetailFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentDetailBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        int id = DetailFragmentArgs.fromBundle(getArguments()).getIdSepatu();

//        binding.namaSepatu.setText(id);

        Sepatu sepatu = sepatuRepository.getSepatuKulitId(id);
        if (sepatu != null) {
            binding.namaSepatu.setText(String.valueOf(sepatu.nama_sepatu));
            binding.hargaSepatu.setText(String.valueOf(sepatu.harga));
            binding.deskripsi.setText(String.valueOf(sepatu.deskripsi));
            binding.imageView3.setImageResource(R.drawable.img);
        }

        binding.button.setOnClickListener(view -> {
            Item item = new Item(120000, 3, sepatuRepository.listSepatuKulit.get(1));
            NavDirections action = DetailFragmentDirections.actionDetailFragmentToNavigationCart2(item);
            Navigation.findNavController(this.requireView()).navigate(action);
        });

        return root;
    }

}