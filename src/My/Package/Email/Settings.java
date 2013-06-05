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
import android.widget.EditText;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import android.content.Context;

/**
 *
 * @author Bert
 */
public class Settings extends Activity {

    /**
     * Called when the activity is first created.
     */
    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here 
        setContentView(R.layout.settings);

    }

    public void terug(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void edit(View view) {
        EditText email = (EditText) findViewById(R.id.settings_email);
        String emailadress = (String) email.getText().toString();

        EditText pass = (EditText) findViewById(R.id.settings_password);
        String password = (String) pass.getText().toString();

        EmailPass ep = new EmailPass(emailadress,password);
        
        changePassword(ep);
        
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    private void changePassword(EmailPass ep) {
        FileOutputStream fos;

        try {
            fos = openFileOutput("EmailObject", Context.MODE_PRIVATE);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(ep);
            os.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
