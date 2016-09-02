package projet1.entities;

import projet1.entities.Enums.CarType;
import projet1.entities.Enums.EngineType;
import projet1.entities.base.Vehicule;

public class Car extends Vehicule {
	private int nbRoue;
	private String desc;

	int getNbRoue() {
		return nbRoue;
	}

	public void setNbRoue(int nbRoue) {
		this.nbRoue = nbRoue;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Car() {
		super();
	}

	public Car(int nbRoue) {
		super();
		this.setNbRoue(nbRoue);
		this.setEngine(new Engine(100));
	}

	public void SpecialInit(String name, int nbPlace, String description,
			int weight, Engine engine, int nbRoue, String desc) {

		this.setName(name);
		this.setNbPlace(nbPlace);
		this.setDescription(description);
		this.setWeight(weight);
		this.setEngine(engine);

		this.setNbRoue(nbRoue);
		this.setDesc(desc);
	}

	public void init(CarType type) {

		switch (type) {
		case BWM:
			this.SpecialInit("BMW", 4, "Vroummm la voiture", 2400,
					Engine.SpecialInit(EngineType.Type1), 4, "Grosse voiture");
			break;
		case Clio:
			this.SpecialInit("Clio", 4, "Vroummm la voiture", 1400,
					Engine.SpecialInit(EngineType.Type1), 4, "Petite voiture");
			break;
		case Ferrari:
			this.SpecialInit("Ferrari", 4, "Vroummm la voiture", 1600,
					Engine.SpecialInit(EngineType.Type1), 4,
					"Voiture de crouse");
			break;
		case Mercedes:
			this.SpecialInit("Mercedes", 4, "Vroummm la voiture", 2700,
					Engine.SpecialInit(EngineType.Type1), 4,
					"Très grosse voiture");
		default:
			break;
		}
	}

	public void PrintAll() {
		System.out.println("Id : " + this.getId());
		System.out.println("Name : " + this.getName());
		System.out.println("Global description : " + this.getDescription());
		System.out.println("Car description : " + this.getDesc());
		System.out.println("Weight : " + this.getWeight());
		System.out.println("Places : " + this.getNbPlace());
		System.out.println("Wheels : " + this.getNbRoue());
		this.getEngine().PrintAll();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Id : " + this.getId() + "\nName : " + this.getName();
		result += " " + super.toString();
		return result;
	}
}
