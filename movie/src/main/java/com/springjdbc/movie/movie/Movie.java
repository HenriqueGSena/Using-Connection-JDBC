package com.springjdbc.movie.movie;

import java.time.LocalDate;

public class Movie {
    
    private Long id;
    private String name;
    private LocalDate releaseDate;

    public Movie() {
    }

    public Movie(Long id, String name, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", releaseDate='" + getReleaseDate() + "'" +
            "}";
    }

}
