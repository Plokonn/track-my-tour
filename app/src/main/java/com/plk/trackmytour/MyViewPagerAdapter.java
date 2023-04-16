package com.plk.trackmytour;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.plk.trackmytour.fragments.HistoryFragment;
import com.plk.trackmytour.fragments.TrackerFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TrackerFragment();
            case 1:
                return new HistoryFragment();
            default:
                return new TrackerFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
