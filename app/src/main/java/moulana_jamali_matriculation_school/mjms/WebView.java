package moulana_jamali_matriculation_school.mjms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {
    private android.webkit.WebView mywebView;
    private ProgressDialog progressDialog;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;
    private SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        swipe = (SwipeRefreshLayout)findViewById(R.id.swipe);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                WebAction();
            }
        });

        WebAction();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView=(NavigationView) findViewById(R.id.nav_views);
        drawerLayout=(DrawerLayout) findViewById(R.id.navigayion_id);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                drawerLayout.closeDrawers();
                int id = item.getItemId();
                switch (item.getItemId()) {
                    case R.id.nav_about_us: {
                        startActivity(new Intent(WebView.this,About_us_activity.class));
                        break;
                    }
                    case R.id.nav_home: {
                        mywebView.loadUrl("http://gpsalert.me/gs3.3/mobile/");
                        break;
                    }
                    case R.id.nav_contact_us: {
                        startActivity(new Intent(WebView.this,Contact_us_activity.class));
                        break;
                    }
                    case R.id.nav_exit: {
                        Logout();
                        break;
                    }
                }
                return true;
            }
        });
    }
    public void WebAction() {
        mywebView=(android.webkit.WebView) findViewById(R.id.webview);
        mywebView.getSettings().setJavaScriptEnabled(true);
        mywebView.getSettings().setAppCacheEnabled(true);
        mywebView.loadUrl("http://gpsalert.me/gs3.3/mobile/");
        mywebView.getSettings().setBuiltInZoomControls(true);
        swipe.setRefreshing(true);
        mywebView.getSettings().setUseWideViewPort(true);

        mywebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(android.webkit.WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);

                mywebView.loadUrl("file:///android_asset/error.html");
            }

            @Override
            public void onPageFinished(android.webkit.WebView view, String url) {
                swipe.setRefreshing(false);
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack()){
            mywebView.goBack();
        }else{
            super.onBackPressed();}

    }
    private void Logout(){
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Exiting App please wait...");
        progressDialog.show();
        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(500);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {

                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);

                }
            }
        };timer.start();


    }
}
