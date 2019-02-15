package org.kasapbasi.week2019_0201;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im=(ImageView) findViewById(R.id.imageView);
        im.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));

    }
}
