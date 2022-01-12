package uz.pdp.recyclerviewinjava1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.MediaMetadata;
import android.os.Bundle;

import java.util.ArrayList;

import uz.pdp.recyclerviewinjava1.adapter.RecyclerViewAdapter;
import uz.pdp.recyclerviewinjava1.model.Member;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        ArrayList<Member> members = loadMembers();
        refreshAdapter(members, context);
    }

    private void refreshAdapter(ArrayList<Member>members, Context context) {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Member> loadMembers() {
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        members.add(new Member(R.drawable.google, "Gogole","top company"));
        return members;
    }
}