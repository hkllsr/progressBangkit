package com.dicoding.hklfinale

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Tambahkan klik listener pada adapter Anda
class ArticleAdapter(private val articleList: List<Article>, private val onItemClick: (Article) -> Unit) :
    RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val overviewTextView: TextView = itemView.findViewById(R.id.textViewOverview)
        val imageView: ImageView = itemView.findViewById(R.id.imageViewArticle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articleList[position]
        holder.titleTextView.text = article.title
        holder.overviewTextView.text = article.overview
        holder.imageView.setImageResource(article.imageResId)

        // Set OnClickListener pada itemView untuk meneruskan data ke DetailActivity
        holder.itemView.setOnClickListener {
            onItemClick(article)
        }
    }

    override fun getItemCount(): Int {
        return articleList.size
    }
}

