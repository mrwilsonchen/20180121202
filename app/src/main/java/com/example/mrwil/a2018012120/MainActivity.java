package com.example.mrwil.a2018012120;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // ImageView image1 = (ImageView) findViewById(R.myImage.imageView);
        Bitmap bitmap = getLoacalBitmap("/storage/emulated/0/DCIM/Camera/IMG_20180121_081935.jpg"); //从本地取图片
        //Bitmap bitmap = getHttpBitmap(“http://blog.3gstdy.com/wp-content/themes/twentyten/images/headers/path.jpg”); //从网上取图片

        //image1.setImageBitmap(bitmap); //设置Bitmap
    }

    public static Bitmap getLoacalBitmap(String url) {
        try {
            FileInputStream fis = new FileInputStream(url);
            return BitmapFactory.decodeStream(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
