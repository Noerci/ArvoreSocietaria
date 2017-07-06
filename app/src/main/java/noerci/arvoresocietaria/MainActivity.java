package noerci.arvoresocietaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickBtnEntrar(View view){
        String login = ((EditText) findViewById(R.id.usuarioText)).getText().toString();
        String senha = ((EditText) findViewById(R.id.senhaText)).getText().toString();
        //List<ObjUsuario> logincheck = (ObjUsuario.find(ObjUsuario.class,"nome = ? and senha = ?", login, senha));

        if (login == "admin" & senha == "admin"){
            Intent it = new Intent(this, DashboardActivity.class);
            startActivity(it);
        } else {
            Intent it = new Intent(this, LoginErrosActivity.class);
            startActivity(it);
        }
    };

    public void clickBtnDash(View view){
        Intent it = new Intent(this, Cadastro.class);
        startActivity(it);
    };




}
