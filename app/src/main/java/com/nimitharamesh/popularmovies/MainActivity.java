package com.nimitharamesh.popularmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
//        setSupportActionBar(myToolbar);

        // Checks Internet connectivity
//        isInternetOn(getApplicationContext());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MovieFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
//    public final void isInternetOn(Context context) {
//
//        ConnectivityManager cm =
//                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
//
//        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
//        boolean isConnected = activeNetwork != null &&
//                activeNetwork.isConnectedOrConnecting();
//
//        String status = NetworkCheck.getConnectivityStatusString(context);
//        Toast.makeText(this, status, Toast.LENGTH_LONG).show();
//
//
//    }
}
