package com.desai.vatsal.mydynamictoastexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.desai.vatsal.mydynamictoast.MyCustomToast;
import com.desai.vatsal.mydynamictoast.MyDynamicToast;

public class MainActivity extends AppCompatActivity {

    Button error_toast, warning_toast, success_toast, info_toast, custom_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        error_toast = (Button) findViewById(R.id.error_toast);
        warning_toast = (Button) findViewById(R.id.warning_toast);
        success_toast = (Button) findViewById(R.id.success_toast);
        info_toast = (Button) findViewById(R.id.info_toast);
        custom_toast = (Button) findViewById(R.id.custom_toast);

        actionListener();

    }

    private void actionListener() {

        error_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyDynamicToast.errorMessage(MainActivity.this, "error toast message..");

            }
        });

        warning_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyDynamicToast.warningMessage(MainActivity.this, "warning toast message1234546677889023489..");

            }
        });

        success_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyDynamicToast.successMessage(MainActivity.this, "success toast message..");

            }
        });

        info_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyDynamicToast.informationMessage(MainActivity.this, "information toast message1234546677889023489..");

            }
        });

        custom_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyCustomToast myCustomToast = new MyCustomToast(MainActivity.this);
                myCustomToast.setCustomMessageText("custom toast message..");
                myCustomToast.setCustomMessageTextSize(18);
                myCustomToast.setCustomMessageTextColor(Color.WHITE);
                myCustomToast.setCustomMessageIcon(R.drawable.ic_success, MyCustomToast.POSITION_LEFT);
                myCustomToast.setCustomMessageIconColor(Color.WHITE);
//                myCustomToast.setCustomMessageBackgroundColor("#853657");
                myCustomToast.setCustomMessageBackgroundDrawable(R.drawable.info_message_background);
                myCustomToast.setCustomMessageDuration(MyCustomToast.LENGTH_LONG);
                myCustomToast.setGravity(Gravity.CENTER, 0, 0);
                myCustomToast.setCustomMessageTypeface("cambriai.ttf");
                myCustomToast.show();

            }
        });


    }


}
