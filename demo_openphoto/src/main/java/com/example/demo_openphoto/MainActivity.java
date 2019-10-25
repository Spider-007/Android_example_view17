package com.example.demo_openphoto;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "SpiderLine";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mLinearLayout = findViewById(R.id.linear);
        Button mButton = new Button(this);
        mButton.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1));
        mButton.setText("打开相机图库");
        mButton.setBackgroundColor(Color.parseColor("#0A2DDB"));
        mButton.setOnClickListener((v -> {
            //->
            LogUtil.d(TAG, "Open_picture");

        }));
        mLinearLayout.addView(mButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_glide:
                LogUtil.d(TAG, "MENU_GLIDE");
                break;
            case R.id.menu_fresco:
                LogUtil.d(TAG, "MENU_FRESCO");
                break;
            case R.id.menu_picasso:
                LogUtil.d(TAG, "MENU_PICASSO");
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
