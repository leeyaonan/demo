package com.leeyaonan.demo;

import com.leeyaonan.demo.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    List<Employee> emps = Arrays.asList(
            new Employee(1, "张三", 18, 4444.44),
            new Employee(2, "李四", 38, 8888.88),
            new Employee(3, "王五", 25, 7777.77),
            new Employee(4, "赵六", 40, 9999.99),
            new Employee(5, "田七", 10, 6666.66)
    );

    @Test
    void contextLoads() {
        Collections.sort(emps, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e1.getAge());
            }
        });
        System.out.println(emps);
    }

}
