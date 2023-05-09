package com.hordashko.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends Game {
	private int wightGame;
	private int heightGame;

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
		ScreenUtils.clear(0, 0, 2f, 1);

	}
	
	@Override
	public void dispose () {

	}
}
