package dk.easj.anbo.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonCliced(View view) {
        TextView textView = findViewById(R.id.mainMessageTextView);
        counter++;

        EditText editText = findViewById(R.id.mainEmailEditText);
        String email = editText.getText().toString();
        textView.setText("Hallo  " + email);

    }

    public void buttonGoClicked(View view) {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }
}
