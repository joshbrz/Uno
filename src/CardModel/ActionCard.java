package CardModel;
/*
Code created by Josh Braza 
*/
import java.awt.Color;

import View.UNOCard;

public class ActionCard extends UNOCard{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int Function = 0;
	
	//Constructor
	public ActionCard(){
	}
	
	public ActionCard(Color cardColor, String cardValue){
		super(cardColor,ACTION, cardValue);		
	}	
}
