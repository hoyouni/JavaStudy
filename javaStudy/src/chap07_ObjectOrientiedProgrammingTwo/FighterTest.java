package chap07_ObjectOrientiedProgrammingTwo;

class Unit {
	int currentHP;
	int x;
	int y;
}

interface MovableTwo {
	void move(int x, int y);
}

interface AttackableTwo {
	void attack(Unit u);
}

interface FightableTwo extends MovableTwo, AttackableTwo {
	
}

class FighterTwo extends Unit implements FightableTwo {

	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit u) {
	}
	
}

public class FighterTest {
	public static void main(String[] args) {
		FightableTwo f = new FighterTwo();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손");
		} 
		
		if(f instanceof FightableTwo) {
			System.out.println("f는 FightableTwo 인터페이스를 구현");
		} 
		
		if(f instanceof MovableTwo) {
			System.out.println("f는 MovableTwo 인터페이스를 구현");
		} 
		
		if(f instanceof AttackableTwo) {
			System.out.println("f는 AttackableTwo 인터페이스를 구현");
		} 
		
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손");
		} 
		
	}
}















