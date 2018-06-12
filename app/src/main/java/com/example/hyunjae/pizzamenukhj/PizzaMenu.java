package com.example.hyunjae.pizzamenukhj;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class PizzaMenu extends Activity{

    private ImageView mainImage;
    private Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.menulist);
        mainImage = (ImageView)findViewById(R.id.mainImg);
        btn1 = (Button)findViewById(R.id.bt1);
        btn2 = (Button)findViewById(R.id.bt2);
        btn3 = (Button)findViewById(R.id.bt3);
        btn4 = (Button)findViewById(R.id.bt4);
        btn5 = (Button)findViewById(R.id.bt5);

        String pizzaname = getIntent().getStringExtra("pizza");
        if(("피자헛").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.pizzahut);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","피자헛");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    intent = intent.putExtra("피자메뉴","피자헛");
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-5588"));
                    startActivity(intent);
                }
            });
        }else if(("도미노").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.domino);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","도미노");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1577-3082"));
                    startActivity(intent);
                }
            });
        }else if(("미스터피자").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.mrpizza);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","미스터피자");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1577-0077"));
                    startActivity(intent);
                }
            });
        }else if(("피자알볼로").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.albolo);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","피자알볼로");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1688-8495"));
                    startActivity(intent);
                }
            });
        }else if(("피자스쿨").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.pizzaschool);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","피자스쿨");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setVisibility(View.INVISIBLE);
        }else if(("에땅").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.pizzaeddang);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","에땅");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1688-3651"));
                    startActivity(intent);
                }
            });
        }else if(("7번가").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.sevenpizza);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","7번가");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1688-7887"));
                    startActivity(intent);
                }
            });
        }else if(("피치").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.pizzanara);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,WebViewActivity.class);
                    intent = intent.putExtra("이벤트","피치");
                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setVisibility(View.INVISIBLE);
        }else if(("임실").equals(pizzaname)){
            mainImage.setImageResource(R.drawable.imsillpizza);
            btn1.setVisibility(View.INVISIBLE);//이벤트 메뉴 없음
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PizzaMenu.this,MenuLayoutActivity.class);
                    startActivity(intent);
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1588-4587"));
                    startActivity(intent);
                }
            });
        }

    }
}
