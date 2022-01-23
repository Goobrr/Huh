package huh;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.util.*;

public class Huh implements ApplicationListener{
    @Override
    public void init(){
        Log.info("GL Version: @", Core.graphics.getGLVersion());
        Log.info("Max texture size: @", Gl.getInt(Gl.maxTextureSize));
        Log.info("Using @ Context", Core.gl30 != null ? "OpenGL 3" : "OpenGL 2");

        //Core.camera = new Camera();
    }

    @Override
    public void update(){
        Core.graphics.setTitle("Huh? - " + Core.graphics.getFramesPerSecond() + "FPS");

        //Draw.rect();
    }

    @Override
    public void exit(){
        Log.info("Goodbye");
    }
}
