package org.example.seminar2.hw2.Interfaces;

import java.util.Scanner;

import org.example.seminar2.hw2.FamilyTreeUtils;


public interface ICommand {

    String info();


    String getName();


    void exercute(Scanner scanner, FamilyTreeUtils utils);
}
