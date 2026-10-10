package com.example.licznikklikniec;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tvCount;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount = findViewById(R.id.tvCount);

        findViewById(R.id.btnPlus).setOnClickListener(v -> {
            count++;
            updateDisplay();
        });
        findViewById(R.id.btnMinus).setOnClickListener(v -> {
            count--;
            updateDisplay();
        });
        findViewById(R.id.btnReset).setOnClickListener(v -> {
            count = 0;
            updateDisplay();
        });
    }
    private void updateDisplay() {
        tvCount.setText(String.valueOf(count));
    }
}