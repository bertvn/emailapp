package My.Package.Email;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    /**
     * opent schrijf een email
     * @param view 
     */
    public void email(View view) {
        Intent intent = new Intent(this, Email.class);
        startActivity(intent);

    }
    
    public void inbox(View view) {
        Intent intent = new Intent(this, Inbox.class);
        startActivity(intent);

    }
    
    public void contacts(View view) {
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);

    }
    
    public void settings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);

    }
}
