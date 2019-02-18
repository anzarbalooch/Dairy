package tk.anzarahmedkhan.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class Signupuser1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupuser1);
    }
    public void submitusr(View view)
    {
        Intent clicksubusr = new Intent(this,MainActivity.class);
        startActivity(clicksubusr);
    }
}
