package com.example.uidesing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private EditText editNome, editEmail, editSenha;
    private Button btCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    editNome = findViewById(R.id.edtNome);
    editEmail = findViewById(R.id.edtEmail);
    editSenha = findViewById(R.id.edtSenha);
    btCadastro = findViewById(R.id.btCadastro);

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = editEmail.getText().toString();
                String senha = editSenha.getText().toString();
                String nome = editNome.getText().toString();


                boolean camposValidados = validaCadastro(nome, email, senha);

                if(camposValidados == true){

                    Toast.makeText(getApplicationContext(), email + senha + nome, Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(), "Preencha todos os campos", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public boolean validaCadastro(String vNome, String vEmail, String vSenha){

        boolean validaLogin = true;

        if(vEmail == null || vEmail.equals("")){
            validaLogin = false;
        }else if(vSenha == null || vSenha.equals("")){
            validaLogin = false;
        }else if(vNome == null || vNome.equals("")){
            validaLogin = false;
        }

        return validaLogin;
    }

}