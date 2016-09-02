package projet1.entities;

import projet1.entities.Enums.EngineType;

public class Engine {
	private int id;
	private int power;
	private int weight;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Engine() {
	}

	public Engine(int truc) {
		this.setPower(truc);
	}

	public void PrintAll() {
		System.out.println("\tId : " + this.getId());
		System.out.println("\tName : " + this.getName());
		System.out.println("\tPower : " + this.getPower());
		System.out.println("\tWeight : " + this.getWeight());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Id : " + this.getId() +
				"\nName : " + this.getName();
		return result;
	}

	public static Engine SpecialInit(EngineType type) {
		Engine result = new Engine();

		switch (type) {
		case Type1:
			result.setName("MoteurVoiture");
			result.setPower(400);
			result.setWeight(300);
			break;
		case Type2:
			result.setName("MoteurBateau");
			result.setPower(1400);
			result.setWeight(1000);
			break;
		default:
			break;
		}

		return result;
	}
}
