package tusi.com;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    private static MyLinkedList myLinkedList;
    private static MyStack myStack;
    private static MyQueue myQueue;
    
    public static void main(String[] args) {

        myLinkedList = new MyLinkedList();
        myStack = new MyStack();

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String a = "";


        System.out.println("f - insert new first tag linkedList");
        System.out.println("n - insert new last tag linkedList");
        System.out.println("d - delete tag from position linkedList");
        System.out.println("v - delete value linkedList");
        System.out.println("l - list tags linkedList");
        System.out.println("w - delete first tag linkedList");
        System.out.println("s - show position value linkedList");

        System.out.println("");

        System.out.println("p - push value to the stack");
        System.out.println("t - take pop value from the stack");
        System.out.println("r - return the top value from the stack");

        System.out.println("");
        System.out.println("c - push value to the queue");
        System.out.println("x - take pop value from the queue");
        System.out.println("y - return the top value from the queue");

        
        System.out.println("");
        System.out.println("q - quit");
        System.out.println("");

        try {
            while (!(a = br.readLine()).equals("q")) {
                if (a.equals("f")) {
                    System.out.print(" Mennyit irjunk bele? ");
                    myLinkedList.firstInsert(Integer.valueOf(br.readLine()));
                }
                if (a.equals("n")) {
                    System.out.print(" Mennyit irjunk bele? ");
                    myLinkedList.lastInsert(Integer.valueOf(br.readLine()));
                }
                if (a.equals("v")) {
                    System.out.print(" Melyik �rt�ket t�r�ljem? ");
                    myLinkedList.deleteValue(Integer.valueOf(br.readLine()));
                }

                if (a.equals("l")) {
                    myLinkedList.list();
                }


                if (a.equals("w")) {
                    myLinkedList.deleteFirst();
                }

                if (a.equals("s")) {
                    System.out.print(" Melyik poz�ci� �rt�k�t �rjuk ki? ");
                    System.out.print(myLinkedList.show(Integer.valueOf(br.readLine())));
                }


                
                //********************stack
                if (a.equals("p")) {
                    System.out.print(" Mennyit irjunk bele? ");
                    myStack.push(Integer.valueOf(br.readLine()));
                }
                if (a.equals("t")) {
                    System.out.print(myStack.pop());
                }

                if (a.equals("r")) System.out.print(myStack.peek());

                //********************queue
                if (a.equals("c")) {
                    System.out.print(" Mennyit irjunk bele? ");
                    myQueue.offer(Integer.valueOf(br.readLine()));
                }
                if (a.equals("x")) {
                    System.out.print(myQueue.poll());
                }

                if (a.equals("y")) System.out.print(myQueue.peek());
            
            
            
            }
        } catch (Exception e) {
        }
    }
}