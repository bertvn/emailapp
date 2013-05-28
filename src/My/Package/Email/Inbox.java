/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package My.Package.Email;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *
 * @author Bert
 */
public class Inbox extends Activity {

    /**
     * Called when the activity is first created.
     */
    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here 
        setContentView(R.layout.inbox);

    }

    public void terug(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    
    public void email(View view) {
        Intent intent = new Intent(this, Email.class);
        startActivity(intent);

    }
    
    public void read(View view) {
        Intent intent = new Intent(this,Reader.class);
        startActivity(intent);
    }
    
}
