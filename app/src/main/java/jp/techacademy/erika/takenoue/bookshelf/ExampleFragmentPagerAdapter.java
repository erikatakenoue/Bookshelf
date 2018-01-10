package jp.techacademy.erika.takenoue.bookshelf;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ExampleFragmentPagerAdapter extends FragmentPagerAdapter {
    public ExampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.newInstance(android.R.color.holo_blue_bright);
            case 1:
                return ExampleFragment.newInstance(android.R.color.holo_green_light);
            case 2:
                return ExampleFragment.newInstance(android.R.color.holo_red_light);
            case 3:
                return ExampleFragment.newInstance(android.R.color.holo_blue_bright);
            case 4:
                return ExampleFragment.newInstance(android.R.color.holo_blue_bright);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "本棚";
            case 1:
                return "読了本";
            case 2:
                return "読書中";
            case 3:
                return "積読本";
            case 4:
                return "気になる";
        }
        return null;
    }

}