package com.example.licznikklikniec;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tvCount;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount = findViewById(R.id.tvCount);

        findViewById(R.id.btnReset).setOnClickListener(v -> {
            count = 0;
            updateDisplay();
        });

        View.OnClickListener changeListener = v -> {
            if (v.getId() == R.id.btnPlus) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    Toast.makeText(this, R.string.error_negative, Toast.LENGTH_SHORT).show();
                }
            }
            updateDisplay();
        };
        findViewById(R.id.btnPlus).setOnClickListener(changeListener);
        findViewById(R.id.btnMinus).setOnClickListener(changeListener);
    }
    private void updateDisplay() {
        tvCount.setText(String.valueOf(count));
    }
}