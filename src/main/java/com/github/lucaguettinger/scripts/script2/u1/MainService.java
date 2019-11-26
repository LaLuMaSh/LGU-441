package com.github.lucaguettinger.scripts.script2.u1;

import service.api.AbstractRunContinously;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainService extends AbstractRunContinously {

    private static final String pathname = "C:\\Users\\LGU\\source\\InteliJ\\441-Tests\\src\\main\\resources\\script2.txt";

    @Override
    public void execute() {
        System.out.println("geben sie ein, ob sie schreiben(W) oder lesen(R) wollen:");
        String string = getScanner().next("Geben sie W oder R ein.", "W", "R");

        if (string.equalsIgnoreCase("R")) {
            try {
                Scanner scanner = new Scanner(new File(pathname));
                while (scanner.hasNext()) {
                    String csv = scanner.nextLine();
                    Person e1 = Person.parsePerson(csv);

                    if (e1 == null) {
                        System.out.println("csv: " + csv + " could not be read.");
                        continue;
                    }

                    System.out.println("Person:");
                    System.out.println("name: " + e1.getVorname() + " " + e1.getNachname());
                    System.out.println("BirthYear: " +e1.getBirthYear().toString());
                    System.out.println("age: "+ e1.getAge());
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (string.equalsIgnoreCase("W")) {
            try {
                System.out.println("input (<vorname>;<nachname>;<geburtsjahr>):");
                String line = getScanner().next();
                Person person = Person.parsePerson(line);

                if (person == null){
                    System.out.println("invalid input");
                    return;
                }

                PrintWriter printWriter = new PrintWriter(new FileWriter(pathname, true));
                printWriter.println(line);
                printWriter.close();
            }catch (Exception ex) {
                System.out.println("error writing data.");
                ex.printStackTrace();
            }
        }
    }
}