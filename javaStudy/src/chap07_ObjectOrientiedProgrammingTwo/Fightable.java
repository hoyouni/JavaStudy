package chap07_ObjectOrientiedProgrammingTwo;

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack();
}

interface Fightable extends Movable, Attackable {

	@Override
	default void attack() {
	}

	@Override
	default void move(int x, int y) {
	}
	
}

















