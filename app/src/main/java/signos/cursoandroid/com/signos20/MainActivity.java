package signos.cursoandroid.com.signos20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaDeSignos;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra",
            "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaDeSignos.setAdapter(adaptador);

        listaDeSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(), signos[codigoPosicao], Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(MainActivity.this , ResultadoActivity.class);
                intent.putExtra("codigoPosicao", codigoPosicao);
                startActivity(intent);


            }
        });

    }
}
