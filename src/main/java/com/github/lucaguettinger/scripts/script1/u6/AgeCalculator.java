package com.github.lucaguettinger.scripts.script1.u6;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
