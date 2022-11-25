package sim;

import utils.Coords;

public class EntityFactory{
	public static Entity createEntity(String line, Arena arena){
		if (line == null)
			return null;
		String [] tokens = line.split(" ");

		switch (tokens[0]){
		case "HOG":
			return new Hog(new Coords(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])), arena);
		case "MELON":
			return new Melon(new Coords(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])), arena, Integer.parseInt(tokens[3]));
		}

		return null;
	}
}