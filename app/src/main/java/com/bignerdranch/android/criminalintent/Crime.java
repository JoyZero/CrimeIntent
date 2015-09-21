package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by General_zj on 2015/9/3.
 */
public class Crime {

    private String mTitle;
    private UUID mID;
    private Date mDate;
    private boolean mSloved;

    public Crime(){
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public UUID getID() {
        return mID;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSloved() {
        return mSloved;
    }

    public void setSloved(boolean sloved) {
        mSloved = sloved;
    }


}
