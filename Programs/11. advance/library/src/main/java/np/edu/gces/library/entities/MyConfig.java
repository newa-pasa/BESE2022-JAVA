package np.edu.gces.library.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//@Entity, @RestController, @service
public class MyConfig {
    private int appVersion;
    private String theme;


    static MyConfig config= new MyConfig();

    public MyConfig(){

    }

    public static MyConfig getConfig(){
        return config;
    }
}
