package huh;

import arc.*;
import arc.assets.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.scene.*;
import arc.util.*;
import huh.core.*;

public class Huh extends ApplicationCore{
    @Override
    public void setup(){
        Log.info("GL Version: @", Core.graphics.getGLVersion());
        Log.info("Max texture size: @", Gl.getInt(Gl.maxTextureSize));
        Log.info("Using @ Context", Core.gl30 != null ? "OpenGL 3" : "OpenGL 2");

        Core.assets = new AssetManager();
        Core.camera = new Camera();
        Core.batch = new SortedSpriteBatch();
        Core.atlas = TextureAtlas.blankAtlas();

        Core.scene = new Scene();

        add(new Renderer());
    }

    @Override
    public void update(){
        Time.update();
        super.update();
        Core.graphics.setTitle("Huh? - " + Core.graphics.getFramesPerSecond() + "FPS - " + Mathf.floor(Time.time));

        //Draw.flush();
    }

    @Override
    public void exit(){
        Log.info("Goodbye");
        super.exit();
    }
}
