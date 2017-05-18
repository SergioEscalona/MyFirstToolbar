package sergioescalona.myfirsttoolbar.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import sergioescalona.myfirsttoolbar.fragments.FirstFragment;
import sergioescalona.myfirsttoolbar.fragments.SecondFragment;
import sergioescalona.myfirsttoolbar.fragments.ThirdFragment;

/**
 * Created by Sergio on 18/05/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int tabs) {
        super(fm);
        this.numberOfTabs=tabs;
    }

    @Override
    public Fragment getItem(int position) {
        //getItem entra en acción cada vez que cambiamos de Fragment a través de una
        // posicion dada.

        switch (position){
            //nos permite cambiar entre los tres fragments.
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        //Nos indica el número de tabs que tenemos.
        return numberOfTabs;
    }
}
