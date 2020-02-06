package com.example.writerschain;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.example.writerschain.adapters.ChainAdapter;
import com.example.writerschain.constructors.Chain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ChainViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Chain> chainList = new ArrayList<>();
    private ChainAdapter chainAdapter;
    private Chain chain;

    private FirebaseDatabase firebaseDb;
    private DatabaseReference databaseRef;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_view);

        databaseRef = FirebaseDatabase.getInstance().getReference("Saved");


        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(chainAdapter);




        loadChains();

    }



    private List<Chain> loadChains() {
        databaseRef.child("/Chains").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                chain = dataSnapshot.getValue(Chain.class);
                chainList.add(chain);

                chainAdapter = new ChainAdapter(chainList);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(chainAdapter);


                chainAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }
            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
            }
            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        return chainList;
    }
}
