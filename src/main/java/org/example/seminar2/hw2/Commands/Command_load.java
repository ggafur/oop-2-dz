package org.example.seminar2.hw2.Commands;

import java.util.Scanner;

import org.example.seminar2.hw2.FamilyTreeUtils;
import org.example.seminar2.hw2.Interfaces.ICommand;

public class Command_load implements ICommand {

    @Override
    public String info() {
        return "load - загрузка дерева из файла";
    }

    @Override
    public String getName() {
        return "load";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        utils.geFamilyTree().load("FamilyTree.dat");
    }

}
