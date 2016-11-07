package co.comss.fragmentsudea;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        FirstFragment fragment = new FirstFragment();
        ft.add(android.R.id.content, fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        switch (id) {
            case R.id.menuF1:
                FirstFragment fragment = new FirstFragment();
                ft.replace(android.R.id.content, fragment).commit();
                break;
            case R.id.menuF2:
                SecondFragment fragments = new SecondFragment();
                ft.replace(android.R.id.content, fragments).commit();
                break;
            case R.id.menuF3:
                ThirdFragment fragmentt = new ThirdFragment();
                ft.replace(android.R.id.content, fragmentt).commit();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
