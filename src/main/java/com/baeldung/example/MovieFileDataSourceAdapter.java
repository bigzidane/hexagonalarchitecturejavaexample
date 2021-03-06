package com.baeldung.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MovieFileDataSourceAdapter implements MovieDataSourceAdapter {
    private ObjectMapper mapper;
    public MovieFileDataSourceAdapter() {
        this.mapper = new ObjectMapper();
    }

    public List<Movie> allMovies() throws IOException  {
        InputStream moviesStream = this.getClass().getClassLoader().getResourceAsStream("movies.json");
        return mapper.readValue(moviesStream, new TypeReference<List<Movie>>() {});
    }
}
