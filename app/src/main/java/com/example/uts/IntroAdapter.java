package com.example.uts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//10116020
// muhammad zulfikar hassan
//AKB1/IF 1
//21-05-2019

public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            return new FirstFragmen();
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
        return 3;
    }
}
