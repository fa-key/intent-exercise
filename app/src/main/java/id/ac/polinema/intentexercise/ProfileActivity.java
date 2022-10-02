package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView tvAbout, tvFullname, tvLabel_email, tvLabel_hp;
    ImageView viewBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
        String fullname = getIntent().getExtras().getString("fullname");
        String email = getIntent().getExtras().getString("email");
        String homepage = getIntent().getExtras().getString("homepage");
        String about = getIntent().getExtras().getString("about");

        viewBitmap =(ImageView) findViewById(R.id.image_profile);
        tvAbout= findViewById(R.id.label_about);
        tvFullname= findViewById(R.id.label_fullname);
        tvLabel_email= findViewById(R.id.label_email);
        tvLabel_hp= findViewById(R.id.label_homepage);

        viewBitmap.setImageBitmap(bitmap);
        tvAbout.setText(about);
        tvFullname.setText(fullname);
        tvLabel_email.setText(email);
        tvLabel_hp.setText(homepage);
    }
}
