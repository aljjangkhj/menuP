package com.example.hyunjae.pizzamenukhj;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MenuLayoutActivity extends Activity {

    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        String pizzaname = getIntent().getStringExtra("피자메뉴");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        if(("피자헛").equals(pizzaname)){
            PizzaHutDialog();
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-5588"));
                    startActivity(intent);
                }
            });
        }else if(("도미노피자").equals(pizzaname)){

        }
    }

    private void PizzaHutPoJang(){
        listViewAdapter = new ListViewAdapter();
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(listViewAdapter);
        listViewAdapter.addItem2("tsssssssssssss");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.crunch_cube_steack),"크런치 큐브 스테이크","M 17,940\nL 21,540");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.gailc_butter_shrimp),"갈릭 버터 쉬림프","M 17,340\nL 20,940");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.toping_king),"토핑 킹","M 17,340\nL 20,940");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.crunch_chease_steack),"크런치 치즈 스테이크","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.chease_king),"치즈 킹","M 17,340\nL 20,940");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.jeekhya_boolgogi),"직화 불고기","M 17,340\nL 20,940");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.double_babeku),"더블 바비큐","M 17,340\nL 20,940");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.beykean_photato),"베이컨 포테이토","M 16,140\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.super_supream),"슈퍼 슈프림","M 16,140\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.babeku_chicken),"바비큐 치킨","M 17,340\nL 20,940");
        listViewAdapter.addItem2("tsssssssssssss");
    }

    private void PizzaHutBdal(){
        listViewAdapter = new ListViewAdapter();
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(listViewAdapter);
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.crunch_chease_steack),"크런치 큐브 스테이크","M 20,930\nL 25,130");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.gailc_butter_shrimp),"갈릭 버터 쉬림프","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.toping_king),"토핑킹","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.crunch_cube_steack),"크런치 치즈 스테이크","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.chease_king),"치즈킹","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.jeekhya_boolgogi),"직화불고기","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.double_babeku),"더블바비큐","M 20,230\nL 24,430");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.beykean_photato),"베이컨포테이토","M 18,830\nL 23,030");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.super_supream),"슈퍼슈프림","M 18,830\nL 23,030");
        listViewAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.babeku_chicken),"바비큐치킨","M 20,230\nL 24,430");
    }

    private void PizzaHutDialog(){
        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(MenuLayoutActivity.this);
        alertdialog.setMessage("배달 & 포장 선택하세요.");
        alertdialog.setPositiveButton("포장", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String pizzaname = getIntent().getStringExtra("피자메뉴");
                if(("피자헛").equals(pizzaname)){
                    AlertDialog.Builder alertdialog2 = new AlertDialog.Builder(MenuLayoutActivity.this);
                    alertdialog2.setMessage("피자를 선택하세요.");
                    alertdialog2.setPositiveButton("1", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alertdialog2.setNegativeButton("2", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alertdialog2.setNeutralButton("3", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    AlertDialog alert = alertdialog2.create();
                    alert.show();

                    PizzaHutPoJang();
                }else if(("도미노피자").equals(pizzaname)){

                }
            }
        });
        alertdialog.setNegativeButton("배달", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String pizzaname = getIntent().getStringExtra("피자메뉴");
                if(("피자헛").equals(pizzaname)){
                    PizzaHutBdal();
                }else if(("도미노피자").equals(pizzaname)){

                }
            }
        });
        AlertDialog alert = alertdialog.create();
        alert.show();
    }
}
