package sergioescalona.myfirsttoolbar.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import sergioescalona.myfirsttoolbar.Adapters.PagerAdapter;
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

        //Creamos una referencia para el ViewPager
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        //Creamos un nuevo PagerAdapter
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        //Seteamos el adaptador.
        viewPager.setAdapter(adapter);
        //Añadimos un listener para cada vez que cambiemos de Fragment.
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //¿Qué tenemos que hacer para cambiar de un tab a otro?
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //Cuando Seleccionamos el Tab.
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //Cuando lo deseleccionamos.

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //Cuando lo volvemos a seleccionar.

            }
        });
    }
}
