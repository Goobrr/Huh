package huh.core;

import arc.*;
import arc.scene.*;

public class UI implements ApplicationListener{
    public Group root;

    @Override
    public void init(){
        Core.scene = new Scene();

        // this seems important.
        int[] insets = Core.graphics.getSafeInsets();
        Core.scene.marginLeft = insets[0];
        Core.scene.marginRight = insets[1];
        Core.scene.marginTop = insets[2];
        Core.scene.marginBottom = insets[3];

        root = Core.scene.root;
    }

    @Override
    public void update(){
        Core.scene.act();
        Core.scene.draw();
    }
}
