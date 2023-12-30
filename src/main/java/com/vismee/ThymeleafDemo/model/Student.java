package com.vismee.ThymeleafDemo.model;

import java.util.List;

public class Student
{
    private String firstName;

    private String lastName;

    private String country;

    private String gender;

    private String group;

    private List<String> education;

    private List<String> college;

    public Student()
    {

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<String> getEducation() {
        return education;
    }

    public void setEducation(List<String> education) {
        this.education = education;
    }

    public List<String> getCollege() {
        return college;
    }

    public void setCollege(List<String> college) {
        this.college = college;
    }
}
