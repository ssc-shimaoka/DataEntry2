package com.example.dataentry2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Model> {
    private LayoutInflater layoutInflater;

    public ListViewAdapter(Context context, int resource, List<Model> objects) {
        super(context, resource, objects);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Model data = (Model)getItem(position);
        if (null == convertView) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }

        TextView idText;
        TextView nameText;
        TextView yomiText;
        TextView phoneText;

        idText = (TextView)convertView.findViewById(R.id.id);
        nameText = (TextView)convertView.findViewById(R.id.name);
        yomiText = (TextView)convertView.findViewById(R.id.yomi);
        phoneText = (TextView)convertView.findViewById(R.id.phone);


        idText.setText(Integer.toString(data.getIndex()));
        nameText.setText(data.getName());
        yomiText.setText(data.getYomi());
        phoneText.setText(data.getPhone());

        return convertView;
    }
}
