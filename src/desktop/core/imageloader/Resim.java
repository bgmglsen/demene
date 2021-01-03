package com.mygdx.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Resim 
{
	public static Texture text;
	public static TextureRegion textReg;
	
	
	public static void load()
	{
	text=new Texture(Gdx.files.internal("koþan adam.png"));
	textReg=new TextureRegion(text,0,0,text.getWidth(),text.getHeight());
	textReg.flip(false, true);
	
	}
	public static void dispose() 
	{
		 text.dispose();
	}

}
