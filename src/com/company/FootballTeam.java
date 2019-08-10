package com.company;

public abstract class FootballTeam {

    protected String name;
    protected String surname;
    protected int age;

    public FootballTeam() {

    }

    public FootballTeam(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void travel(){
        System.out.println("Travelling.");
    }

    public abstract void interview();
}
