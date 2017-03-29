package hw3;

import api.Cell;
import api.Flow;
import hw3.FlowGame;
import hw3.Util;


public class Test1 {
	
	public static void main(String[] args) {
		/*
		Cell e0 = new Cell(2, 3, 'R');
		Cell e1 = new Cell(9, 10, 'R');
		Flow f = new Flow(e0, e1);
		System.out.println(f);
		f.add(e1);
		System.out.println(f);
		System.out.println(f.getEndpoint(0));
		*/
		//
	 	Flow[] flows = new Flow[3];
	 	flows[0] = new Flow(new Cell(0, 0, 'G'), new Cell(1, 2, 'G'));
	 	flows[1] = new Flow(new Cell(0, 1, 'R'), new Cell(0, 3, 'R'));
	 	flows[2] = new Flow(new Cell(2, 0, 'B'), new Cell(1, 3, 'B'));
	 	FlowGame game = new FlowGame(flows, 4, 3);
	 	// check the initial game state
	 	System.out.println(game.getWidth());
	 	System.out.println(game.getHeight());
	 	System.out.println(game.getCurrent());
	 	Flow[] temp = game.getAllFlows();
	 	for (Flow f : temp) {
	 		System.out.println(f);
	 	}
	 	//
	 	//
	 	game.startFlow(1, 3);
	 	System.out.println(game.getCurrent());
	 	temp = game.getAllFlows();
	 	for (Flow f : temp) {
	 		System.out.println(f);
	 	}
	 	//
	}
	
	// create a simple game

	
}
