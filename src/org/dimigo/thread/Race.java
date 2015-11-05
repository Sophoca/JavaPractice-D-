package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * └ Race
 *
 * Date : 2015-11-05
 * </pre>
 *
 * @author : 2636 홍성빈
 * @version : 1.0
 */

public class Race {
    public static void main(String[] args) {
        System.out.println("main thread start");
        
        Thread t1 = new Runner("빌게이츠");
        Thread t2 = new Runner("스티븐잡스");

        // MAX_PRIORITY(10), MAX_PRIORITY(5), MAX_PRIORITY(1)
        // 우선순위가 높은 스레드가 실행 기회를 더 많이 가진다
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // multi thread로 실행하려면 start() 호출하기
        t1.start();
        t2.start();

        System.out.println("main thread end");
    }
}
