package com.shubhankar.bookapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SetsAdapter extends RecyclerView.Adapter<SetsAdapter.viewHolder>{

    ArrayList<SetsModel> list;
    Context context;

    public SetsAdapter(ArrayList<SetsModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_sets,parent,false); // here we create view object

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

       // final SetsModel model=holder.getAdapterPosition(position);
        final SetsModel model=list.get(position);

        holder.setName.setText(model.getSetName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,PdfViewActivity2.class);
                intent.putExtra("position",holder.getAdapterPosition());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        //yaha par humne view me kya kya banaya he uska objects banate he
        TextView setName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            setName=itemView.findViewById(R.id.setName);
        }

        public boolean getAdapterPosition(int position) {
            return false;
        }

//        public int getAdapterPosition(int position) {
//            return position;
//        }
    }
}
