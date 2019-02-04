package dk.easj.anbo.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_USERNAME_PASSWORD = 14593;
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
        EditText editText = findViewById(R.id.mainEmailEditText);
        String email = editText.getText().toString();
        Intent intent = AnotherActivity.getIntent(this, email, 42);
        startActivityForResult(intent, REQUEST_CODE_USERNAME_PASSWORD);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_USERNAME_PASSWORD) {
            if (resultCode == RESULT_OK) {
                String username = data.getStringExtra("username");
                String password = data.getStringExtra("password");
                Log.d("MINE", username + " " + password);
            } else {
                Log.d("MINE", "You cancelled");
            }
        }

    }
}
