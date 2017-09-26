package com.morihacky.android.rxjava.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.morihacky.android.rxjava.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by 1 on 2017-09-22.
 */

public class MainFragment extends BaseFragment {

    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        mUnbinder = ButterKnife.bind(this, layout);
        return layout;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }


    @OnClick(R.id.btn_demo_schedulers)
    void demoConcurrencyWithSchedulers() {
        clickOn(new ConcurrencyWithSchedulersDemoFragment());
    }

    private void clickOn(@NonNull Fragment fragment) {
        final String tag = fragment.getClass().getName();
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(tag)
                .replace(android.R.id.content, fragment, tag)
                .commit();
    }
}
