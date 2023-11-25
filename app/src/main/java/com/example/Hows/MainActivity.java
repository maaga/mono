package com.example.Hows;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CalendarView) findViewById(R.id.calendarView)).setOnDateChangeListener(listener);

        Button sendButton = findViewById(R.id.HimaButton);      //暇ボタンを押すと画面遷移
        // lambda式
        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), HimaTouroku.class);
            startActivity(intent);
        });

        Button sendButton2 = findViewById(R.id.chat_button);      //チャットボタンを押すと画面遷移
        // lambda式
        sendButton2.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), Chat.class);
            startActivity(intent);
        });
        //プロフィールボタンを押すと画面遷移する定義
        Button sendButton3 = findViewById(R.id.profile_button);
        // lambda式
        sendButton3.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), Profile.class);
            startActivity(intent);
        });
    }

    CalendarView.OnDateChangeListener listener = new CalendarView.OnDateChangeListener() {
        @Override
        public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
            String MSG = year +  "年" + (month + 1) + "月" + dayOfMonth +"日";
            toastMake(MSG,0,500);
        }
    };

    private void toastMake(String message,int x,int y){
        Toast toast = Toast.makeText(this,message,Toast.LENGTH_LONG);

        toast.setGravity(Gravity.CENTER,x,y);
        toast.show();
    }


}