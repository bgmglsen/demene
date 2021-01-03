package com.mygdx.sevimlikodlar;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.imageloader.Resim;
import com.mygdx.states.OyunDurum;
import com.mygdx.states.DurumYoneticisi;
import com.badlogic.gdx.Game;


public class SevimliKodlar extends Game{
	public static int WIDHT=480;
	public static int HEIGHT=800;
	public static String TITLE="SeViMlÝ KoDlAr";

	private  SpriteBatch sb;
	
	
	
 	private static DurumYoneticisi sm;
	
	@Override
	public void create() {
		
		Gdx.gl.glClearColor(0.1f, 0.1f,0.1f, 1);
		
		Resim.load();
		
		sb=new SpriteBatch();
		
		sm=new DurumYoneticisi();
		sm.pushState(new OyunDurum());
		
		System.out.println("Oyun oluþturuldu..");
		 
	}
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sm.render(sb);
		sm.updute(Gdx.graphics.getDeltaTime());
	}
	public void dispose() {
		Resim.dispose();
		
		
		System.out.println("Oyun yok edildi..");
		 
	}
	
}
