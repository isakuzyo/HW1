package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadCityAll();
        load12HourTimeAll();

        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                load12HourTimeAll();
                Toast.makeText(this, "Showing times in 12 hour format", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                load24HourTimeAll();
                Toast.makeText(this, "Showing times in 24 hour format", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void loadCity(int cityChunk, int city, int image) {
        View v = findViewById(cityChunk);

        // set city name
        TextView cityName = v.findViewById(R.id.city_textView_id);
        cityName.setText(city);

        // set image
        ImageView imageName = v.findViewById(R.id.city_imageView_id);
        imageName.setImageResource(image);
    }

    public void loadCityAll() {
        loadCity(R.id.amsterdamTime, R.string.amsterdam, R.drawable.amsterdam_pic);
        loadCity(R.id.bangkokTime, R.string.bangkok, R.drawable.bangkok_pic);
        loadCity(R.id.dubaiTime, R.string.dubai, R.drawable.dubai_pic);
        loadCity(R.id.londonTime, R.string.london, R.drawable.london_pic);
        loadCity(R.id.mexicoCityTime, R.string.mexico_city, R.drawable.mexico_pic);
        loadCity(R.id.newYorkTime, R.string.new_york, R.drawable.newyork_pic);
        loadCity(R.id.parisTime, R.string.paris, R.drawable.paris_pic);
        loadCity(R.id.sydneyTime, R.string.sydney, R.drawable.sydney_pic);
        loadCity(R.id.tokyoTime, R.string.tokyo, R.drawable.tokyo_pic);
        loadCity(R.id.torontoTime, R.string.toronto, R.drawable.toronto_pic);
        loadCity(R.id.vancouverTime, R.string.vancouver, R.drawable.vancouver_pic);
    }

    public void load12HourTimeAll() {
        load12HourTime(R.id.amsterdamTime, "Europe/Amsterdam");
        load12HourTime(R.id.bangkokTime, "Asia/Bangkok");
        load12HourTime(R.id.dubaiTime, "Asia/Dubai");
        load12HourTime(R.id.londonTime, "Europe/London");
        load12HourTime(R.id.mexicoCityTime, "America/Mexico_City");
        load12HourTime(R.id.newYorkTime,  "America/New_York");
        load12HourTime(R.id.parisTime, "Europe/Paris");
        load12HourTime(R.id.sydneyTime, "Australia/Sydney");
        load12HourTime(R.id.tokyoTime, "Asia/Tokyo");
        load12HourTime(R.id.torontoTime, "America/Toronto");
        load12HourTime(R.id.vancouverTime, "America/Vancouver");
    }

    public void load24HourTimeAll() {
        load24HourTime(R.id.amsterdamTime, "Europe/Amsterdam");
        load24HourTime(R.id.bangkokTime, "Asia/Bangkok");
        load24HourTime(R.id.dubaiTime, "Asia/Dubai");
        load24HourTime(R.id.londonTime, "Europe/London");
        load24HourTime(R.id.mexicoCityTime, "America/Mexico_City");
        load24HourTime(R.id.newYorkTime,  "America/New_York");
        load24HourTime(R.id.parisTime, "Europe/Paris");
        load24HourTime(R.id.sydneyTime, "Australia/Sydney");
        load24HourTime(R.id.tokyoTime, "Asia/Tokyo");
        load24HourTime(R.id.torontoTime, "America/Toronto");
        load24HourTime(R.id.vancouverTime, "America/Vancouver");
    }

    public void load12HourTime(int cityChunk, String timezone) {
        View v = findViewById(cityChunk);

        // set time, 12 hour format
        TextClock tClock = v.findViewById(R.id.time_textView_id);
        tClock.setTimeZone(timezone);
        tClock.setFormat12Hour("h:mm a");

    }

    public void load24HourTime(int cityChunk, String timezone) {
        View v = findViewById(cityChunk);

        // set time, 24 hour format
        TextClock tClock = v.findViewById(R.id.time_textView_id);
        tClock.setTimeZone(timezone);
        tClock.setFormat12Hour("HH:mm");
    }
}