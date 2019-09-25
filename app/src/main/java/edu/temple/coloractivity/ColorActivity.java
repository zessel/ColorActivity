package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String colors[] = {"Red", "Magenta", "Yellow", "Green", "Blue", "Cyan", "White", "Gray",
                "Lime", "Olive", "Purple", "Teal"};
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ColorAdapater colorAdapater = new ColorAdapater(ColorActivity.this, colors);

        spinner.setAdapter(colorAdapater);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                findViewById(R.id.my_layout).setBackgroundColor(Color.parseColor(colors[position]));
                view.setBackgroundColor(Color.WHITE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }
}
