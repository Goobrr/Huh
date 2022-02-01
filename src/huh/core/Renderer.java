package huh.core;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;

public class Renderer implements ApplicationListener{
    public Vec2 vel, pos;
    public float h, w;

    public Seq<Vec2> trail = new Seq<>();

    public Renderer(){
        vel = new Vec2(2, 2);
        pos = new Vec2(Core.graphics.getWidth() / 2f, Core.graphics.getHeight() / 2f);
    }

    @Override
    public void update(){
        w = Core.graphics.getWidth();
        h = Core.graphics.getHeight();

        if(pos.x + vel.x > w - 16 || pos.x + vel.x < 16){
            vel.x *= -1;
        }
        if(pos.y + vel.y > h - 16 || pos.y + vel.y < 16){
            vel.y *= -1;
        }
        pos.add(vel.x * Time.delta, vel.y * Time.delta);

        if(Mathf.floor(Time.time) % 2 == 0){
            if(trail.size == 10){
                trail.remove(0);
            }
            trail.add(pos.cpy());
        }

        draw();
    }

    public void draw(){
        Core.camera.resize(w, h);
        Core.camera.position.set(w/2, h/2);
        Draw.proj(Core.camera);

        Draw.color(Color.black);
        Draw.rect();

        for(int i = 0; i < trail.size; i++){
            Draw.color(Tmp.c1.set(Color.white).value(i / 10f));
            Vec2 pos = trail.get(i);
            Fill.rect(pos.x, pos.y, 32, 32);
        }
        Draw.color(Color.white);
        Fill.rect(pos.x, pos.y, 32, 32);
    }
}
