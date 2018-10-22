package com.example.arief.kasir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DaftarBarang extends AppCompatActivity {
//    ListView listView;
//    String name[]={"name 1","name 2"};
//    String desc[]={"desc 1","desc 2"};
//    int img[]={R.drawable.database, R.drawable.supplier};

    Toolbar toolbar;
    Button add;
    RecyclerView recyclerView;
    String [] name={
            "user 1",
            "user 2",
            "user 3"
    };
    String [] desc = {
            "desc 1",
            "desc 2",
            "desc 3"
    };
    int [] image={
            R.drawable.database,
            R.drawable.supplier,
            R.drawable.supplier
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_barang);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        add=(Button)findViewById(R.id.addBarang);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentadd = new Intent(DaftarBarang.this,AddBarang.class);
                startActivity(intentadd);
            }
        });

        recyclerView = (RecyclerView)findViewById(R.id.recycletView);
        List<User> sampleuser = new ArrayList<>();

        for(int i=0; i<name.length;i++){
            User user=new User();
            user.username = name[i];
            user.userdesc = desc[i];
            user.userimg = image[i];

            sampleuser.add(user);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getBaseContext(),sampleuser));
    }
}
