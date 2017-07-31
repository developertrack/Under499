package com.publiseyez.piyushpratap2009.under499;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by piyush.pratap2009 on 7/21/2017.
 */

public class Home extends Activity {

    LinearLayout personalcare,sunglasses,watch,lingere,jwellery,appliances,shoes,bags,fashion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);


        fashion=(LinearLayout)findViewById(R.id.fashion);
        personalcare=(LinearLayout)findViewById(R.id.personalcare);
        sunglasses=(LinearLayout)findViewById(R.id.sunglasses);
        watch=(LinearLayout)findViewById(R.id.watch);
        lingere=(LinearLayout)findViewById(R.id.lingere);
        jwellery=(LinearLayout)findViewById(R.id.jwellery);
        appliances=(LinearLayout)findViewById(R.id.appliances);
        shoes=(LinearLayout)findViewById(R.id.shoes);
        bags=(LinearLayout)findViewById(R.id.bags);


        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardFashion.class);
                int_fashion.putExtra("activity","fashion");
                startActivity(int_fashion);

            }
        });

        personalcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardPersonalCare.class);
                int_fashion.putExtra("activity","personalcare");
                startActivity(int_fashion);

            }
        });


        sunglasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardSunglasses.class);
                int_fashion.putExtra("activity","sunglasses");
                startActivity(int_fashion);

            }
        });

        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardWatch.class);
                int_fashion.putExtra("activity","watch");
                startActivity(int_fashion);

            }
        });


        lingere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardLingerie.class);
                int_fashion.putExtra("activity","lingere");
                startActivity(int_fashion);

            }
        });


        jwellery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardJwellery.class);
                int_fashion.putExtra("activity","jwellery");
                startActivity(int_fashion);

            }
        });


        appliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardAppliances.class);
                int_fashion.putExtra("activity","appliances");
                startActivity(int_fashion);

            }
        });


        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardShoes.class);
                int_fashion.putExtra("activity","shoes");
                startActivity(int_fashion);

            }
        });


        bags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int_fashion=new Intent(Home.this, DashboardBags.class);
                int_fashion.putExtra("activity","bags");
                startActivity(int_fashion);

            }
        });




    }
}
