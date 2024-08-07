package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(final String level) {
        IPhone device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(final String level);
}