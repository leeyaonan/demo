package com.leeyaonan.demo.java8.lambda;

import com.leeyaonan.demo.model.Employee;

import java.util.Arrays;
import org.junit.Test;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author leeyaonan
 * @Date 2020/8/5 20:45
 */
public class LambdaTest {

    List<Employee> emps = Arrays.asList(
            new Employee(1, "张三", 18, 4444.44),
            new Employee(2, "李四", 38, 8888.88),
            new Employee(3, "王五", 25, 7777.77),
            new Employee(4, "赵六", 40, 9999.99),
            new Employee(5, "田七", 18, 6666.66)
    );

    @Test
    public void testLambda() {
        Collections.sort(emps, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
//        emps.sort((e1, e2) -> {
//            if (e1.getAge().equals(e2.getAge())) {
//                return Double.compare(e1.getSalary(), e2.getSalary());
//            } else {
//                return Integer.compare(e1.getAge(), e2.getAge());
//            }
//        });
        System.out.println(emps);
    }
}
