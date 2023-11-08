package com.example.netflix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: List<Movie>, private val context: Context) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_view_film, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movieList[position]
        holder.movieNameTextView.text = movie.name
        Glide.with(context)
            .load(movie.posterUrl)
            .into(holder.moviePosterImageView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val moviePosterImageView: ImageView = itemView.findViewById(R.id.moviePosterImageView)
        val movieNameTextView: TextView = itemView.findViewById(R.id.movieNameTextView)
    }
}
