package com.android.blowfish_ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
import java.io.IOError;
import java.sql.Ref;

public class loginPage extends Activity implements OnClickListener {
    EditText username;
    EditText password;
    Button signin;
    Button Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        username= (EditText) findViewById(R.id.UserName);
        password= (EditText) findViewById(R.id.Password);
        signin =(Button) findViewById(R.id.SignIn);
        Register=(Button)findViewById(R.id.Register);

        signin.setOnClickListener(this);
        Register.setOnClickListener(this)
        ;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.SignIn:
                Intent intent = new Intent(this, loginPage.class);
                startActivity(intent);
        }
    }














    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
