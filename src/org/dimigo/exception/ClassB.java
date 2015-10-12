package org.dimigo.exception;

/**
 * Created by 성빈 on 2015-10-04.
 */
public class ClassB implements IFasdf {
    @Override
    public void asdf() {

    }

    public static void main(String[] args){
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        IFasdf itf = new ClassA();
        itf.asdf();
    }
}
