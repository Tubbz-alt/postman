package me.srgantmoomoo.postman.module.modules.player;

import org.lwjgl.input.Keyboard;

import me.srgantmoomoo.postman.module.Category;
import me.srgantmoomoo.postman.module.Module;

public class Jesus extends Module {
	
	public Jesus() {
		super ("jesus", "u r now jesus lul", Keyboard.KEY_NONE, Category.PLAYER);
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}

}
