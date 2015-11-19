package com.android.blowfish_ibuy;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
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
import android.text.method.KeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.content.Intent;
import java.io.IOError;
import android.view.ViewGroup.LayoutParams;
public class MainPage extends Activity implements OnClickListener {

Button additem;
    PopupWindow popup;
    LinearLayout mainLayout;
    Button popupButton,exitButton;
    int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        additem = (Button)findViewById(R.id.addItem);
        additem.setOnClickListener(this);

        init();
        popupinit();







    }
    public void init(){
        TextView text = new TextView(this);
        text.setTextColor(Color.parseColor("#ff9359"));
        text.setText("Enter item type");

        EditText type = new EditText(this);
        type.setTextColor(Color.parseColor("#ffffff"));


        TextView textname = new TextView(this);
        textname.setTextColor(Color.parseColor("#ff9359"));
        textname.setText("Enter a name of your item");


        EditText name = new EditText(this);
        name.setTextColor(Color.parseColor("#ffffff"));

        TextView textAmount = new TextView(this);
        textAmount.setTextColor(Color.parseColor("#ff9359"));
        textAmount.setText("Enter Amount of item");

        EditText amount = new EditText(this);
        amount.setTextColor(Color.parseColor("#ffffff"));

        popupButton = new Button(this);
        popupButton.setText("Enter");
        popupButton.setOnClickListener(this);
        popupButton.setId(4);


        exitButton = new Button(this);
        exitButton.setText("Exit");
        exitButton.setOnClickListener(this);
        exitButton.setId(3);



        mainLayout=new LinearLayout(this);
        mainLayout.setOrientation(1);

        mainLayout.addView(text);
        mainLayout.addView(type);
        mainLayout.addView(textname);
        mainLayout.addView(name);
        mainLayout.addView(textAmount);
        mainLayout.addView(amount);
        mainLayout.addView(popupButton);
        mainLayout.addView(exitButton);

    }
    public void popupinit(){
        popupButton.setOnClickListener(this);
        popup = new PopupWindow(mainLayout,700,
                800);
        popup.setFocusable(true);
        int resID=getResources().getIdentifier("blue2","drawable",this.getPackageName());
        Drawable pic = getResources().getDrawable(resID);
        popup.setBackgroundDrawable(pic);
        popup.update();
        popup.setContentView(mainLayout);

    }

    public void onClick(View v){
        x=exitButton.getId();
        y=popupButton.getId();
        switch(v.getId()){
            case R.id.addItem:
                popup.showAtLocation(popupButton,Gravity.CENTER,0,0);
                break;
            case 3:
                popup.dismiss();
                break;
            case 4:
                popup.dismiss();

        }

    }












































    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
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
    public void Login(View view){
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }

}
