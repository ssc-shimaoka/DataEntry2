package com.example.dataentry2;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class csvReder {
    List<Model> objects = new ArrayList<Model>();

    public void reader(Context context){
        AssetManager assetManager = context.getResources().getAssets();

        try {
            // CSVファイルの読み込み
            InputStream inputStream = assetManager.open("sample.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferReader.readLine()) != null) {
                //カンマ区切りで１つづつ配列に入れる
                Model data = new Model();
                String[] RowData = line.split(",");

                //CSVの左([0]番目)から順番にセット
                data.setIndex(Integer.parseInt(RowData[0]));
                data.setName(RowData[1]);
                data.setYomi(RowData[2]);
                data.setPhone(RowData[3]);

                objects.add(data);
            }
            bufferReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
