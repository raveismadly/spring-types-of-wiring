package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Ocean1 {

    @Resource
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
