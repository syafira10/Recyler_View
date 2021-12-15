package com.example.recycleview_syafira_32

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Antman"
                "Paull Rudd Paull Rudd Paull Rudd"
            ),
            Superhero(
                R.drawable.blackwidow,
                "Black Widow"
                "Scarlett Johanson Scarlett Johanson Scarlett Johanson"
            ),
            Superhero(
                R.drawable.blackpanther,
                "Black Panther"
                "Chadwick Bossman Chadwick Bossman Chadwick Bossman"
            ),
            Superhero(
                R.drawable.captainamerica,
                "Captain America"
                "Chris Evan Chris Evan Chris Evan"
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Strange"
                "Benedict Cumberbatch Benedict Cumberbatch Benedict Cumberbatch"
            ),
            Superhero(
                R.drawable.hawkey,
                "Hawkey"
                "Sebastian Stan"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk"
                "Mark Ruffalo Mark Ruffalo Mark Ruffalo"
            ),
            Superhero(
                R.drawable.ironman,
                "Iron Man"
                "Robert Downey Junior Robert Downey Junior"
            ),
            Superhero(
                R.drawable.thor,
                "Thor"
                "Cris Hemsworth"
            ),
            Superhero(
                R.drawable.thefalcon,
                "The Falcon"
                "Anthony Mackie Anthony Mackie Anthony Mackie"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){

        }
    }
}