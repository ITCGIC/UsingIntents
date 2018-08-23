package gicitc.intents.usingintents;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMail(View view) {
        Intent email = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"tongsreng@itc.edu.kh"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Hello from using intents");
        email.putExtra(Intent.EXTRA_TEXT, "Intent is an abstract description of an action.");
        email.putExtra("android.intent.extra.MIME_TYPES", Intent.EXTRA_TEXT);
        startActivity(Intent.createChooser(email, "Choose an email client from..."));
    }

    public void goFacebook(View view) {
        Intent fb = new Intent();
        fb.setAction(Intent.ACTION_VIEW);
        fb.setData(Uri.parse("content://edu.gicitc.dataprovider/users"));
//        fb.setData(Uri.parse("https://facebook.com/"));
//        fb.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(fb);
    }

    public void doCall(View view) {
        Intent call = new Intent();
        call.setAction(Intent.ACTION_VIEW);
        call.setData(Uri.parse("tel:5556"));
        startActivity(call);
    }
}
