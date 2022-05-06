package edu.niu.z1906477.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import java.util.Locale;

public class InfoActivity extends AppCompatActivity {

    private EditText cityNameET;
    String cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Bundle extras = getIntent().getExtras();
        cityName = extras.getString("CityName");

        System.out.println("******** "+cityName);
       // getURL(cityName);
    }

    public String getURL(String cityName)
    {
        //perform check if first character is upper case and change it to lower case
        if(Character.isUpperCase(cityName.charAt(0)))
            cityName= cityName.substring(0,1).toLowerCase(Locale.ROOT)+cityName.substring(1);


        if(cityName.contains(" "))
            cityName=cityName.replace(" ","");

        String url = "https://www.bing.com/covid/local/"+cityName+"_unitedstates";
        // cityName = cityNameET.getText().toString();

        System.out.println(url);

       return url;
    //    getDetailView(url);

    }

    public void getDetailView(View view)
    {
      String  cityName = cityNameET.getText().toString();

        cityNameET.clearFocus();

        WebView coronaWebView = (WebView) findViewById(R.id.covidDetailWebView);
        String url = getURL(cityNameET.getText().toString());
        System.out.println(url);

        coronaWebView.getSettings().setJavaScriptEnabled(true);
        coronaWebView.setWebViewClient(new WebViewClient());
        coronaWebView.loadUrl(url + "");
    }


    public void goBack(View view)
    {
        finish();
    }
}