package com.example.uidesing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail, editSenha;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    editEmail = findViewById(R.id.edtEmail);
    editSenha = findViewById(R.id.edtSenha);
    btLogin = findViewById(R.id.btLogin);

    btLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String email = editEmail.getText().toString();
            String senha = editSenha.getText().toString();

            boolean camposValidados = validaLogin(email, senha);

            if(camposValidados == true){

                Toast.makeText(getApplicationContext(), email + senha, Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(getApplicationContext(), "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            }

        }
    });

    }

    public boolean validaLogin(String vEmail, String vSenha){

        boolean validaLogin = true;

        if(vEmail == null || vEmail.equals("")){
            validaLogin = false;
        }else if(vSenha == null || vSenha.equals("")){
            validaLogin = false;
        }

        return validaLogin;
    }



}