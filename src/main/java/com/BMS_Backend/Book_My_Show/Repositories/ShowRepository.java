package com.BMS_Backend.Book_My_Show.Repositories;

import com.BMS_Backend.Book_My_Show.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show,Integer> {
}
