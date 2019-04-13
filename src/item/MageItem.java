package item;

import hero.base.Hero;
import hero.base.Mage;
import javafx.scene.image.Image;


public class MageItem extends Item{

	public MageItem() {
		Image img = new Image("file:res/" + "Mage_item.png");
		
	}
	
	@Override
	public void tranform() {
		// TODO Auto-generated method stub
		Mage mage = new Mage();
	}
	
	

}
