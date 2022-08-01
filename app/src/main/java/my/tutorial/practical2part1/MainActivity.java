package my.tutorial.practical2part1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void movetoscreen2(View view)
    {
        EditText mEdit1 = findViewById(R.id.editText1);
        String stringtext = mEdit1.getText().toString();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("String", stringtext);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        return;
    }
}