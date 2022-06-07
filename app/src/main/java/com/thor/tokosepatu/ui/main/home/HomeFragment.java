package com.thor.tokosepatu.ui.main.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.thor.tokosepatu.databinding.FragmentHomeBinding;
import com.thor.tokosepatu.repository.SepatuRepository;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    SepatuRepository sepatuRepository = new SepatuRepository();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        setupUI();
//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    private void setupUI() {
        ListSepatuAdapter listSepatuAdapter = new ListSepatuAdapter(sepatuRepository.getListSepatuKulit());
        binding.rvSepatu.setAdapter(listSepatuAdapter);

//
        listSepatuAdapter.setOnItemClickCallback(id -> {
            NavDirections action = HomeFragmentDirections.actionNavigationHomeToDetailFragment(id);
            Navigation.findNavController(this.requireView()).navigate(action);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}