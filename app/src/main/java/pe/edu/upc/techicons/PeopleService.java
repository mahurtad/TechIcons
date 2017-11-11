package pe.edu.upc.techicons;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahurtad on 29/10/2017.
 */

public class PeopleService {
    private List<Person> people;
    public List<Person> getPeople() { return people; }
    public PeopleService(Context context) {
        Resources res = context.getResources();
        people = new ArrayList<>();
        people.add(new Person(res.getString(R.string.name_bill_gates),
                res.getString(R.string.title_former_ceo_and_founder),
                res.getString(R.string.company_microsoft),
                res.getString(R.string.bio_bill_gates),
                res.getString(R.string.service_microsoft),
                R.drawable.manuel));
        people.add(new Person(res.getString(R.string.name_larry_ellison),
                res.getString(R.string.title_cto),
                res.getString(R.string.company_oracle),
                res.getString(R.string.bio_larry_ellison),
                res.getString(R.string.service_oracle),
                R.drawable.marco));
        people.add(new Person(res.getString(R.string.name_mark_zuckerberg),
                res.getString(R.string.title_ceo),
                res.getString(R.string.company_facebook),
                res.getString(R.string.bio_mark_zuckerberg),
                res.getString(R.string.service_facebook),
                R.drawable.samuel));
        people.add(new Person(res.getString(R.string.name_steve_jobs),
                res.getString(R.string.title_former_ceo_and_founder),
                res.getString(R.string.company_apple),
                res.getString(R.string.bio_steve_jobs),
                res.getString(R.string.service_apple),
                R.drawable.saul));
           }
}
