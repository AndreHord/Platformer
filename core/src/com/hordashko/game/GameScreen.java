package com.hordashko.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class GameScreen implements Screen {

    private OrthographicCamera camera;
    private ShapeRenderer shape;


    public GameScreen(OrthographicCamera camera){
        this.camera = camera;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        shape = new ShapeRenderer();
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(Color.FIREBRICK);
        shape.rect(200,200,200,200);
        shape.end();

    }

    @Override
    public void resize(int width, int height) {

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
    }
}
