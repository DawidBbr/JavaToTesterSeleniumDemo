package model;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.YearOfBirth;

import java.util.Objects;

public class YourPersonalInformation {

    private String firstName;
    private String lastName;
    private String password;
    private DayOfBirth dayOfBirth;
    private MonthOfBirth monthOfBirth;
    private YearOfBirth yearOfBirth;

    public YourPersonalInformation(String firstName, String lastName, String password,
                                   DayOfBirth dayOfBirth, MonthOfBirth monthOfBirth, YearOfBirth yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DayOfBirth getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(DayOfBirth dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public MonthOfBirth getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(MonthOfBirth monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public YearOfBirth getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(YearOfBirth yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YourPersonalInformation that = (YourPersonalInformation) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(password, that.password) && dayOfBirth == that.dayOfBirth && monthOfBirth == that.monthOfBirth && yearOfBirth == that.yearOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, password, dayOfBirth, monthOfBirth, yearOfBirth);
    }

    @Override
    public String toString() {
        return "YourPersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
