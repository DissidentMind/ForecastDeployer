package forecast.algorithms.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * BuilPathFix - ForecastDeployer
 * @author evanf
 *
 */
public class EightQueens_Alg {
	
	private int failsRequired = 1000;
	private int posOne;
	private int posTwo;
	private int counterQueens = 0;
	public int sizeBoard = 56;
	private Random generateRand = new Random();
	private List<String> getPositions = new ArrayList<String>();
	
	public void launchEightQueensAlgorithm(int BOARD_56[][]){		
		int failTray = 0;
		int availabilityTry;
		
		while ( sizeBoard > counterQueens && failTray < failsRequired){
			generatePosition(); 
		availabilityTry =  Verifica_Posicion(BOARD_56);
		if ( 0 == availabilityTry )
		failTray++;
		else
			BOARD_56[posOne][posTwo] = ++counterQueens;
		}
		if ( sizeBoard != counterQueens){
			System.out.printf("Not setted all the queens %d reinas\n", counterQueens);
		}else{
			System.out.println("All Queens Setted");
		}
	}
	
	public void generatePosition(){
		posOne = generateRand.nextInt(sizeBoard) + 1;
		posTwo = generateRand.nextInt(sizeBoard) + 1;
	}
	
	public int Verifica_Posicion(int B[][]){
		int estatus = 1;
		if ( 0 == B[posOne][posTwo] )
		{        
			for ( int i = 1; i <= sizeBoard; i++ )
				for ( int j = 1; j <= sizeBoard; j++ )
				{ 

					if ( 0 != B[i][j] ){
						if ((( posOne == i) || (posTwo == j ))  || (Math.abs(posOne - i) == Math.abs(posTwo - j )) ){
							estatus = 0;
							break;
						}
					}      
				}     

		}   
		else
			estatus = 0;
		return estatus;
	}        
	public void Imprime(int C[][]){ 
	for(int i = 0; i < C.length; i++){
        for(int j = 0; j < C[i].length; j++){
        	System.out.println(i+","+j);
             System.out.println("Value: "+C[i][j]);
             
             
             if(C[i][j] != 0){
            		getPositions.add(i+","+j);
            			}
            	} 
             
        	}
	
	for(int o=0;o<getPositions.size();o++){
		System.out.println("N."+o+" - "+getPositions.get(o));
			}
	}
			
}
