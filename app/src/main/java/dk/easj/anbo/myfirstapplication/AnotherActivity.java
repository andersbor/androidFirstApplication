package dk.easj.anbo.myfirstapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {
    private static final String EMAIL = "sdksfkdfksdk";
    private static final String SHOE_SIZE = "shoeSize";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        String email = intent.getStringExtra(EMAIL);
        int shoesize = intent.getIntExtra(SHOE_SIZE, -1);
        Log.d("MINE", email + " " + shoesize);
    }

    public void goBackPressed(View view) {
        finish();
    }
}
