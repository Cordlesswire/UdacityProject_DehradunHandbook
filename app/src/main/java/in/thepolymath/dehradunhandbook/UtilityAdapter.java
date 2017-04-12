package in.thepolymath.dehradunhandbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class UtilityAdapter extends FragmentPagerAdapter {

    public UtilityAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[]{"Emergency", "Hospitals", "Bakeries"};

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EmergencyFragment();
        } else if (position==1){
            return new HospitalFragment();
        }
        else return new BakeryFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
