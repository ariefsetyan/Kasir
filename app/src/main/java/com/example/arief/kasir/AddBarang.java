package com.example.arief.kasir;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AddBarang extends AppCompatActivity {
    LinearLayout linearLayout;
    Toolbar toolbar;
    Button button;
    TextInputLayout kodelayoat,namaLayout,harBeliLayout,harJualLayout,stokLayout;
    AppCompatEditText kode,nama,hargabeli,harhajual,stok;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }
//        Intent intent = new Intent(AddBarang.this,Home.class);
//        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_barang);

        toolbar=(Toolbar)findViewById(R.id.toolbar);

        kodelayoat=(TextInputLayout)findViewById(R.id.kode_textInputlayout);
        kode = (AppCompatEditText) findViewById(R.id.kodebarang);

        namaLayout=(TextInputLayout)findViewById(R.id.namatextInputlayout);
        nama = (AppCompatEditText) findViewById(R.id.namabarang);

        harBeliLayout=(TextInputLayout)findViewById(R.id.hargabelitextInputlayout);
        hargabeli=(AppCompatEditText)findViewById(R.id.hargabeli);

        harJualLayout = (TextInputLayout)findViewById(R.id.hargajual_textInputlayout);
        harhajual =(AppCompatEditText)findViewById(R.id.hargajual);

        stokLayout = (TextInputLayout)findViewById(R.id.stok_extInputlayout);
        stok=(AppCompatEditText)findViewById(R.id.stok);

        linearLayout=(LinearLayout)findViewById(R.id.linierLayout);
        linearLayout.setOnClickListener(null);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nama.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (nama.getText().toString().isEmpty()){
                    namaLayout.setErrorEnabled(true);
                    namaLayout.setError("Please enter Nama");
                }else {
                    namaLayout.setErrorEnabled(false);
                }
            }
        });
        nama.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (nama.getText().toString().isEmpty()){
                    namaLayout.setErrorEnabled(true);
                    namaLayout.setError("Please enter Nama");
                }else {
                    namaLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        hargabeli.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (hargabeli.getText().toString().isEmpty()){
                    harBeliLayout.setErrorEnabled(true);
                    harBeliLayout.setError("Please enter harga beli");
                }else {
                    harBeliLayout.setErrorEnabled(false);
                }
            }
        });
        hargabeli.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (hargabeli.getText().toString().isEmpty()){
                    harBeliLayout.setErrorEnabled(true);
                    harBeliLayout.setError("Please enter harga beli");
                }else {
                    harBeliLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        harhajual.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (harhajual.getText().toString().isEmpty()){
                    harJualLayout.setErrorEnabled(true);
                    harJualLayout.setError("Please enter harga jual");
                }else {
                    harJualLayout.setErrorEnabled(false);
                }
            }
        });
        harhajual.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (harhajual.getText().toString().isEmpty()){
                    harJualLayout.setErrorEnabled(true);
                    harJualLayout.setError("Please enter harag jual");
                }else {
                    harJualLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        stok.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (stok.getText().toString().isEmpty()){
                    stokLayout.setErrorEnabled(true);
                    stokLayout.setError("Please enter stok");
                }else {
                    stokLayout.setErrorEnabled(false);
                }
            }
        });
        stok.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (stok.getText().toString().isEmpty()){
                    stokLayout.setErrorEnabled(true);
                    stokLayout.setError("Please enter stok");
                }else {
                    stokLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        button = (Button)findViewById(R.id.simpan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
