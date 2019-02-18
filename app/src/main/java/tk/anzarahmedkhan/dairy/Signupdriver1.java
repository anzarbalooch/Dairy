package tk.anzarahmedkhan.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class Signupdriver1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupdriver1);
    }
    public void nextclickdriver(View view)
    {
        Intent nextclick = new Intent(this,Signupdriver2.class);
        startActivity(nextclick);
    }
}
