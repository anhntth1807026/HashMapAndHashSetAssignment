package mainthread;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainThread {
    public static void main(String[] args) {





//        String todo1 = "Hello";
//        String todo2 = "Hi";
//        String todo3 = "Salut";
//        String todo4 = "Ahoj";
//        Deque<String> queue = new ArrayDeque<>();
//        queue.add(todo1);
//        queue.add(todo2);
//        queue.add(todo3);
//        queue.add(todo4);
//        for (String s :
//                queue) {
//            System.out.println(s);
//        }
//        System.out.println("-----------");
//        System.out.println(queue.poll());
//        System.out.println("-----------");
//        for (String s :
//                queue) {
//            System.out.println(s);
//        }





        LuongCuaToi luongCuaToi = new LuongCuaToi();
        luongCuaToi.start();
        LuongCuaToi luongCuaToi2 = new LuongCuaToi();
        luongCuaToi2.start();

        CungLuongCuaToi luongCuaToi3 = new CungLuongCuaToi();
        Thread t = new Thread(luongCuaToi3);
        t.start();
//    }



}
    }
