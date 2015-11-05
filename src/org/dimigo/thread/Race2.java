package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * └ Race2
 *
 * Date : 2015-11-05
 * </pre>
 *
 * @author : 2636 홍성빈
 * @version : 1.0
 */
public class Race2 {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");

        Thread r1 = new Thread(new Runner2("빌게이츠"));
        Thread r2 = new Thread(new Runner2("스티븐잡스"));

        // MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY(1)
        // 우선순위가 높은 스레드가 실행 기회를 더 많이 가진다.
        r1.setPriority(Thread.MIN_PRIORITY);
        r2.setPriority(Thread.MAX_PRIORITY);

        // multi thread로 실행하려면 start() 호출하기
        r1.start();
        r2.start();

        System.out.println("Main Thread End");
    }
}
