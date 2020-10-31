
public class CookiesAndCreamBar extends Candy{

	@Override
	protected void SetName() {
	Name = "Cookies and Cream Bar"; 
		
	}

	@Override
	protected void SetDescription() {
		// TODO Auto-generated method stub
		Description = "My favorite"; 
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
		effect[0] = 0;
		effect[1] = 2;
		effect[2] = 0;
		
	}

	@Override
	protected void setBribe() {
		// TODO Auto-generated method stub
		canBribe = true;
	}

}
