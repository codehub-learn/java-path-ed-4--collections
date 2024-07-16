/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author mcjoh
 */
public class ArraysShowcase {

    public static void main(String[] args) {
        //loopShowcase();
        //referenceShowcase();
        //arraysClassShowcase();
        varArgsShowcase("Ioannis", 1, 2, 3);
    }

    private static void varArgsShowcase(String name, Integer... numbers) {
        System.out.println(numbers[5]);
    }

    private static void arraysClassShowcase() {
        boolean[] booleanArr = new boolean[15];
        Arrays.fill(booleanArr, true);
        System.out.println(booleanArr[5]);

        System.out.println(booleanArr.toString());
        System.out.println(booleanArr);
        System.out.println(Arrays.toString(booleanArr));

        int[] intArr = {1, 2, 3, 4, 6, 8, 10, 12};
        System.out.println(Arrays.binarySearch(intArr, 8));
        System.out.println(Arrays.binarySearch(intArr, 13));

        int[] intArrCopy = Arrays.copyOf(intArr, 8);
        System.out.println(Arrays.toString(intArrCopy));

        // size
        // elements
        // ordering
        System.out.println(Arrays.equals(intArr, intArrCopy));

        int[] intArr2 = {5, 122, 53, 1, 2, 3, 4, 6, 8, 10, 12};
        Arrays.sort(intArr2);
        System.out.println(Arrays.toString(intArr2));

        // natural order sorting
        // natural ordering -> Comparable 
        String[] names = {"Ioannis", "Athina", "Alexandros", "Stefania", "Nikolaos"};
        String test = "test";
        test.compareTo(names[0]);
        Arrays.sort(names); // compareTo
        System.out.println(Arrays.toString(names));
        // inherited from Object

        Customer customer1 = new Customer(1, "Athina", 50);
        Customer customer2 = new Customer(2, "Manolis", 25);
        Customer customer3 = new Customer(3, "Nikolaos", 50);
        Customer customer4 = new Customer(3, "Ioannis", 80);
        Customer[] customerArr = {customer1, customer2, customer3, customer4};
        //Arrays.sort(customerArr);
        System.out.println(Arrays.toString(customerArr));

        //Arrays.sort(customerArr, new CustomerComparator());
        System.out.println(Arrays.toString(customerArr));

        // anonymous class implementation:
        Arrays.sort(customerArr, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                // x > 0, x = 0, x < 0
                int ageResult = c1.getAge().compareTo(c2.getAge());
                if (ageResult != 0) {
                    return ageResult;
                }
                return c1.getName().compareTo(c2.getName());
            }
        });
        System.out.println(Arrays.toString(customerArr));

        // streams -> one line
    }

    private static void referenceShowcase() {
        boolean[] booleanArr = new boolean[15];
        booleanArr[0] = true;
        booleanArr[5] = false;

        String[] stringArr = new String[10];
        System.out.println(stringArr[0]);

        Customer[] customerArr = new Customer[5];
        System.out.println(customerArr[0]);

        boolean[] clonedBooleanArr = booleanArr.clone();
        System.out.println(clonedBooleanArr[0]);
    }

    private static void loopShowcase() {
        boolean[] booleanArr = new boolean[15];
        booleanArr[0] = true;
        booleanArr[5] = false;

        for (int i = 0; i <= booleanArr.length - 1; i++) {
            System.out.println("index: " + i);
            System.out.println(booleanArr[i]);
        }

        System.out.println("-----------");

        for (int i = booleanArr.length - 1; i >= 0; i--) {
            System.out.println("index: " + i);
            System.out.println(booleanArr[i]);
        }

        System.out.println("-----------");

        for (int i = 1; i <= booleanArr.length; i++) {
            System.out.println("position: " + i);
            System.out.println(booleanArr[booleanArr.length - i]);
        }

        /*
        for(;;){
            System.out.println("test");
        }
         */
        System.out.println("enhanced loop");
        for (boolean b : booleanArr) {
            System.out.println(b);
        }

        // multi-dimensional
        boolean[] booleanArr2 = {true, false, false, true};
        boolean[][] booleanArr3 = {{false, false, false}, {true, false, true, false}, {true, true, true, true}};
        System.out.println(booleanArr3[0][0]);
        System.out.println("-----");
        for (int i = 0; i < booleanArr3.length; i++) {
            for (int j = 0; j < booleanArr3[i].length; j++) {
                System.out.println(booleanArr3[i][j]);
            }
        }
    }
}
