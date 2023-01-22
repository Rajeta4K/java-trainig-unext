package com.dayThree.collections;

import com.dayOne.bean.Employee;

import java.util.*;

public class MyMap {
    public static void main (String[] args){
        myHashMap1();
        System.out.println(" ---------- ");
        myHashMapWithEmployee();
    }
    public static void myHashMap(){

        Map<Integer, String> map = new HashMap<Integer, String>();
       // Map<Integer, String> map = new LinkedHashMap<Integer, String>();
       // Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(101, "Pune");
        map.put(102, "Chennai");
        map.put(103, "Mumbai");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
    public static void myHashMap1(){
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(101, "Pune");
        map.put(102, "Chennai");
        map.put(103, "Mumbai");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
    public static  void myHashMap2(){
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(101, "Pune");
        map.put(102, "Chennai");
        map.put(103, "Mumbai");

        Set<Integer> set = map.keySet();
        for( Integer key : set ) {
            String value = map.get(key);
            System.out.println(key +" "+value);
        }
    }

    public static void myHashMapWithEmployee(){
        Employee emp1 = new Employee(101, "Asha", 60);
        Employee emp2 = new Employee(101, "Asha", 60);
        Employee emp3 = new Employee(101, "Asha", 60);
        Employee emp4 = new Employee(101, "Asha", 60);

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(emp1, "Pune");
        map.put(emp2, "Chennai");
        map.put(emp3, "Mumbai");
        map.put(emp4, "Hyderabad");

    }
}
