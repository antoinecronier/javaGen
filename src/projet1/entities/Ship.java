package projet1.entities;

import projet1.entities.Enums.CarType;
import projet1.entities.Enums.EngineType;
import projet1.entities.Enums.ShipType;
import projet1.entities.base.Vehicule;

public class Ship extends Vehicule {
	private Boolean haveSail;

	public Boolean getHaveSail() {
		return haveSail;
	}

	public void setHaveSail(Boolean haveSail) {
		this.haveSail = haveSail;
	}

	private void SpecialInit(String name, int nbPlace, String description,
			int weight, Engine engine, Boolean haveSail) {

		this.setName(name);
		this.setNbPlace(nbPlace);
		this.setDescription(description);
		this.setWeight(weight);
		this.setEngine(engine);

		this.setHaveSail(haveSail);
	}

	public void init(ShipType type) {

		switch (type) {
		case Catamaran:
			this.SpecialInit("Catamaran", 4, "BlopBlop le bateau", 2400,
					Engine.SpecialInit(EngineType.Type2), true);
			break;
		case Paquebot:
			this.SpecialInit("Paquebot", 4, "BlopBlop le bateau", 1400,
					Engine.SpecialInit(EngineType.Type2), false);
			break;
		default:
			break;
		}
	}

	public void PrintAll() {
		System.out.println("Id : " + this.getId());
		System.out.println("Name : " + this.getName());
		System.out.println("Global description : " + this.getDescription());
		if (this.getHaveSail()) {
			System.out.println("Ship have sails");
		}else {
			System.out.println("Ship have no sails");
		}
		System.out.println("Weight : " + this.getWeight());
		System.out.println("Places : " + this.getNbPlace());
		this.getEngine().PrintAll();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Id : " + this.getId() +
				"\nName : " + this.getName();
		return result;
	}
}
