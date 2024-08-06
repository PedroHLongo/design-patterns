package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
}
