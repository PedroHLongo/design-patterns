package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

import java.util.Objects;

public class IPhoneSimpleFactory {

    public IPhone orderIphone(final String version, final String level) {
        IPhone device = null;

        if ("X".equals(version)) {
            if ("standard".equals(level)) {
                device = new IPhoneX();
            } else if("highEnd".equals(level)) {
                device = new IPhoneXSMax();
            }
        } else if("11".equals(version)) {
            if ("standard".equals(level)) {
                device = new IPhone11();
            } else if("highEnd".equals(level)) {
                device = new IPhone11Pro();
            }
        }

        if (Objects.nonNull(device)) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }

}
