package com.example.arief.kasir;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AddBarang extends AppCompatActivity {
    Toolbar toolbar;
    Button button;
    TextInputLayout kodelayoat,namaLayout,harBeliLayout,harJualLayout,stokLayout;
    AppCompatActivity kode,nama,hargabeli,harhajual,stok;
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
////        Intent intent = new Intent(AddBarang.this,Home.class);
////        startActivity(intent);
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_barang);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        namaLayout=(TextInputLayout)findViewById(R.id.namatextInputlayout);
        harBeliLayout=(TextInputLayout)findViewById(R.id.hargabelitextInputlayout);
        harJualLayout = (TextInputLayout)findViewById(R.id.hargajual_textInputlayout);
        stokLayout = (TextInputLayout)findViewById(R.id.stok_extInputlayout);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        button = (Button)findViewById(R.id.simpan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
