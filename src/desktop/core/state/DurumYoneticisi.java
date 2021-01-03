package com.mygdx.states;

import java.util.Stack;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DurumYoneticisi {
	private Stack<Durum> states;
	public DurumYoneticisi() 
	{
		states=new Stack<Durum>();
	}
	public void render(SpriteBatch sb) 
	{
		states.peek().render(sb);
	}
	public void updute(float delta)
	{
		states.peek().updute(delta);
		states.peek().elGiris();
	}
	public void pushState(Durum state)
	{
		
		states.push(state);
	}
	public void popState()
	{
		states.pop();
	}

}
