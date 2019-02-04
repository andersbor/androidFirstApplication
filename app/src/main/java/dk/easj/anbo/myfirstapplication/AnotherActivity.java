package dk.easj.anbo.myfirstapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {
    private static final String EMAIL = "sdksfkdfksdk";
    private static final String SHOE_SIZE = "shoeSize";

    public static Intent getIntent(Context from, String email, int shoeSize) {
        Intent intent = new Intent(from, AnotherActivity.class);
        intent.putExtra(AnotherActivity.EMAIL, email);
        intent.putExtra(AnotherActivity.SHOE_SIZE, shoeSize);
        return intent;
    }

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
        // add data
        Intent intent = new Intent();
        intent.putExtra("username", "anders");
        intent.putExtra("password", "secret12");
        setResult(RESULT_CANCELED, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goBackPressed(null);
    }
}
