package in.thepolymath.dehradunhandbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FoodAdapter extends FragmentPagerAdapter {

    public FoodAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[]{"Restaurants", "Fast Food", "Cafes", "Local Joints"};

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new FastFoodFragment();
        } else if (position == 2) {
            return new CafeFragment();
        } else {
            return new LocalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
