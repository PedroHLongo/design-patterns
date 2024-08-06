package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
    public static void main(String[] args) {
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iphone x");
        IPhone iphoneX = iphoneXFactory.orderIphone();

        System.out.println("### Ordering an iphone 11");
        IPhone iphone11 = iphone11Factory.orderIphone();
    }
}
