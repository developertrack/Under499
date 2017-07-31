package com.publiseyez.piyushpratap2009.under499;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.io.UnsupportedEncodingException;

/**
 * Created by piyush.pratap2009 on 7/2/2017.
 */

public class DashboardFashion extends Activity {

    String url_flip="https://dl.flipkart.com/dl/womens-clothing/pr?p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D500&viewType=grid&affid=piyushpra6&page=2&sid=2oq%2Fc1r";
    String url_amazon="https://www.amazon.in/s/ref=lp_1953602031_nr_p_36_5?rnid=4595083031&rh=n%3A1571271031%2Cn%3A%211571272031%2Cn%3A1953602031&qid=1499457529&bbn=1953602031&low-price=&high-price=500?ie=UTF8&tag=piyushprata01-21";
    String url_snapdeal="https://www.snapdeal.com/products/women-apparel?sort=plrty&q=Price%3A100%2C500%7C";
    String url_shopclues="http://clnk.in/e2bZ";
    String url_jabong="https://bit.ly/2teiGDK";
    String url_infibeam="http://www.infibeam.com/womens-casual-dresses#pricerange=below-500?trackId=piyushab7";
    String url_aliexpress="https://bit.ly/2v4nTeF";
    String url_ebay="https://bit.ly/2v4FcML";
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
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
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
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });

        snapdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_snapdeal, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
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
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
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
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
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
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
                web.putExtra("url",encod_url );
                startActivity(web);
            }
        });

        ebay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String encod_url="";
                try {
                    encod_url= java.net.URLDecoder.decode(url_ebay, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
                web.putExtra("url",encod_url);
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
                Intent web=new Intent(DashboardFashion.this,MainActivity.class);
                web.putExtra("url",encod_url);
                startActivity(web);
            }
        });

    }

}
