package aula05.rennanfelizardo.ufpb.br.aula05;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main);

        //para setar a toolbar no sistema
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CarrosAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Snackbar.make(view, "Clicou", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    //colocar opcoes na Toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflar o menu
        getMenuInflater().inflate(R.menu.main_menu, menu);

        //para tornar as opcoes visiveis
        return true;
    }

    //colocar acoes em cada item da Toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_add){
            Toast.makeText(MainActivity.this, "Adicionou", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
