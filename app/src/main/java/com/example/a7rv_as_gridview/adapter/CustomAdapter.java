package com.example.a7rv_as_gridview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a7rv_as_gridview.R;
import com.example.a7rv_as_gridview.model.User;

import java.awt.font.TextAttribute;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<User> users ;

    public CustomAdapter(Context context,List<User> users){
        this.context = context;
        this.users = users;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_view,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = users.get(position);
        if (holder instanceof CustomViewHolder){
            TextView firstName =((CustomViewHolder)holder).firstName;
            TextView lastName =((CustomViewHolder)holder).lastName;

            firstName.setText(user.getFirstName());
            lastName.setText(user.getFirstName());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView firstName, lastName;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            firstName = view.findViewById(R.id.firstName);
            lastName = view.findViewById(R.id.lastName);
        }
    }
}
