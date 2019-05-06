package com.example.android.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


    public class AnimalList extends AppCompatActivity {
        private List<Person> persons;
        private PersonsAdapter personsAdapter;
        RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.animal_list);
            initialData();
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            personsAdapter = new PersonsAdapter(persons, this);
            recyclerView.setAdapter(personsAdapter);
        }
;
        private void initialData() {
            persons = new ArrayList<>();
            persons.add(new Person("Fingerprints", "The fingerprints of a koala are so indistinguishable from humans that they have on occasion been confused at a crime scene.",R.drawable.clinton));
            persons.add(new Person("George W. Bush", "body temperature", R.drawable.bush));
            persons.add(new Person("Barack Obama", "2009-2017",R.drawable.obama));
            persons.add(new Person("sfsd", "2009-2017",R.drawable.obama));
        }

    }