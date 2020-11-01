
public class ChocolateRaisins extends Candy {

	@Override
	protected void SetName() {
		Name = "box of Chocolate Raisins"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "Fresh from the rabbit farm!";
		
	}

	@Override
	protected void SetPoints() {
		// TODO Auto-generated method stub
		Points = 100; 
	}

	@Override
	protected void SetEdible() {
		// TODO Auto-generated method stub
		Edible = true; 
	}

	@Override
	protected void setEffects() {
		effect[0] = -1;
		effect[1] = 1;
		effect[2] = 0;
		
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}

}
