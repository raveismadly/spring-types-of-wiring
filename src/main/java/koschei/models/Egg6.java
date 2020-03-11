package koschei.models;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Egg6 {

    @Resource
    private Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString() + "";
    }
}
