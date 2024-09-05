package com.BMS_Backend.Book_My_Show.Repositories;

import com.BMS_Backend.Book_My_Show.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
