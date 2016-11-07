package co.comss.fragmentsudea;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    private ViewPager vP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        PagerAdapter pA = new PagerAdapter(getSupportFragmentManager());
        vP = (ViewPager) findViewById(R.id.pager);
        vP.setAdapter(pA);

        ActionBar  aB = getSupportActionBar();
        aB.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {

            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                vP.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        };

        ActionBar.Tab tab = aB.newTab().setText("Frag 1").setTabListener(tabListener);
        aB.addTab(tab);
        tab = aB.newTab().setText("Frag 2").setTabListener(tabListener);
        aB.addTab(tab);
        tab = aB.newTab().setText("Frag 3").setTabListener(tabListener);
        aB.addTab(tab);
        /*
        vP.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            public void onPageSelected(int position) {
                getSupportActionBar().setSelectedNavigationItem(position);
            }
        }); */
    }

    public class PagerAdapter extends FragmentPagerAdapter {
        public PagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new FirstFragment();
                case 1: return new SecondFragment();
                case 2: return new ThirdFragment();
                default: return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
