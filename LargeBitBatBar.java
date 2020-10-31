
public class LargeBitBatBar extends Candy {

	@Override
	protected void SetName() {
		Name = "Large BitBat Bar"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "Have a snake; have a BitBat";
		
	}

	@Override
	protected void SetPoints() {
		// TODO Auto-generated method stub
		Points = 500; 
	}

	@Override
	protected void SetEdible() {
		// TODO Auto-generated method stub
		Edible = true; 
	}

	@Override
	protected void setEffects() {
		// TODO Auto-generated method stub
		effect[0] = 2;
		effect[1] = 0;
		effect[2] = 0;
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = true;
	}

}
