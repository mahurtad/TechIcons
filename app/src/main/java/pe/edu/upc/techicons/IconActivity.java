package pe.edu.upc.techicons;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IconActivity extends AppCompatActivity {
    TextView nameTextView;
    TextView titleTextView;
    TextView companyTextView;
    TextView bioTextView;
    ImageView pictureImageView;
    Button btnVermapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);

        btnVermapa = (Button) findViewById(R.id.btnVermapa);
        btnVermapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myLat = -12.187650;
                double myLon = -77.007764;

                Bundle bundle = new Bundle();
                bundle.putDouble("myLat", myLat);
                bundle.putDouble("myLon", myLon);
                Intent intMap =  new Intent(v.getContext(), MapsActivity.class);
                intMap.putExtras(bundle);
                startActivity(intMap);
            }
        });

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
