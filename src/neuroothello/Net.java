/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neuroothello;

import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LostMekka
 */
public class Net implements Serializable {
	
	public static Random random = new Random();
	
	private float[][] weights, delta;
	private int hiddenLayerCount, hiddenLayerSize;

	public static Net loadNet(String filename){
		try {
			return (Net)(new ObjectInputStream(new FileInputStream(filename)).readObject());
		} catch (Exception ex) {
			Logger.getLogger(Net.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	public void saveNet(String filename){
		try {
			new ObjectOutputStream(new FileOutputStream(filename)).writeObject(this);
		} catch (Exception ex) {
			Logger.getLogger(Net.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public Net(int hiddenLayerCount, int hiddenLayerSize) {
		this.hiddenLayerCount = hiddenLayerCount;
		this.hiddenLayerSize = hiddenLayerSize;
		weights = new float[hiddenLayerCount][hiddenLayerSize];
		delta = new float[hiddenLayerCount][hiddenLayerSize];
		for(int l=0; l<hiddenLayerCount; l++){
			for(int i=0; i<hiddenLayerSize; i++){
				weights[l][i] = random.nextFloat() * 2f - 1f;
				delta[l][i] = 0f;
			}
		}
	}
	
	public float getOutput(GameField input){
		// TODO: calc
		return 0.5f;
	}
	
	public void backpropagate(float error){
		// TODO: propagate
	}
	
	public void applyDiff(){
		for(int l=0; l<hiddenLayerCount; l++){
			for(int i=0; i<hiddenLayerSize; i++){
				weights[l][i] += delta[l][i];
				delta[l][i] = 0f;
			}
		}
	}
	
}
