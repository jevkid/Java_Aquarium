
public class fishTest {
	public static void main(String args[]){
		Aquarium tank = new Aquarium();
		Fish jaws = new Fish("Shark","Jaws",1); 
		Fish gold = new Fish("Goldfish","Goldy",4);
		Fish cod = new Fish("Cod","Silver Ones",29);
		tank.addFish(jaws); //Jaws
		tank.addFish(gold); //Goldy (4)
		tank.addFish(cod); //Silver Ones (29)
		print(tank); 
		System.out.println(tank.numberAvailableFishes()); //(34)
		tank.sellFish(gold,2);
		print(tank); // Jaws Goldy (2) Silver Ones (29)
		System.out.println(tank.numberAvailableFishes()); //(32)
		System.out.println(tank.getFishWithName("goldy")); //True
		System.out.println(tank.hasFishWithName("Goldy")); //True
		System.out.println(tank.hasFishWithName("goldy")); //True
		System.out.println(tank.hasFishWithName("Nop")); //False
		
		Aquarium tank2 = new Aquarium(5);
		tank2.addFish(gold);
		System.out.println(tank2.fishCount); //4
		tank2.addFish(jaws);
		System.out.println(tank2.fishCount); //5
	}
	public static void print(Aquarium s){
		System.out.print(s);
	}
}
