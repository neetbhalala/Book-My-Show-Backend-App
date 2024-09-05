package com.BMS_Backend.Book_My_Show.Services;

import com.BMS_Backend.Book_My_Show.Dtos.Request.TheaterRequestDto;
import com.BMS_Backend.Book_My_Show.Models.Theater;
import com.BMS_Backend.Book_My_Show.Models.TheaterSeat;

import java.util.List;

public interface TheaterService {
    String addTheater(TheaterRequestDto theaterRequestDto) throws Exception;

    List<TheaterSeat> createTheaterSeats(TheaterRequestDto theaterRequestDto, Theater theater);
}
