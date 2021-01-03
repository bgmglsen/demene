package com.mygdx.oyunDurumInput;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.states.OyunDurum;

public class OyunDurumInput implements InputProcessor {
	
	private OyunDurum oyunDurum;
	public OyunDurumInput(OyunDurum oyunDurum) 
	{
		this.oyunDurum=oyunDurum;
	}

	@Override
	public boolean keyDown(int keycode) {
		
		
		switch(keycode) {
		case Keys.A:
			oyunDurum.getOyunDunyasi().getKarakter().solaHaraket();
			break;
		case Keys.D:
			oyunDurum.getOyunDunyasi().getKarakter().sagaHaraket();
			break;
		case Keys.W:
			oyunDurum.getOyunDunyasi().getKarakter().yukariHaraket();
			break;
		case Keys.S:
			oyunDurum.getOyunDunyasi().getKarakter().asagiHaraket();
			break;
		default :
			break;
		}
		
		
		
		return false;
	} 

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		System.out.println("Hello, this is touchdown!?????????????????????????????????????????????????????????????????????????????????????????????????????????");
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}

}
