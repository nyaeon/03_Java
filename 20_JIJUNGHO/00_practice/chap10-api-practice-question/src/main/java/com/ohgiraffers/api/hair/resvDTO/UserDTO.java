package com.ohgiraffers.api.hair.resvDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UserDTO {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private char gender;
    private LocalDate birthday;
    private LocalDate reservation_date;
    private LocalTime reservation_time;
    private LocalDateTime created_at;

    public UserDTO () {}

    public UserDTO(int id, String first_name, String last_name, String email, char gender, LocalDate birthday, LocalDate reservation_date, LocalTime reservation_time, LocalDateTime created_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservation_date = reservation_date;
        this.reservation_time = reservation_time;
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", reservation_date=" + reservation_date +
                ", reservation_time=" + reservation_time +
                ", created_at=" + created_at +
                '}';
    }
}
