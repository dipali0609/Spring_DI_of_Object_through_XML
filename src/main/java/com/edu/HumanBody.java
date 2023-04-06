package com.edu;

public class HumanBody {

	private HumanHeart humanHeart;

	public HumanBody(HumanHeart humanHeart) {
		super();
		this.humanHeart = humanHeart;
	}
	
	
	public void bodyMethod()
	{
		if(humanHeart!=null)
		{
			System.out.println("Human is Alive");
			humanHeart.HeartBeat();
		}
		else
		{
			System.out.println("Human is Not Alive");
		}
	}

}
