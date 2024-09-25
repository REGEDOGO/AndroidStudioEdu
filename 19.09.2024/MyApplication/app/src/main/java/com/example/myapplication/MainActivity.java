package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void pisz(View view){
        TextView text1 = findViewById(R.id.text1);
        EditText editText = findViewById(R.id.editText1);
        String EditString = editText.getText().toString();
        text1.setText(EditString);
    }

    public void activated(View view){
        ImageView image1 = findViewById(R.id.image1);
        boolean isCheck = ((ToggleButton) view).isChecked();
        if(isCheck) {
            image1.setImageResource(R.drawable.freaky);
        }  else {
            image1.setImageResource(R.drawable.chomikcool);
        }
    }

    public void licz(View view){
        boolean checked = ((CheckBox) view).isChecked();
        int wynik = 0;
        switch (view.getId()){
            case R.id.option1:
                if (checked){
                    wynik += 10;
                } else wynik -= 10;
                break;
            case R.id.option2:
                if(checked{

                }
        }
        TextView textView = findViewById(R.id.text1);
    }
}