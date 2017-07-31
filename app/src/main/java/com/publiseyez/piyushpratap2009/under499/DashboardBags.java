package com.publiseyez.piyushpratap2009.under499;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.UnsupportedEncodingException;

/**
 * Created by piyush.pratap2009 on 7/29/2017.
 */

public class DashboardBags  extends Activity {

    ImageView handbag,shoulderbag,laptopbag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_bags);

        handbag=(ImageView)findViewById(R.id.handbag);
        shoulderbag=(ImageView)findViewById(R.id.shoulderbag);
        laptopbag=(ImageView)findViewById(R.id.laptopbag);

        handbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web=new Intent(DashboardBags.this,DashboardHandBags.class);
                startActivity(web);
            }
        });

        shoulderbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web=new Intent(DashboardBags.this,DashboardShoulderbags.class);
                startActivity(web);
            }
        });

        laptopbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web=new Intent(DashboardBags.this,DashboardlaptopBags.class);
                startActivity(web);
            }
        });

    }

}

