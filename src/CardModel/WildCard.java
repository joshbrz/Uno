package CardModel;
/*
Code created by Josh Braza 
*/
import java.awt.Color;

import View.UNOCard;

@SuppressWarnings("serial")
public class WildCard extends UNOCard {
	
	@SuppressWarnings("unused")
	private int Function = 0;
	private Color chosenColor;
	
	public WildCard() {
	}
	
	public WildCard(String cardValue){
		super(BLACK, WILD, cardValue);		
	}
	
	public void useWildColor(Color wildColor){
		chosenColor = wildColor;
	}
	
	public Color getWildColor(){
		return chosenColor;
	}

}
