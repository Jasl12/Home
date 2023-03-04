package com.example.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel, MainAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {
        holder.name.setText(model.getName());
        holder.role.setText(model.getRole());
        holder.rating.setText(model.getRating());
        holder.location.setText(model.getLocation());

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView name, role, rating, location;

        public myViewHolder(@NonNull View itemView){
            super(itemView);

            name=(TextView) itemView.findViewById(R.id.Name);
            role=(TextView) itemView.findViewById(R.id.role);
            rating=(TextView) itemView.findViewById(R.id.rating);
            location=(TextView) itemView.findViewById(R.id.location);
        }
    }
}
