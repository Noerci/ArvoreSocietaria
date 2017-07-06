package noerci.arvoresocietaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;


public class CadastroConfirm extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_confirm);

        Intent it = getIntent();
        if(it != null){
            Bundle parametros = it.getExtras();
                if(parametros != null){
                    String nome = parametros.getString("nome");
                    String senha = parametros.getString("senha");

                   //TextView nomeView = (TextView) findViewById(R.id.nomeText);
                   //TextView senhaView = (TextView) findViewById(R.id.senhaText);

                    ObjUsuario usuario = new ObjUsuario(nome, senha);
                    usuario.save();

                    //nomeView.setText(nome);
                    //senhaView.setText(senha);
                    new Handler().postDelayed(new Runnable() {
                        /*
                         * Exibindo splash com um timer.
                         */
                        @Override
                        public void run() {
                            // Esse método será executado sempre que o timer acabar
                            // E inicia a activity principal
                            Intent i = new Intent(CadastroConfirm.this, MainActivity.class);
                            startActivity(i);

                            // Fecha esta activity
                            finish();
                        }
                    }, 3000);
                }
        }
    }
}
