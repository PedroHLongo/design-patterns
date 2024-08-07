package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
    public static void main(String[] args) {
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11highEnd = new IPhone11Factory();

        System.out.println("Ordering an standard iphoneX");
        IPhone iphoneXStandard = iphoneXFactory.orderIphone("standard");
        IPhone iphoneXHighEnd = iphoneXFactory.orderIphone("highEnd");
        System.out.println(iphoneXStandard);
        System.out.println(iphoneXHighEnd);
    }
}
