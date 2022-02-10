package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "lifefilter";
    Button bshow;
    Toast msg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate called");

        //Link the view widget to Jave object
        bshow = (Button) findViewById(R.id.btnShow);

        // Add listener
//        bshow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Write the code to respond to the click event
//                Toast hellomsg = Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG);
//                        hellomsg.show();
//            }
//        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }

    public void show(View v){
        Toast.makeText(getApplicationContext(), "Msg 2",Toast.LENGTH_LONG).show();

    }
}