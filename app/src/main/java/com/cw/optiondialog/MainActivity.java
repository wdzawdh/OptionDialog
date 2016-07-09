package com.cw.optiondialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OptionDialog optionDialog1 = new OptionDialog(MainActivity.this);
                optionDialog1.setOptionArray("1", "2", "3");
                optionDialog1.setOnSelectListener(new OptionDialog.OnSelectListener() {
                    @Override
                    public void OnSelect(int i) {
                        Toast.makeText(MainActivity.this, i+"", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
