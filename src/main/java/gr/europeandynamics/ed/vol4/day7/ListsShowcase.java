/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.LinkedList;
import java.util.function.Predicate;

/**
 *
 * @author mcjoh
 */
public class ListsShowcase {

    public static void main(String[] args) {
        createLists();
        listActions();
        
    }

    private static void listActions() {
        List<String> modifiableList = new ArrayList<>(50);
        modifiableList.add("Abc");
        modifiableList.add("Abcd");
        modifiableList.add("Abcde");
        modifiableList.add("Abcdef");
        modifiableList.add("ausnfausnf");
        // null = natural order
        modifiableList.sort(null);
        System.out.println(modifiableList);

//        modifieableList.sort(new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        });
        //modifieableList.remove(1);
        //modifieableList.remove("c");
        modifiableList.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() >= 5;
            }
        });
        System.out.println(modifiableList);
    }

    private static void createLists() {
        List<String> list = new ArrayList<>(50);

        String[] names = {"d", "c", "352", "21512"};
        Arrays.asList(names);
        Arrays.asList("a", "b", "c", "d");

        // unmodifiable list -> disabled removing, adding
        List<String> unmodifiableCopyOfList = List.copyOf(list);
        unmodifiableCopyOfList.add("test");
        List<String> unmodifieableList = List.of("a", "b", "c", "d");

        List<Object> emptyList = Collections.emptyList();
    }

    private static void other() {
        List<String> list = new ArrayList<>(50);
        //var list2 = new ArrayList<String>(50);
        list.add("1");
        list.add("2");
        list.set(0, "0");
        list.add(0, "-1");
        list.remove("2"); // .equals()
        System.out.println(list);

        ArrayList<Customer> customerList = new ArrayList<>(50);
        Customer customer1 = new Customer(1, "Athina", 50);
        Customer customer2 = new Customer(2, "Manolis", 25);
        Customer customer3 = new Customer(3, "Nikolaos", 50);
        Customer customer4 = new Customer(3, "Ioannis", 80);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        System.out.println(customerList);
        // different method
        //customerList.remove(customer3);
        Customer customerToBeDeleted = new Customer(3); // will remove based on custom equals (based on id)
        System.out.println(customerList.remove(customerToBeDeleted));
        System.out.println(customerList);

        final int indexOfCustomer3 = customerList.indexOf(customerToBeDeleted); //equals
        System.out.println(indexOfCustomer3);

        List<String> linkedList = new LinkedList<>();  
    }
}
