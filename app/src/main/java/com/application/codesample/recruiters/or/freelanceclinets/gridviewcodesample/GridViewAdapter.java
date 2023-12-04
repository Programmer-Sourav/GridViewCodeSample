package com.application.codesample.recruiters.or.freelanceclinets.gridviewcodesample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.application.codesample.recruiters.or.freelanceclinets.gridviewcodesample.model.GridIDataItem;

import java.util.List;

public class GridViewAdapter extends ArrayAdapter<GridIDataItem> {

    public GridViewAdapter(Context context, List<GridIDataItem> data) {
        super(context, 0, data);
    }

    @Override
    public View getView(int position, View gridView, ViewGroup parent) {

        GridIDataItem dataObject = getItem(position);

        if (gridView == null) {
            gridView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item_layout, parent, false);
        }

        TextView itemName = gridView.findViewById(R.id.gridItemTitle);
        ImageView itemIcon = gridView.findViewById(R.id.gridItemImg);

        if (dataObject != null) {
            itemName.setText(dataObject.getItemTitle());
            itemIcon.setImageResource(dataObject.getItemIcon());
        }


        return gridView;
    }
}

