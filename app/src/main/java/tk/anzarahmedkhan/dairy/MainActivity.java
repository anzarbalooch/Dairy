package tk.anzarahmedkhan.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void driverclick(View view)
    {
        Intent driverclickactivity =new Intent(this,LoginforDriver.class);
        startActivity(driverclickactivity);

    }
    public void userclick(View view)
    {
        Intent userclickactivity = new Intent(this,LoginforUser.class);
        startActivity(userclickactivity);
    }
    public void signuphome(View view)
    {
        Intent signuphomeclickactivity=new Intent(this,Signuphome.class);
        startActivity(signuphomeclickactivity);
    }
}
