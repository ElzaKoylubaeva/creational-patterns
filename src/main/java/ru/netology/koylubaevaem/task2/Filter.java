package ru.netology.koylubaevaem.task2;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    private final int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (element < threshold) {
                logger.log("Element \"" + element + "\" doesn't pass");
            } else {
                result.add(element);
                logger.log("Element \"" + element + "\" passes");
            }
        }
        return result;
    }
}
