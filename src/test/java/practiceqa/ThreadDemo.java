
//package com.tutorialspoint;

import java.lang.*;

public class ThreadDemo {

   public static void main(String[] args) {

   Thread t = Thread.currentThread();
   // prints the thread name
   System.out.println("Thread = " + t);
    
   // change the thread name
   t.setName("Admin Thread");
     
   // prints the thread after changing name
   System.out.println("Thread after changing name = " + t);
    
   int count = Thread.activeCount();
   System.out.println("currently active threads = " + count);
   }
} 