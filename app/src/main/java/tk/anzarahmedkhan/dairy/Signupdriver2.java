package tk.anzarahmedkhan.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class Signupdriver2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupdriver2);
    }

    public void completesignupdriver(View view)
    {
        Intent completesignup = new Intent(this,MainActivity.class);
        startActivity(completesignup);
    }
}
