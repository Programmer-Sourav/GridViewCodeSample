package com.application.codesample.recruiters.or.freelanceclinets.gridviewcodesample.model;

import android.graphics.drawable.Drawable;

public class GridIDataItem {

    public GridIDataItem(String title, int drawable) {
        this.itemTitle = title;
        this.itemIcon =  drawable;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public int getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }

    private String itemTitle;
    private int itemIcon;
}
