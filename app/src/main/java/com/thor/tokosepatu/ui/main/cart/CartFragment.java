package com.thor.tokosepatu.ui.main.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.thor.tokosepatu.R;
import com.thor.tokosepatu.databinding.FragmentCartBinding;
import com.thor.tokosepatu.model.Item;
import com.thor.tokosepatu.repository.CartRepository;


public class CartFragment extends Fragment {

    private FragmentCartBinding binding;
    CartRepository cartRepository = new CartRepository();
    Item item;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CartViewModel cartViewModel =
                new ViewModelProvider(this).get(CartViewModel.class);

        binding = FragmentCartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        if (getArguments() != null) {
            item = CartFragmentArgs.fromBundle(getArguments()).getItem();

            View navigationView = getActivity().findViewById(R.id.nav_view);
            navigationView.setVisibility(View.GONE);
        }
        setupUI();
        return root;
    }

    private void setupUI() {
        if (item != null) {
            cartRepository.addCartItem(item);
        }
        CartAdapter cartAdapter = new CartAdapter(cartRepository.getListItem());
        binding.rvCart.setAdapter(cartAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}