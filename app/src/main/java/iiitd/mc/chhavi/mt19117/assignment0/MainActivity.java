package iiitd.mc.chhavi.mt19117.assignment0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonCLick(View v)
    {
        Log.i("MainAc", "Button Clicked");
        Intent click = new Intent(this, ButtonClick.class);
        startActivity(click);
    }
}
