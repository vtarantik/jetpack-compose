package com.tarantik.jetpackcompose.ui.screen.movieslist

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.tarantik.jetpackcompose.composable.MovieItem
import com.tarantik.jetpackcompose.domain.OfflineMoviesProvider
import com.tarantik.jetpackcompose.domain.model.Movie

@Composable
fun MoviesListScreen() {
    MoviesList(
        movies = OfflineMoviesProvider.getMovies(),
        onMovieClick = {}
    )
}

@Composable
fun MoviesList(
    movies: List<Movie>,
    onMovieClick: (movieId: Int) -> Unit,
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(8.dp),
        columns = GridCells.Fixed(2)
    ) {
        items(movies) { movie ->
            MovieItem(
                movie = movie,
                onMovieClick = onMovieClick
            )
        }
    }
}