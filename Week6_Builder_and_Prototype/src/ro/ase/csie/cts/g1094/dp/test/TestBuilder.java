package ro.ase.csie.cts.g1094.dp.test;

import ro.ase.csie.cts.g1094.dp.builder.Pistol;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//create the object
		//SuperHero superHero = new SuperHero();
		//initialize the object
		//superHero.name="Super man";
		//superHero.lifePoints=100;
		//superHero.superPower="Can fly";
		//superHero.superPower="Laser eyes";
		
		//SuperHero superHero=
		//		new SuperHero("Super man", 100, false, false, null, new Pistol(),"Laser eyes",null);
		
		SuperHero superman = new SuperHero.SuperHeroBuilder("Super man", 100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
	
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillan()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
		
	}

}
