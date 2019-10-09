package com.xiaojinzi.autowire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.xiaojinzi.autowire.anno.AutowiredAnno;
import com.xiaojinzi.autowire.impl.Inject;

public class SecondAct extends AppCompatActivity {

    @AutowiredAnno("name")
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);
        Inject.inject(this);

        Toast.makeText(this, "名称是：" + name, Toast.LENGTH_SHORT).show();

    }

}
