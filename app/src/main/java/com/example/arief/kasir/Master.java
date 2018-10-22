package com.example.arief.kasir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Master extends AppCompatActivity {
    Toolbar toolbar;
    GridView gridView;
    String CustomGridViewActivity[]={"Barang",
            "Karyawan",
            "Supplier"};
    int gridViewImageId[]={R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_ind_black_24dp,
            R.drawable.supplier};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gridView=(GridView)findViewById(R.id.gridView);
        final CustomGridViewActivity customAdapter = new CustomGridViewActivity(Master.this,CustomGridViewActivity,gridViewImageId);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (CustomGridViewActivity[i] == "Barang"){
                    Intent intentBarang = new Intent(Master.this,DaftarBarang.class);
                    startActivity(intentBarang);
                }else if (CustomGridViewActivity[i]=="Karyawan"){
                    Intent intentKaryawan = new Intent(Master.this,DaftarKaryawan.class);
                    startActivity(intentKaryawan);
                }else  if (CustomGridViewActivity[i] == "Supplier"){
                    Toast.makeText(Master.this, "suppleir", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
