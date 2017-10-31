package cn.inbot.padbotsdkdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Choose your robot mode
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * The U series robots communicate by the bluetooth
     * The P series robots communicate by serial port;
     */
    public void onClick(View view) {

        if (view.getId() == R.id.u_mode_bt) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ScanActivity.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.p_mode_bt) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ControlActivity.class);
            intent.putExtra("model", 2);
            startActivity(intent);
        }
    }
}
