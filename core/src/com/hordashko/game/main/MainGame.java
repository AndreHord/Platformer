package com.hordashko.game.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;


public class MainGame extends Game {
	private int wightGame = 800;
	private int heightGame = 480;

	private OrthographicCamera orthographicCamera;

	
	@Override
	public void create () {
		this.wightGame = Gdx.graphics.getWidth();
		this.heightGame = Gdx.graphics.getHeight();
		this.orthographicCamera = new OrthographicCamera();
		this.orthographicCamera.setToOrtho(false,wightGame,heightGame);
		setScreen(new GameScreen(orthographicCamera));


	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 1, 3, 1);
		super.render();

	}
	
	@Override
	public void dispose () {

	}
}
