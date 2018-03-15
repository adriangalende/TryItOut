package org.mvpigs.tryItOut;

import java.time.LocalDate;
import java.time.Period;
import org.mvpigs.tryItOut.Interfaz.*;

public class Person implements Drawable, Organico{
    String name;
    LocalDate birthDate;

    public Person(String name, int day, int month, int year){
        LocalDate tempDB = LocalDate.of(year, month, day);
        this.name = name;
        this.birthDate = tempDB;

    }

    public Person(){

    }

    public Person(String name){
        this(name, 1, 1, 1900);
    }

    public int calculateAge(){
        Period p = Period.between(this.birthDate, LocalDate.now());
        return p.getYears();
    }

    public int calculateAge(LocalDate date){
        Period p = Period.between(this.birthDate, date);
        return p.getYears();
    }

    public int calculateAge(int day, int month, int year){
        LocalDate date = LocalDate.of(year, month, day);
        return calculateAge(date);
    }
    

    public String getNombre(){
        return this.name;
    }

    public void draw(){
        System.out.println( getNombre() + " : Con un 6 y un 4 pinto tu retrato");
    }
    
}