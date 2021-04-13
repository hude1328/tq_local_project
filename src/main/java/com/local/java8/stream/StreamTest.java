package com.local.java8.stream;

import com.local.basic.Model;
import com.local.basic.Model.ModelBuilder;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        Model model1 = ModelBuilder.create(10, "1", true);
        Model model2 = ModelBuilder.create(2, "2", false);
        Model model3 = ModelBuilder.create(37, "3", true);
        List<Model> list = Arrays.asList(model1, model2, model3);

        /**
         * filter() collect() sort()
         * Collectors.groupingBy
         * Comparator.comparing
         */
        int sum = list.stream().filter(s -> s.isProperty3()).mapToInt(Model::getProperty1).sum();
        int sum2 = list.stream().parallel().map(Model::getProperty1).reduce(0, Integer::sum);
        Map<Boolean, List<Model>> mapByBoolean = list.stream().collect(Collectors.groupingBy(Model::isProperty3));
        list = list.stream().sorted(Comparator.comparing(Model::getProperty1)).collect(Collectors.toList());
    }
}
