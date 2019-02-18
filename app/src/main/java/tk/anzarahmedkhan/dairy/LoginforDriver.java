package tk.anzarahmedkhan.dairy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class LoginforDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginfor_driver);
    }
    public void gotodashboard()
    {
        Intent gotodash = new Intent(this,MapsActivity.class);
        startActivity(gotodash);
    }
}
