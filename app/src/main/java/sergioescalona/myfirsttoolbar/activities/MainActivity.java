package sergioescalona.myfirsttoolbar.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import sergioescalona.myfirsttoolbar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        //Creamos una referencia para el TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        //Creamos tres tabs y le añadimos texto.
        TabLayout.Tab tab1 = tabLayout.newTab().setText("Tab 1");
        TabLayout.Tab tab2 = tabLayout.newTab().setText("Tab 2");
        TabLayout.Tab tab3 = tabLayout.newTab().setText("Tab 3");
        //Añadimos dichos tabs al TabLayout.
        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);
        tabLayout.addTab(tab3);
        //Colocamos los tabs.
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
    }
}
