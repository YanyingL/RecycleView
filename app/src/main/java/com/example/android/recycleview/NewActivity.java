package com.example.android.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    public TextView animal1;
    public TextView animal2;
    public ImageView animalImage1;
    public ImageView animalImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        animal1 = (TextView) findViewById(R.id.animal_name1);
        animal2 = (TextView) findViewById(R.id.animal_name2);
        animalImage1 = (ImageView) findViewById(R.id.animal_1);
        animalImage2 = (ImageView) findViewById(R.id.animal_2);

        animal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewActivity.this,AnimalList.class);
                startActivity(intent);
            }
        });
    }
}
