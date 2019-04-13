package item;

import hero.base.Hero;
import hero.base.Assassin;
import javafx.scene.image.Image;


public class AssassinItem extends Item{

	public AssassinItem() {
		Image img = new Image("file:res/" + "Assassin_item.png");
		
	}
	
	@Override
	public void tranform() {
		// TODO Auto-generated method stub
		Assassin assassin = new Assassin();
	}
	
	

}
