package uz.pdp.recyclerviewinjava1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.pdp.recyclerviewinjava1.R;
import uz.pdp.recyclerviewinjava1.model.Member;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Member> members;

    public RecyclerViewAdapter(Context context, ArrayList<Member> members){
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);

        ((RecyclerViewHolder) holder).img_profile.setImageResource(member.img_profile);
        ((RecyclerViewHolder) holder).name.setText(member.name);
        ((RecyclerViewHolder) holder).info.setText(member.info);
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView img_profile;
        TextView name, info;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            img_profile = itemView.findViewById(R.id.rv_img);
            name = itemView.findViewById(R.id.rv_title);
            info = itemView.findViewById(R.id.rv_info);
        }
    }
}
