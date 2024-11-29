package com.yuexian.behaviorpatterns.observer.demo5;

/**
 * @author yuexian
 * @description
 * @date 2021.4.16 17:36
 */
public class HexaObserver  extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
