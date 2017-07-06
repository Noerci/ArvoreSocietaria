package noerci.arvoresocietaria;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void btnCadastro(View view){

        EditText nome = (EditText) findViewById(R.id.nomeText);
        EditText senha = (EditText) findViewById(R.id.senhaText);

        Intent it = new Intent(this, CadastroConfirm.class);

        Bundle parametros = new Bundle();
        parametros.putString("nome", nome.getText().toString());
        parametros.putString("senha", senha.getText().toString());

        it.putExtras(parametros);

        startActivity(it);
        finish();
    }
}





