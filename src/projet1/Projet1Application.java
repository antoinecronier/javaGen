package projet1;

import projet1.entities.Car;
import projet1.entities.Engine;
import projet1.entities.Ship;
import projet1.entities.Enums.CarType;
import projet1.entities.Enums.EngineType;
import projet1.entities.Enums.ShipType;

public class Projet1Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.err.println("error");


		Car maVoiture = new Car();
		maVoiture.setId(45);
		maVoiture.setName("Tuture");
		System.out.println(maVoiture.getId());
		System.out.println(maVoiture.toString());

		Car maVoiture2 = new Car();
		System.out.println(maVoiture2.getId());

		Engine myE = new Engine();
		Engine myE1 = myE.SpecialInit(EngineType.Type1);
		System.out.println("--------------------");
		System.out.println(myE);
		System.out.println("--------------------");
		System.out.println(myE1);

		Car carRoue = new Car(4);
		carRoue.PrintAll();

		System.out.println("===============================");

		Car clio = new Car();
		clio.init(CarType.Clio);
		clio.PrintAll();

		System.out.println("===============================");

		Car bwm = new Car();
		bwm.init(CarType.BWM);

		bwm.PrintAll();

		System.out.println("===============================");

		Car ferrari = new Car();
		ferrari.init(CarType.Ferrari);
		ferrari.PrintAll();

		System.out.println("===============================");

		Ship paquebot = new Ship();
		paquebot.init(ShipType.Paquebot);
		paquebot.setWeight(50000);
		paquebot.getEngine().setWeight(6000);
		paquebot.PrintAll();

		System.out.println("===============================");

		Ship catamaran = new Ship();
		catamaran.init(ShipType.Catamaran);
		catamaran.PrintAll();
	}

}
