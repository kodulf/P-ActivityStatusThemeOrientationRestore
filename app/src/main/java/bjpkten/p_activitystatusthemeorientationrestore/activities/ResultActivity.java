package bjpkten.p_activitystatusthemeorientationrestore.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bjpkten.p_activitystatusthemeorientationrestore.R;

public class ResultActivity extends AppCompatActivity {

    static int resultCode = 2009;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

    }


    public void back(View view) {
        Intent intent = new Intent();
        setResult(resultCode,intent);
        finish();
    }
}
