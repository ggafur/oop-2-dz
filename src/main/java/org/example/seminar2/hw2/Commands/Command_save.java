package org.example.seminar2.hw2.Commands;

import java.util.Scanner;

import org.example.seminar2.hw2.FamilyTreeUtils;
import org.example.seminar2.hw2.Interfaces.ICommand;


public class Command_save implements ICommand {

    @Override
    public String info() {
        return "save - сохранение в файл";
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        utils.geFamilyTree().save("FamilyTree.dat");
    }

}
