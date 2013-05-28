package My.Package.Email;


import My.Package.Email.MainActivity;
import My.Package.Email.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bert
 */
public class Contacts extends Activity {

    /**
     * Called when the activity is first created.
     */
    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here   
        setContentView(R.layout.contacts);
    }
    
    public void save(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
