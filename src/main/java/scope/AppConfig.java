package scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }
    @Bean
    @Scope(value = "prototype")
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }
}
