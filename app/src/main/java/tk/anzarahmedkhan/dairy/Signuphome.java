package tk.anzarahmedkhan.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Signuphome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuphome);
    }
    public void driverclickforsignup(View view)
    {
        Intent driversignup = new Intent(this,Signupdriver1.class);
        startActivity(driversignup);
    }

    public void userclickforsignup(View view)
    {
        Intent usersignup = new Intent(this,Signupuser1.class);
        startActivity(usersignup);
    }
}
