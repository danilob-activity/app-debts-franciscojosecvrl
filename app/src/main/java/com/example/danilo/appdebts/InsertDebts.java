package com.example.danilo.appdebts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class InsertDebts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_debts);
        getSupportActionBar().setDisplayHomeAsUpEnabled( true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled( true); //Ativar o botão
        getSupportActionBar().setTitle( "Inserir novo débito");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_add_dbts, menu);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptionsItemSelected(MenuItem item) { //Botão na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home: //ID do seu botão (gerado automaticamente pelo android, usando como
               // está, deve funcionar
                startActivity(new Intent(this, MainWindow.class)); //O efeito ao ser pressionado do botão
                //(no caso abre a activity)
                finishAffinity(); //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:
                break;
        }
        return true;
    }

}
