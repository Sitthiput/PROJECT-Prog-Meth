package item;

import hero.base.Hero;
import hero.base.Boomeranger;
import javafx.scene.image.Image;


public class BoomerangerItem extends Item{

	public BoomerangerItem() {
		Image img = new Image("file:res/" + "Boomeranger_item.png");
		
	}
	
	@Override
	public void tranform() {
		// TODO Auto-generated method stub
		Boomeranger mage = new Boomeranger();
	}
	
	

}
