package zadanie_2_ForecastWeatherV2;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.InputEvent;
import com.vaadin.flow.shared.Registration;

import java.io.Serializable;

interface InputNotifier extends Serializable {
    default Registration addInputListener(ComponentEventListener<InputEvent> listener) {
        if (this instanceof Component) {
            return ComponentUtil.addListener((Component)this, InputEvent.class, listener);
        } else {
            throw new IllegalStateException(String.format("The class '%s' doesn't extend '%s'. Make your implementation for the method '%s'.", this.getClass().getName(), Component.class.getSimpleName(), "addInputListener"));
        }
    }
}
