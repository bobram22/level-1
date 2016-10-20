import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World W = new World();
	W.show();
	int rand = new Random().nextInt(10);
	Color gre = new Color(0, 255, 0);
	Bug SnoopDogg = new Bug(gre);
	Bug Pedro = new Bug();
	Location yeah = new Location(rand, rand);
	Location boi = new Location(0, 1);
	W.add(boi, SnoopDogg);
	W.add(yeah, Pedro);
	Flower flowy = new Flower();
	W.add(boi, flowy);
	
}
}
