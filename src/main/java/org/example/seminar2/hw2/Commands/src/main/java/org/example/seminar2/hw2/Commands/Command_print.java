package org.example.seminar2.hw2.Commands;

import java.util.Scanner;

import org.example.seminar2.hw2.FamilyTreeUtils;
import org.example.seminar2.hw2.Interfaces.ICommand;


public class Command_print implements ICommand {

    @Override
    public String info() {
        return "print - вывод дерева";
    }

    @Override
    public String getName() {
        return "print";
    }

    @Override
    public void exercute(Scanner scanner, FamilyTreeUtils utils) {
        utils.print();
    }
}
