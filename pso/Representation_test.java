import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Representation_test {
	byte rprsntn[][];
	int n; //number of collection points
	int k; //number of vehicles
	double adj_mat[][];
	double cost_array[]= new double[2];
	public Representation_test(int k,int n){
		rprsntn=new byte [k][n];
		adj_mat= new double[n+1][n+1];
		this.n=n;
		this.k=k;
	}
	public void init(){
		double random;
		int position[]= new int[n];
		int count_pos=0;
		while(count_pos!=n){
		for(int i=0;i<k;i++){
			for(int j=0;j<n;j++){
			random= Math.random();
			if(random<0.5) {}
			else if (position[j]==0){
				rprsntn[i][j]=1;
				position[j]=1;
				count_pos++;
				//System.out.println("count:"+count_pos);
				}
			}
			
		}
	}
		//constraint_check();
		//if(adjust!=0){
			
		//}
		
		for(int i=0;i<k;i++){
			for(int j=0;j<n;j++){
			System.out.print(rprsntn[i][j]);}
		
		System.out.println();}
		
	}
	public void input(){
		Scanner scn = null;
		try {
			String currentDirectory = new File("").getAbsolutePath();
			scn = new Scanner(new BufferedReader(new FileReader(currentDirectory+"\\test_input.txt")));		
			 for(int i = 0; i < n+1; i++){
				
			     for(int j = 0; j < n+1; j++){
			         adj_mat[i][j] = scn.nextFloat(); 
			        // System.out.print(adj_mat[i][j]);
			       //System.out.print(" ");
			     }
			     
			   // System.out.println();
			  
			     }
				
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
	}
	public void fitness_asses(){
		double best=999999;
		double cost=0;int cust=0,veh=0;
		double cost_array[]= new double[2];
		int start=0;
			for(int i=0;i<k;i++){
				for(int j=0;j<n;j++){
					cost=0;
				if(rprsntn[i][j]==1)
				{
										
					System.out.print("cust:"+j);
					System.out.print(" ");
					System.out.print("veh:"+i);
				
					System.out.print(" ");
					
					cost+=adj_mat[i][j];
					start=j;
					
					
				}
			}
				cost_array[i]=cost;
				System.out.println(cost);
		}
			cost+=adj_mat[start][0];
			if(cost<best) best=cost;
			System.out.println(cost);
			//return best/cost as fitness ? 
			//how to determine best_so_far
			//How to ensure the constraints
		
	}
/*	public void constraint_check()
	{
		byte count[]=new int[n];
	    count=rprsntn[0].;
		for(int i=1;i<n;i++){
			count=count rprsntn[i];
			
			
			}
		}
		for(int j=0;j<n;j++){
			if((count[j])<1){
				if(rprsntn[j]==0) rprsntn[j]=1;
				else rprsntn[j+k]=1;
			}
			else if(count[j]>1){
				if(rprsntn[j]==1) rprsntn[j]=0;
				else rprsntn[j+k]=1;
			}
		}
			
		
	}*/

}
