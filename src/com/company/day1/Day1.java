package com.company.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    public void day1() throws FileNotFoundException {
        File f = new File("day1input");
        Scanner scanner = new Scanner(f);

        List<Long> numbers = new ArrayList<>();

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Day1().day1();
    }

}
