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
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

/**
 *
 * @author Bert
 */
public class Inbox extends FragmentActivity {

    /**
     * Called when the activity is first created.
     */
    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here 
        setContentView(R.layout.inbox);

        
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (icicle != null) {
                return;
            }

            // Create an instance of ExampleFragment
            InboxFragment firstFragment = new InboxFragment();

            // In case this activity was started with special instructions from an Intent,
            // pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }
        
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
