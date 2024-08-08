package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFatory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.UsRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory brRules = new BrazilianRulesAbstractFatory();
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(brRules);
		IPhone iphoneXBr = iPhoneXFactory.orderIPhone("standard");

		CountryRulesAbstractFactory usRules = new UsRulesAbstractFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory(usRules);
		IPhone iphone11Us = iphone11Factory.orderIPhone("standard");
	}
}
