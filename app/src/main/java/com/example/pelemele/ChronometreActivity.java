package com.example.pelemele;
import com.example.pelemele.MainActivity;
import android.widget.Toast;
import android.widget.Button;

import android.widget.Button;

public class ChronometreActivity {
        Button chrono = (Button) findViewById(R.id.bouton_chrono);

        chrono.setOnClickListener((v) ->{
            Intent ic =new Intent(MainActivity.this,ChronometreActivity.class);
            startActivity(ic);
        };
}