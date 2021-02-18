package dk.easj.anbo.myfirstapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        TextView textView = findViewById(R.id.mainMessageTextView);
        EditText editText = findViewById(R.id.mainEmailEditText);
        String email = editText.getText().toString();
        textView.setText("Hello " + email);
    }

    public void buttonGoClicked(View view) {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }
}
