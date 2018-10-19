package com.example.arief.kasir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Transaksi extends AppCompatActivity {
    Toolbar toolbar;
    GridView gridView;

    String custemText[]={"Penjualan","Pembelian"};
    int costemImage[]={R.drawable.ic_shopping_cart_black_24dp,
    R.drawable.ic_add_shopping_cart_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        gridView=(GridView)findViewById(R.id.gridView);
        CustomGridViewActivity costomeAdapter = new CustomGridViewActivity(Transaksi.this,custemText,costemImage);
        gridView.setAdapter(costomeAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (custemText[i] == "Penjualan"){
                    Toast.makeText(Transaksi.this, "penjualan", Toast.LENGTH_SHORT).show();
                }else if (custemText[i] == "Penbelian"){
                    Toast.makeText(Transaksi.this, "penjualan", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
