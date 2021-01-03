package com.mygdx.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Durum 
{
	protected OrthographicCamera camera;
	
	public Durum() 
	{
		camera=new OrthographicCamera();
		camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		
	}
	public abstract void render(SpriteBatch sb);
	
	
	public abstract void updute(float delta);
	public abstract void elGiris();

}
