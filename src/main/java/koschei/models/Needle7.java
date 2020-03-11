package koschei.models;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class Needle7 {
    @Resource
    private Deth8 deth;

    public Needle7(Deth8 deth){
        this.deth = deth;
    }
    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString()+ "";
    }
}
