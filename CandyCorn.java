
public class CandyCorn extends Candy{

	@Override
	protected void SetName() {
		Name = "CandyCorn"; 
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "Well, the other kids said not to go to that hosuse"; 
	}

	@Override
	protected void SetPoints() {
		// TODO Auto-generated method stub
		Points= 10; 
		
	}

	@Override
	protected void SetEdible() {
		// TODO Auto-generated method stub
		Edible = true; 
	}

	@Override
	protected void setEffects() {
		effect[0] = 1;
		effect[1] = 0;
		effect[2] = -2;
		
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = false;
	}

}
