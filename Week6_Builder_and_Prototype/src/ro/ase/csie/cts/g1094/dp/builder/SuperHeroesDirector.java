package ro.ase.csie.cts.g1094.dp.builder;

import ro.ase.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class SuperHeroesDirector {

	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroesDirector(SuperHero.SuperHeroBuilder builder) {
		this.builder = builder;
	}
	
	public SuperHero buildJoker() {
		return builder.isVillan()
			.addLeftWeapon(new Pistol())
			.addRightWeapon(new Pistol())
			.build();
	}
	
	public SuperHero buildSuperman() {
		return builder.addSuperPower("Fly")
		.addLeftWeapon(new Pistol())
		.build();
		
	}
		SuperHeroesDirector catalogue = 
				new SuperHeroesDirector(new SuperHeroBuilder("Joker", 200));
		SuperHero jokerClone = catalogue.buildJoker();
}

