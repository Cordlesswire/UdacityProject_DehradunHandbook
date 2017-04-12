package in.thepolymath.dehradunhandbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LeisureAdapter extends FragmentPagerAdapter {

    public LeisureAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[]{"Malls", "Movies", "Shopping"};

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MallFragment();
        } else if (position == 1) {
            return new MoviesFragment();
        } else {
            return new ShopFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
