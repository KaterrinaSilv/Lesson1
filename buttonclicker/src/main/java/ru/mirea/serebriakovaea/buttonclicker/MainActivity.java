package ru.mirea.serebriakovaea.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private TextView textViewStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        textViewStudent = findViewById(R.id.tvOut);

        View.OnClickListener oclBtnWhoIAm = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку №22");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoIAm);

        btnItIsNotMe.findViewById(R.id.btnItIsNotMe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast itIsNotMeToast = Toast.makeText(getApplicationContext(), "Это не я сделал", Toast.LENGTH_SHORT);
                itIsNotMeToast.show();

            }
        });

    }
}