package com.thor.tokosepatu.ui.auth.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.thor.tokosepatu.databinding.ActivityLoginBinding;
import com.thor.tokosepatu.repository.UserRepository;
import com.thor.tokosepatu.model.Pembeli;
import com.thor.tokosepatu.model.Penjual;
import com.thor.tokosepatu.model.StatusPembeli;
import com.thor.tokosepatu.ui.MainActivity;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    UserRepository userRepository = new UserRepository();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final EditText usernameEditText = binding.username;
        final EditText passwordEditText = binding.password;
        final Button loginButton = binding.login;


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        });
    }

    private void login(String username, String password) {
        for (Pembeli userPembeli : userRepository.getListUserPembeli()) {
            Log.e("thor", userPembeli.username);
            if (username.equals(userPembeli.username) && password.equals(userPembeli.password)) {
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                finish();
            }
        }

        for (Penjual userPenjual : userRepository.getListUserPenjual()) {
            if (username.equals(userPenjual.username) && password.equals(userPenjual.password)) {
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                finish();
            }
        }
    }
}