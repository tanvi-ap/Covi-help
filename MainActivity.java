package edu.niu.z1906477.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText cityNameET;
    private String cityName;
    private WebView mapWV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View  view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        cityNameET = findViewById(R.id.cityEditText);

        String url = "https://coronavirus.app/map";

      mapWV   = (WebView) findViewById(R.id.covidDetailWebView);
      mapWV.setInitialScale(170);
        mapWV.getSettings().setJavaScriptEnabled(true);
        mapWV.setWebViewClient(new WebViewClient());
        mapWV.loadUrl( url+ "");



    }//end onCreate

    private void dismissKeyboard( View view )
    {
        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
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
        //getDetailView(url);

    }

    public void getDetailView(View view)
    {

        String  cityName = cityNameET.getText().toString();

        cityNameET.clearFocus();
        if(cityName.equals(""))
            Toast.makeText(MainActivity.this,"State cannot be empty!", Toast.LENGTH_LONG).show();

        else {
            // WebView coronaWebView = (WebView) findViewById(R.id.covidDetailWebView);
            String url = getURL(cityNameET.getText().toString());
            System.out.println(url);

            mapWV.getSettings().setJavaScriptEnabled(true);
            mapWV.setInitialScale(220);
            mapWV.setWebViewClient(new WebViewClient());
            mapWV.loadUrl(url + "");
        }//end else
    }

    public void getInfo(View view)
    {
        getDetailView(view);
        dismissKeyboard(cityNameET);


    }

    public void showMap(View view)
    {
        cityName = cityNameET.getText().toString();
        if(cityName.equals(""))
            Toast.makeText(MainActivity.this,"State cannot be empty!", Toast.LENGTH_LONG).show();

        else {
            Intent showMap = new Intent(this, MapsActivity.class);
            showMap.putExtra("StateName",cityName);
            startActivity(showMap);

        }
        dismissKeyboard(cityNameET);

    }

}