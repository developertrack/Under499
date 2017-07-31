package com.publiseyez.piyushpratap2009.under499;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.io.UnsupportedEncodingException;

/**
 * Created by piyush.pratap2009 on 7/30/2017.
 */

public class DashboardlaptopBags extends Activity {

    String url_flip="http://fkrt.it/RaXce!NNNN";
    String url_amazon="http://bit.ly/2tNCkCP";
    String url_shopclues="http://clnk.in/e3AD";
    String url_jabong="https://bit.ly/2tNzde9";
    String url_infibeam="https://bit.ly/2tNOg7m";
    String url_aliexpress="https://bit.ly/2tNOqeY";
    LinearLayout flipkart,amazon,snapdeal,shopclues,jabong,infibeam,aliexpress,ebay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        flipkart=(LinearLayout)findViewById(R.id.flipkart);
        amazon=(LinearLayout)findViewById(R.id.amazon);
        snapdeal=(LinearLayout)findViewById(R.id.snapdeal);
        shopclues=(LinearLayout)findViewById(R.id.shopclues);
        jabong=(LinearLayout)findViewById(R.id.jabong);
        infibeam=(LinearLayout)findViewById(R.id.infibeam);
        aliexpress=(LinearLayout)findViewById(R.id.aliexpress);
        ebay=(LinearLayout)findViewById(R.id.ebay);

        flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_flip, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardlaptopBags.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });

        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_amazon, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardlaptopBags.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });



        shopclues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_shopclues, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardlaptopBags.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });

        jabong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_jabong, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardlaptopBags.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });

        infibeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_infibeam, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardlaptopBags.this,MainActivity.class);
                web.putExtra("url",encod_url );
                startActivity(web);
            }
        });



        aliexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_aliexpress, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardlaptopBags.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });

    }

}
