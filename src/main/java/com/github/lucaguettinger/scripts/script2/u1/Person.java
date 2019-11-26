package com.github.lucaguettinger.scripts.script2.u1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

@Data
@AllArgsConstructor
@ToString
public class Person {
    String vorname;
    String nachname;
    LocalDate birthYear;

    public int getAge() {
        return Period.between(birthYear, LocalDate.now()).getYears();
    }

        private static DateTimeFormatter format = new DateTimeFormatterBuilder()
                .appendPattern("yyyy")
                .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
                .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
                .toFormatter();

    public static Person parsePerson(String csv) {
        String[] csvArray = csv.split(";");

        if (csvArray.length != 3) {
            return null;
        }

        return new Person(csvArray[0], csvArray[1], LocalDate.parse(csvArray[2], format));
    }
}
