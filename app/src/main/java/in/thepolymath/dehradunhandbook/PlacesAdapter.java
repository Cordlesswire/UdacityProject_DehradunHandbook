package in.thepolymath.dehradunhandbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlacesAdapter extends FragmentPagerAdapter {

    public PlacesAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[]{"Landmarks", "Pilgrim Route"};

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarkFragment();
        } else {
            return new PilgrimFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
