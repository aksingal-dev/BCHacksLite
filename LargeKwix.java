
public class LargeKwix extends Candy {

	@Override
	protected void SetName() {
	Name = "Large Kwix"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "I have preferred the top one...";
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
		effect[0] = 0;
		effect[1] = 0;
		effect[2] = 1;

	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = true;
	}

}
