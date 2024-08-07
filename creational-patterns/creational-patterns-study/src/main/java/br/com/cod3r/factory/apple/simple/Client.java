package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;

public class Client {
	
	public static void main(String[] args) {
		IPhoneSimpleFactory iPhoneSimpleFactory = new IPhoneSimpleFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneXStandard = iPhoneSimpleFactory.orderIphone("X", "standard");

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone11HighEnd = iPhoneSimpleFactory.orderIphone("11", "highEnd");
	}
}
