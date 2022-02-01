package huh;

import arc.backend.sdl.*;

public class Launcher {
    public static void main(String[] args){
        new SdlApplication(new Huh(), new SdlConfig(){{
            title = "Funny";

            width = 720;
            height = 576;

            vSyncEnabled = true;
        }});
    }


}
