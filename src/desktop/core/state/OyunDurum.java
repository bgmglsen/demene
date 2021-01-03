package com.mygdx.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.imageloader.Resim;
import com.mygdx.oyunDurumInput.OyunDurumInput;

import oyunObject.Karakter;
import oyunObject.OyunDunyasi;

public class OyunDurum extends Durum {
	
	//private Karakter karakter;
	private OyunDunyasi od;
	
	public OyunDurum() 
	{ 
		od=new OyunDunyasi();
		//karakter=new Karakter(120,460,100,100);
		Gdx.input.setInputProcessor(new OyunDurumInput(this));
	}

	@Override
	public void render(SpriteBatch sb) 
	{
		sb.setProjectionMatrix(camera.combined);
		od.render(sb);
		
	   // karakter.render(sb);
	}

	@Override
	public void updute(float delta)
	{
		//karakter.updute(delta);
		
	}

	@Override
	public void elGiris()
    {
		
		if(Gdx.input.isTouched()) {
			System.out.println("Ekrana dokunuluyor.....");

		}
		
		
	}

public  OyunDunyasi getOyunDunyasi() {
	return od;
}
}
