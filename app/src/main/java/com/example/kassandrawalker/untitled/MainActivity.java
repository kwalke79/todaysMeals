package com.example.kassandrawalker.untitled;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ArrayList<E> todayMeals = new ArrayList<E>();
    private dayOfTheWeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);

        TextView titleToday = findViewById(R.id.titleToday);
        titleToday.append(dayOfTheWeek);
    }

    public void setDayOfTheWeek(String day) {
        dayOfTheWeek = day;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    private void setServices() {
        if (dayOfTheWeek == "Monday") {
            // Ideally this is where we would import data to give us the resources.
        }
    }

    private String getServices() {
        String output;

        return output;
    }
}
