package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsUsingObject {
    public static void main(String[] args){
        Employee e1=new Employee(21,"fayaz",25,50000,"male","eng");
        Employee e2=new Employee(77,"shriya",21,30000,"female","acc");
        Employee e3=new Employee(12,"ahamed",23,70000,"male","eng");
        Employee e4=new Employee(44,"king",22,70000,"female","hr");
        List<Employee> empList=new ArrayList<>();
        Collections.addAll(empList,e1,e2,e3,e4);
       /* empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);*/
//        Map<Integer, List<Employee>> sortMap=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
//        sortMap.forEach((key,value)->System.out.println("empId"+key+"employee"+value));
//        empList.sort(Comparator.comparing(Employee::getEmpId));
//        System.out.println(empList);
//        //Get distinct age of all employees
//        empList.stream().map(Employee::getAge).distinct().forEach(e->System.out.println(e));
//        Map<Integer,Double> map1=empList.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(map1);
//        //Get second highest salary
//        Optional<Employee> se=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
//        System.out.println(se.get());
          //count of male and female emp
          Map<String,Long> genderCountMap=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
          System.out.println(genderCountMap);
          // print all dept
          empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);
          //average age of male and female emp
          Map<String,Double> averageAgeMap=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
          System.out.println(averageAgeMap);
          //highest paid emp
          Optional<Employee> max=empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
          if(max.isPresent()){
              System.out.println(max);
          }
          //avg salary of each dept
          Map<String,Double>avgSalaryDept=empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
          System.out.println(avgSalaryDept);
          //min salary in eng dept
          Optional<Employee> youngInEng=empList.stream().filter(e->e.department.equals("eng")).min(Comparator.comparingInt(Employee::getAge));
          if(max.isPresent()){
              System.out.println(youngInEng);
          }
          //oldest employee in org
          Optional<Employee> maxAge=empList.stream().max(Comparator.comparing(Employee::getAge));
          if(maxAge.isPresent())
              System.out.println(maxAge);
          //second-highest salary
          Optional<Employee> secondHighSalary=empList.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).skip(1).findFirst();
          System.out.println(secondHighSalary.get());
          //get all id of employee based on salary
          // need to use mapping
          Map<Float, List<Integer>> salaryMap = empList.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.mapping(Employee::getEmpId,Collectors.toList())));
          salaryMap.forEach((a,b)->System.out.println(a+" "+b));
    }
}
