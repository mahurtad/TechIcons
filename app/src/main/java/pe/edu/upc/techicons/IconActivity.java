package pe.edu.upc.techicons;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IconActivity extends AppCompatActivity {
    TextView nameTextView;
    TextView titleTextView;
    TextView companyTextView;
    TextView bioTextView;
    ImageView pictureImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        companyTextView = (TextView) findViewById(R.id.companyTextView);
        bioTextView = (TextView) findViewById(R.id.bioTextView);
        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        PeopleService service = new PeopleService(this);
        Person person =
                service.getPeople().get(getIntent().getExtras().getInt("currentPosition"));
        nameTextView.setText(person.getName());
        titleTextView.setText(person.getTitle());
        companyTextView.setText(person.getCompany());
        bioTextView.setText(person.getBio());
        pictureImageView.setImageResource(person.getPictureId());
    }

}
