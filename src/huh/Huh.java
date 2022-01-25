package huh;

import arc.*;
import arc.graphics.*;
import arc.util.*;
import huh.core.*;

public class Huh extends ApplicationCore{
    @Override
    public void setup(){
        Log.info("GL Version: @", Core.graphics.getGLVersion());
        Log.info("Max texture size: @", Gl.getInt(Gl.maxTextureSize));
        Log.info("Using @ Context", Core.gl30 != null ? "OpenGL 3" : "OpenGL 2");


        add(new Renderer());
        add(new UI());
    }

    @Override
    public void update(){
        Core.graphics.setTitle("Huh? - " + Core.graphics.getFramesPerSecond() + "FPS");
    }

    @Override
    public void exit(){
        Log.info("Goodbye");
    }
}
