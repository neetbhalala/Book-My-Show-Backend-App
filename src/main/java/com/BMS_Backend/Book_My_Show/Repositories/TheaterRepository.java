package com.BMS_Backend.Book_My_Show.Repositories;

import com.BMS_Backend.Book_My_Show.Models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Integer> {
}
