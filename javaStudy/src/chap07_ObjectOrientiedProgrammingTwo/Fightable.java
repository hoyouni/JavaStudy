package chap07_ObjectOrientiedProgrammingTwo;

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack();
}

interface Fightable extends Movable, Attackable {
	
}

class Fighter implements Fightable {

	@Override
	public void attack() {
		
	}

	@Override
	public void move(int x, int y) {
		
	}
	
}
















