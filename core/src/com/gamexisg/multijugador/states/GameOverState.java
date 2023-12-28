package com.gamexisg.multijugador.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.gamexisg.multijugador.shooter.input.GameOverInput;
import com.gamexisg.multijugador.shooter.utils.GameUtils;

/**
 * 
 * Clase para controlar el game over
 * 

 *
 */
public class GameOverState extends State {

	private BitmapFont smallFont;

	public GameOverState(StateController sc) {
		super(sc);
		ip = new GameOverInput(this);
		smallFont = GameUtils.generateBitmapFont(32, Color.WHITE);

	}

	@Override
	public void render() {
		float red = 50f;
		float green = 63f;
		float blue = 94f;
		Gdx.gl.glClearColor(red / 255f, green / 255f, blue / 255f, 0.5f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sb.begin();
		GameUtils.renderCenter("Perdeu", sb, bitmapFont);
		GameUtils.renderCenter("Presionar R para reiniciar.", sb, smallFont, 0.6f);
		sb.end();
	}

	@Override
	public void update(float deltaTime) {
		// actualizar cosas de ser necesario
	}

	@Override
	public void dispose() {
	}

	public void restart() {
		PlayState playState = (PlayState) this.sc.getStateMap().get(StateEnum.PLAY_STATE.ordinal());
		playState.restart();
	}

}
