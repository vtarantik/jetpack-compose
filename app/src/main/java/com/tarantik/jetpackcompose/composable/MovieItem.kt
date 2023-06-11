package com.tarantik.jetpackcompose.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.tarantik.jetpackcompose.domain.model.Movie

@Composable
fun MovieItem(
    movie: Movie,
    onMovieClick: (movieId: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clickable(onClick = {onMovieClick(movie.id)})
            .padding(8.dp)
    ) {
        AsyncImage(
            contentScale = ContentScale.Fit,
            model = "https://image.tmdb.org/t/p/w500${movie.posterPath}",
            contentDescription = null
        )
    }
}