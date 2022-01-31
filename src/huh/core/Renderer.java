package huh.core;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;

public class Renderer implements ApplicationListener{
    @Override
    public void update(){
        float w = Core.graphics.getWidth();
        float h = Core.graphics.getHeight();
        Draw.color(Color.black);
        Fill.crect(0, 0, w, h);
        Draw.color(Tmp.c1.set(Color.red).shiftHue(Time.time));
        Fill.crect(w / 2f, h / 2f, (w / 2f) * Mathf.sinDeg(Time.time), (h / 2f) * Mathf.cosDeg(Time.time));
    }
}
