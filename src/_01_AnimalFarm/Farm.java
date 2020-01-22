package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> Barn;
		Barn = new ArrayList<Animal>();
		Barn.add(new Cow());
		Barn.add(new Human());
		Barn.add(new Human());
		Barn.add(new Human());
		Barn.add(new Human());
		Barn.add(new Human());
		
		for (int i = 0; i < Barn.size(); i++) {
			Barn.get(i).makeNoise();
		}
	}
}
