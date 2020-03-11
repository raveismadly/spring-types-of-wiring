package koschei.models;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Duck5 {
    @Resource
    private Egg6 egg;

    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return  ", в утке яйцо " + egg.toString()+ "";
    }
}
