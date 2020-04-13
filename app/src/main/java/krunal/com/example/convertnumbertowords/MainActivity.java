package krunal.com.example.convertnumbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mtextViewOutput;
    private EditText meditTextNumber;
    private Button mbuttonOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextViewOutput = findViewById(R.id.textViewOutput);
        meditTextNumber = findViewById(R.id.editTextNumber);
        mbuttonOutput = findViewById(R.id.buttonOutput);

        mbuttonOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (meditTextNumber.getText() == null || meditTextNumber.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Worry Input or No Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                Log.i("meditTextNumber", meditTextNumber.getText().toString().trim());
                String Outpur_Str = Currency.convertToIndianCurrency(meditTextNumber.getText().toString().trim());
                Log.i("Outpur_Str", Outpur_Str);

                mtextViewOutput.setText(Outpur_Str);

            }
        });


    }
}
