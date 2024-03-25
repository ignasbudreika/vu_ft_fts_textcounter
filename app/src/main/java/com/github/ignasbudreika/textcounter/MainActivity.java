package com.github.ignasbudreika.textcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.inputText);
        Spinner spinner = findViewById(R.id.typeSelect);
        Button countButton = findViewById(R.id.countButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        countButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (editText.getText().length() == 0) {
                    Toast info = Toast.makeText(v.getContext(),
                            getResources().getText(R.string.toast_info),
                            Toast.LENGTH_SHORT);
                    info.show();

                    return;
                }

                boolean words = spinner.getSelectedItem().toString().equals("words");

                int count = CountUtil.count(editText.getText().toString(), words);
                resultTextView.setText(String.format(getResources().getString(R.string.result_format),
                        spinner.getSelectedItem().toString(),
                        count));
            }
        });
    }
}