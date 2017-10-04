package b4project.impulsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Friendsinv extends AppCompatActivity {
    Button mOmit;
    Button mOkay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendsinv);

        mOmit = (Button) findViewById(R.id.button1);
        mOkay= (Button) findViewById(R.id.button2);
    }
}
