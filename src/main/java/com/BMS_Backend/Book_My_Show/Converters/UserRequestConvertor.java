package com.BMS_Backend.Book_My_Show.Converters;

import com.BMS_Backend.Book_My_Show.Dtos.Request.UserRequestDto;
import com.BMS_Backend.Book_My_Show.Models.User;

public class UserRequestConvertor {

    public static User convertDtoTOEntity(UserRequestDto userRequestDto){

        return User.builder()
                .age(userRequestDto.getAge())
                .name(userRequestDto.getName())
                .address(userRequestDto.getAddress())
                .mobNo(userRequestDto.getMobNo())
                .email(userRequestDto.getEmail())
                .build();
    }
}
