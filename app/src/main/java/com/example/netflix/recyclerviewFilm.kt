package com.example.netflix

import android.media.Image
import androidx.recyclerview.widget.GridLayoutManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var movieList: List<Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerviewFilm)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 columnas en la cuadrícula

        movieList = getMovieData()

        movieAdapter = MovieAdapter(movieList, this)
        recyclerView.adapter = movieAdapter
    }

    private fun getMovieData(): List<Movie> {

        val movieList = ArrayList<Movie>()

        movieList.add(Movie("Pelicula 1", "https://example.com/pelicula1.jpg"))
        movieList.add(Movie("Pelicula 2", "https://example.com/pelicula2.jpg"))
        movieList.add(Movie("Pelicula 3", "https://example.com/pelicula3.jpg"))
        // Agrega más películas aquí según sea necesario

        return movieList

    }
}

class Movie(val name: String, val photo: String)
