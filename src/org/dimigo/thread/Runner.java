package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * └ Runner
 *
 * Date : 2015-11-05
 * </pre>
 *
 * @author : 2636 홍성빈
 * @version : 1.0
 */
public class Runner extends Thread{
    private String name;

    public Runner(){}

    public Runner(String name){
        this.name = name;
    }

    public void run() {
        System.out.println(name + " 출발");
        for(int i=10; i>0; i--) {
            System.out.println(name + " " + i*10 + " 미터");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " 골인");
    }
}
