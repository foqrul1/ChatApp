package com.example.hp.MessangerApp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

interface ViewPagerAdapter {
    Fragment getItem(int position);

    int getCount();

    void addFragment(Fragment fragment, String title);

    @Nullable
    CharSequence getPageTitle(int position);
}
