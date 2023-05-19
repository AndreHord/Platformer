package com.hordashko.game.main;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;

public class Shapes {
    int x;
    int y;
    int width;
    int height;
    private OrthographicCamera camera;
    private int Xdir = 5;
    private int Ydir = 5;

    private Color shapeColor;

    public Shapes(int x, int y, int width, int height, OrthographicCamera camera){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.camera = camera;
        shapeColor = new Color(Color.FIREBRICK);
    }

    public void update(){
        x += Xdir;
        if (x>camera.viewportWidth-100||x<0){
            Xdir*= -1;
            shapeColor.set(setColor());
        }

        y += Ydir;
        if (y>camera.viewportHeight-100||y<0){
            Ydir*= -1;
            shapeColor.set(setColor());

        }
    }
    public void draw(ShapeRenderer shape){
        shape.setColor(shapeColor);
        shape.rect(x,y,width,height);
    }

    public static Color setColor(){
        int r = MathUtils.random(255);
        int g = MathUtils.random(255);
        int b = MathUtils.random(255);
        return new Color(Color.rgba8888(r,g,b,0));
    }
}
