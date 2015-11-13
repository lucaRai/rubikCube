package main;

import java.util.Arrays;

import beans.Cube;
import exceptions.DifferentSizeRowsException;
import exceptions.NonSquareMatrixException;
import exceptions.NotAllowedValueException;
import exceptions.WrongSizeMatrixException;
import utils.CubeUtils;

public class Test {
	
		static Cube cube = new Cube();
	public static void main(String[] args) {

		char[][] frontFace = {{'b', 'w', 'b'}, {'b', 'w', 'w'}, {'w', 'o', 'g'}};
		cube.setFrontFace(frontFace);
		char[][] upFace = {{'y', 'g', 'o'}, {'g', 'g', 'b'}, {'y', 'g', 'w'}};
		cube.setUpFace(upFace);
		char[][] downFace = {{'b', 'w', 'y'}, {'b', 'b', 'y'}, {'w', 'b', 'g'}};
		cube.setDownFace(downFace);
		char[][] backFace = {{'r', 'r', 'w'}, {'r', 'y', 'r'}, {'b', 'o', 'g'}};
		cube.setBackFace(backFace);
		char[][] rightFace = {{'o', 'w', 'y'}, {'r', 'o', 'g'}, {'r', 'o', 'o'}};
		cube.setRightFace(rightFace);
		char[][] leftFace = {{'r', 'y', 'o'}, {'y', 'r', 'y'}, {'g', 'o', 'r'}};
		cube.setLeftFace(leftFace);
		
		printFaces();
		try {
			CubeUtils.movementR(cube);
		} catch (DifferentSizeRowsException | NotAllowedValueException | WrongSizeMatrixException
				| NonSquareMatrixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--- Rotazione ---");
		printFaces();
		
	}
	
	private static void printFaces() {
		System.out.println("Front Face");
		printer(cube.getFrontFace().getMatrix());
		System.out.println("Up Face");
		printer(cube.getUpFace().getMatrix());
		System.out.println("Down Face");
		printer(cube.getDownFace().getMatrix());
		System.out.println("Back Face");
		printer(cube.getBackFace().getMatrix());
		System.out.println("Right Face");
		printer(cube.getRightFace().getMatrix());
		System.out.println("Left Face");
		printer(cube.getLeftFace().getMatrix());
	}
	private static void printer(char[][] face) {
		for (char[] row : face) {
			System.out.println(Arrays.toString(row));
		}
	}

}
