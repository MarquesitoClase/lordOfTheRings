package org.example;

import characters.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> fellowship = new ArrayList<>();

        Maiar gandalf = new Maiar("Gandalf", "Valinor", Role.MAGE, "Fire and Light Magic", true);
        Maiar sauron = new Maiar("Sauron", "Valinor", Role.DARK_LORD, "Dark Sorcery", false);
        Maiar radagast = new Maiar("Radagast", "Valinor", Role.MAGE, "Nature Magic", true);

        Hobbit frodo = new Hobbit("Frodo", "Shire", Role.ROGUE, 70);
        Hobbit sam = new Hobbit("Sam", "Shire", Role.WARRIOR, 80);
        Hobbit pippin = new Hobbit("Pippin", "Shire", Role.ROGUE, 65);

        Elf legolas = new Elf("Legolas", "Mirkwood", Role.ARCHER, 95);
        Elf tauriel = new Elf("Tauriel", "Mirkwood", Role.ARCHER, 85);
        Elf elrond = new Elf("Elrond", "Rivendell", Role.MAGE, 95);

        Dwarf gimli = new Dwarf("Gimli", "Erebor", Role.WARRIOR, 80);
        Dwarf thorin = new Dwarf("Thorin", "Erebor", Role.WARRIOR, 85);
        Dwarf balin = new Dwarf("Balin", "Erebor", Role.WARRIOR, 75);

        Human aragorn = new Human("Aragorn", "Gondor", Role.WARRIOR, 85, 70);
        Human boromir = new Human("Boromir", "Gondor", Role.WARRIOR, 80, 60);
        Human theoden = new Human("Théoden", "Rohan", Role.WARRIOR, 75, 65);


        fellowship.add(gandalf);
        fellowship.add(sauron);
        fellowship.add(radagast);

        fellowship.add(frodo);
        fellowship.add(sam);
        fellowship.add(pippin);

        fellowship.add(legolas);
        fellowship.add(tauriel);
        fellowship.add(elrond);

        fellowship.add(gimli);
        fellowship.add(thorin);
        fellowship.add(balin);

        fellowship.add(aragorn);
        fellowship.add(boromir);
        fellowship.add(theoden);

        System.out.println("Comunidad del Anillo:");
        for (Character c : fellowship) {
            System.out.println(c.present());
        }
    }
}