/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.europeandynamics.ed.vol4.day7;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author mcjoh
 */
public class QueueShowcase {

    public static void main(String[] args) {
        Queue<String> queueStr = new LinkedList<>();
        
        queueStr.add("a");
        queueStr.add("a1");
//        queueStr.add("a2");
//        queueStr.add("a3");
//        queueStr.add("a4");
//        queueStr.add("a5");

        System.out.println(queueStr.peek());
        System.out.println(queueStr.element()); // creates/throws error
        
        queueStr.poll();
        queueStr.remove(); // creates/throws error
        
        priorityQueueShowcase();

    }
    
        
    private static void priorityQueueShowcase(){
        //Queue<String> priorityQueue = new PriorityQueue<>();

        Queue<Customer> priorityQueue = new PriorityQueue<>(new Comparator<Customer>(){
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getAge().compareTo(o2.getAge());
            }        
        });
        
        Customer customer1 = new Customer(1, "Athina", 50);
        Customer customer2 = new Customer(2, "Manolis", 25);
        Customer customer3 = new Customer(3, "Nikolaos", 50);
        Customer customer4 = new Customer(3, "Ioannis", 80);
    
        priorityQueue.add(customer1);
        priorityQueue.add(customer2);
        priorityQueue.add(customer3);
        priorityQueue.add(customer4);
        
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
