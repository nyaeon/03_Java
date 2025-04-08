package HOMEWORK2_week.chep10.api.hair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private LocalDateTime birthday;
    private LocalDateTime reservationDate;
    private String reservationTime;
    private LocalDateTime creatAt;

    public App() {
    }

    public App(int id, String firstname, String lastname, String email, String gender, LocalDateTime birthday, LocalDateTime reservationDate, String reservationTime, LocalDateTime creatAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.creatAt = creatAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    @Override
    public String toString() {
        return "User{ id =" + id +
                ", firstname='" + firstname  + '\''+
                ", lastname='" + lastname  + '\''+
                ", email='" + email  + '\''+
                ", gender='" + gender  + '\''+
                ", birthday=" + (birthday != null ? birthday.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")):null) + '\''+
                ", reservationDate=" + reservationDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + '\''+
                ", reservationTime='" + reservationTime + '\''+
                ", creatAt=" + creatAt.format(DateTimeFormatter.ISO_DATE_TIME)+ '\''+
                "}";
    }
}
