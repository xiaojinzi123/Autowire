package com.xiaojinzi.autowire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.xiaojinzi.autowire.anno.AutowiredAnno;
import com.xiaojinzi.autowire.impl.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, SecondAct.class);
        intent.putExtra("name", "小金子");
        startActivity(intent);

    }

}
