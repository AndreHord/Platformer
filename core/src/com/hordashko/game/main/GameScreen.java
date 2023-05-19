package com.hordashko.game.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;

import java.util.ArrayList;


public class GameScreen implements Screen {

    private OrthographicCamera camera;
    private ShapeRenderer shape;
    private ShapeRenderer shape1;
    private float shapeX = 200;
    private float shapeY = 200;

    private float Xdir = 3;
    private float Ydir = 3;


    private ArrayList<Shapes> shapes;


    public GameScreen(OrthographicCamera camera){
        this.camera = camera;
    }

    @Override
    public void show() {
        shape1 = new ShapeRenderer();
        shapes = new ArrayList<>();
        for (int i = 1; i < 50; i++){
            shapes.add(new Shapes(MathUtils.random((int)Gdx.graphics.getWidth()), MathUtils.random((int)Gdx.graphics.getHeight()),MathUtils.random(200),MathUtils.random(200), camera));
        }


        //shapes = new Shapes(100,100, 100, 100, camera);
    }

    @Override
    public void render(float delta) {

        shape = new ShapeRenderer();

        if (Gdx.input.isKeyPressed(Input.Keys.W)){
            shapeY = shapeY + 5;
        } else if (Gdx.input.isKeyPressed(Input.Keys.S)){
            shapeY = shapeY - 5;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            shapeX = shapeX + 5;
        } else if (Gdx.input.isKeyPressed(Input.Keys.A)){
            shapeX = shapeX - 5;
        }

        if (shapeX < 0) {
            shapeX = 0;

        }
        if (shapeX >= camera.viewportWidth-200) {
            shapeX = camera.viewportWidth-200;

        }
        if (shapeY < 0) {
            shapeY = 0;

        }
        if (shapeY >= camera.viewportHeight-200) {
            shapeY = camera.viewportHeight-200;

        }




        shape1.setProjectionMatrix(camera.combined);
        shape1.begin(ShapeRenderer.ShapeType.Filled);
        for (Shapes shapes1 : shapes){
            shapes1.update();
            shapes1.draw(shape1);
        }
        shape1.end();

    }


    @Override
    public void resize(int width, int height) {
        camera.setToOrtho(false, width, height);
        camera.update();
    }


    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        shape.dispose();
        shape1.dispose();
    }
}
