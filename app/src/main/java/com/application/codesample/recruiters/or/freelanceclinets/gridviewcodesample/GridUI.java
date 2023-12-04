package com.application.codesample.recruiters.or.freelanceclinets.gridviewcodesample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.application.codesample.recruiters.or.freelanceclinets.gridviewcodesample.model.GridIDataItem;

import java.util.ArrayList;

public class GridUI extends AppCompatActivity {

    private GridView gridUi;
    private ArrayList<GridIDataItem> gridDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_ui);
        gridUi = findViewById(R.id.gridView);

        gridDataList = new ArrayList<>();

        gridDataList.add(new GridIDataItem("Select All", R.drawable.selectall));
        gridDataList.add(new GridIDataItem("Share", R.drawable.share));
        gridDataList.add(new GridIDataItem("Delete", R.drawable.delete));
        gridDataList.add(new GridIDataItem("Move", R.drawable.move));
        gridDataList.add(new GridIDataItem("Copy", R.drawable.copy));
        gridDataList.add(new GridIDataItem("Download", R.drawable.downloadicon));
        gridDataList.add(new GridIDataItem("Lock", R.drawable.lock));
        gridDataList.add(new GridIDataItem("Mark To Sign", R.drawable.markimportant));
        gridDataList.add(new GridIDataItem("Mark Important", R.drawable.markimportant));
        gridDataList.add(new GridIDataItem("Unlock", R.drawable.unlock));
        gridDataList.add(new GridIDataItem("Unmark Signing", R.drawable.unmark));
        gridDataList.add(new GridIDataItem("Umark Important", R.drawable.unmark));


        GridViewAdapter customAdapter = new GridViewAdapter(this, gridDataList);
        gridUi.setAdapter(customAdapter);

        gridUi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GridIDataItem item = (GridIDataItem) parent.getItemAtPosition(position);
                String selectedItem = item.getItemTitle();
                Toast.makeText(GridUI.this, "Clicked Item: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
