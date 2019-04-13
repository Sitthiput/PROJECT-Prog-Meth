package item;

import hero.base.Hero;
import hero.base.Swordman;
import javafx.scene.image.Image;


public class SwordmanItem extends Item{

	public SwordmanItem() {
		Image img = new Image("file:res/" + "Swordman_item.png");
		
	}
	
	@Override
	public void tranform() {
		// TODO Auto-generated method stub
		Swordman swordman = new Swordman();
	}
	
}
