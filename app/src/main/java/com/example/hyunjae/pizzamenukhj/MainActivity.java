package com.example.hyunjae.pizzamenukhj;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton pizzahut,dominopizza,mrpizza,pizzaalbolo,pizzaschool,pizzaeddang,sevenpizza,pizzanara,imsillpizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzahut = (ImageButton) findViewById(R.id.pizzahutBtn);
        dominopizza = (ImageButton) findViewById(R.id.dominoBtn);
        mrpizza = (ImageButton)findViewById(R.id.mrpizzaBtn);
        pizzaalbolo = (ImageButton)findViewById(R.id.alboloBtn);
        pizzaschool = (ImageButton)findViewById(R.id.pizzaschoolBtn);
        pizzaeddang = (ImageButton)findViewById(R.id.pizzaEddangBtn);
        sevenpizza = (ImageButton)findViewById(R.id.sevenpizzaBtn);
        pizzanara = (ImageButton)findViewById(R.id.pizzanaraBtn);
        imsillpizza = (ImageButton)findViewById(R.id.imsillBtn);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PizzaMenu.class);
                switch (v.getId()){
                    case R.id.pizzahutBtn:
                        intent = intent.putExtra("pizza","피자헛");
                        startActivity(intent);
                        break;
                    case R.id.dominoBtn:
                        intent = intent.putExtra("pizza","도미노");
                        startActivity(intent);
                        break;
                    case R.id.mrpizzaBtn:
                        intent = intent.putExtra("pizza","미스터피자");
                        startActivity(intent);
                        break;
                    case R.id.alboloBtn:
                        intent = intent.putExtra("pizza","피자알볼로");
                        startActivity(intent);
                        break;
                    case R.id.pizzaschoolBtn:
                        intent = intent.putExtra("pizza","피자스쿨");
                        startActivity(intent);
                        break;
                    case R.id.pizzaEddangBtn:
                        intent = intent.putExtra("pizza","에땅");
                        startActivity(intent);
                        break;
                    case R.id.sevenpizzaBtn:
                        intent = intent.putExtra("pizza","7번가");
                        startActivity(intent);
                        break;
                    case R.id.pizzanaraBtn:
                        intent = intent.putExtra("pizza","피치");
                        startActivity(intent);
                        break;
                    case R.id.imsillBtn:
                        intent = intent.putExtra("pizza","임실");
                        startActivity(intent);
                        break;
                }
            }
        };

        pizzahut.setOnClickListener(listener);
        dominopizza.setOnClickListener(listener);
        pizzaalbolo.setOnClickListener(listener);
        mrpizza.setOnClickListener(listener);
        pizzaschool.setOnClickListener(listener);
        pizzaeddang.setOnClickListener(listener);
        sevenpizza.setOnClickListener(listener);
        pizzanara.setOnClickListener(listener);
        imsillpizza.setOnClickListener(listener);
    }
}

