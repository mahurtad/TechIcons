package pe.edu.upc.techicons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mahurtad on 29/10/2017.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {

    List<Person> people;
    public void setPeople(List<Person> people) { this.people = people; }


    @Override
    public PeopleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.card_person, parent, false));
    }
    @Override
    public void onBindViewHolder(PeopleAdapter.ViewHolder holder, final int position) {
        holder.nameTextView.setText(people.get(position).getName());
        holder.pictureImageView.setImageResource(people.get(position).getPictureId());
        holder.titleTextView.setText(people.get(position).getTitle());
        holder.companyTextView.setText(people.get(position).getCompany());
        holder.personCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("currentPosition", position);
                Intent iconIntent = new Intent(view.getContext(), IconActivity.class);
                iconIntent.putExtras(bundle);
                view.getContext().startActivity(iconIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView personCardView;
        ImageView pictureImageView;
        TextView nameTextView;
        TextView titleTextView;
        TextView companyTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            personCardView = (CardView) itemView.findViewById(R.id.personCardView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
            companyTextView = (TextView) itemView.findViewById(R.id.companyTextView);
        }
    }

}