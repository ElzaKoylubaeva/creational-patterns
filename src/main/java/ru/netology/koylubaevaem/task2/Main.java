package ru.netology.koylubaevaem.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Starting the program");
        logger.log("Asking a user to enter input data for the list");

        System.out.print("Enter the list size: ");
        String listSizeStr = scanner.nextLine();
        int listSize = Integer.parseInt(listSizeStr);

        System.out.print("Enter the upper limit of values: ");
        String limitStr = scanner.nextLine();
        int limit = Integer.parseInt(limitStr);

        logger.log("Creating and filling the list");

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(i, random.nextInt(limit));
        }
        System.out.println("Random list: " + list);

        logger.log("Asking the user to enter input data for filtering out");

        System.out.print("Enter the threshold for filter: ");
        String thresholdStr = scanner.nextLine();
        int threshold = Integer.parseInt(thresholdStr);

        logger.log("Starting the filtering");

        Filter filter = new Filter(threshold);

        List<Integer> result = filter.filterOut(list);

        logger.log("Passed through the filter " + result.size() + " among " + list.size());
        logger.log("Displaying the result on the screen");
        System.out.println("Filtered out list:" + result);
        logger.log("Ending the program");
    }
}
