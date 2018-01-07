package com.collectrouter.big5.portrait;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by apple on 18/1/6.
 */

public class PagerUserInfoInput implements MainPagerBase {
    private Context mContext = null;

    public PagerUserInfoInput(Context context) {
        mContext = context;
    }

    public String getPageTitle() {
        return "UserInfoInput";
    }

    @Override
    public View getRootView() {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View viewPage = layoutInflater.inflate(R.layout.page_userinfo_input, null);
        return viewPage;
    }
}
