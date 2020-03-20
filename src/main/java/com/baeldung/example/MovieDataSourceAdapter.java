package com.baeldung.example;

import java.io.IOException;
import java.util.List;

public interface MovieDataSourceAdapter {
    List<Movie> allMovies() throws IOException;
}
