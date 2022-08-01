package my.tutorial.practical2part1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String passingString = intent.getStringExtra("String");
        TextView msg = findViewById(R.id.textView2);
        msg.setText(passingString);
    }

    public void movetoscreen2(View view)
    {
        startActivity(new Intent(MainActivity2.this, MainActivity.class));

    }

    public void movetoscreen3(View view)
    {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class));
    }
}