package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating a Prototype bean!!");
    }

    public String getScope() {
        return "I'm a Prototype";
    }
}
