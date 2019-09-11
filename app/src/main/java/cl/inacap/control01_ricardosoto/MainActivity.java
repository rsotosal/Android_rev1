package cl.inacap.control01_ricardosoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nomcli;
    private Spinner cbopla;
    private RadioButton rb1,rb2;
    private Button btnord;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

nomcli = (EditText) findViewById(R.id.nomcli);
cbopla = (Spinner) findViewById(R.id.cbopla);
rb1 = (RadioButton) findViewById(R.id.rb1);
rb2 =(RadioButton) findViewById(R.id.rb2);
btnord = (Button) findViewById(R.id.btnord);


solicitarOrden();

    }

    private void solicitarOrden (){
        btnord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tipo="";

                if(nomcli.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this, " -El Nombre No Debe Quedar Vacío -", Toast.LENGTH_SHORT).show();
                }else{

                    String nom = nomcli.getText().toString();
                    String pla = cbopla.getSelectedItem().toString();
                    tipo = "";

                    if(rb1.isChecked()){
                        tipo = rb1.getText().toString();
                    }else if(rb2.isChecked()){
                        tipo = rb2.getText().toString();
                    }
                }// Cerrar  if/else



                //Orden o = new Orden(nomcli,cbopla,tipo);

                //o.putExtra("nomcli",nomcli);
                //o.putExtra("cbopla",cbopla);
                //o.putExtra("rb1",rb1);

                //Intent o = new Intent(MainActivity.this,Main2Activity.class);


                }

        });

    }
}
