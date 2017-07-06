package noerci.arvoresocietaria;
import com.orm.SugarRecord;
import com.orm.dsl.Unique;


public class ObjUsuario extends SugarRecord{
    @Unique
    String nome;
    String senha;

    public ObjUsuario(){

    }

    public ObjUsuario(String nome, String senha){
        this.nome = "NOME";
        this.senha = "SENHA";
    }
}