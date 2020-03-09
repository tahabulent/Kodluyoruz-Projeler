package Hellow;

public class Step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fark;
	    int[] array=new int[10];
	    for(int i=0;i<array.length;i++){
	        array[i]=(int)(Math.random()*101);
	    }
	    int büyük,küçük;
	    büyük=array[0];
	    küçük=array[0];

	    for(int i=0;i<array.length;i++){
	        if(büyük<array[i]){
	            büyük=array[i];
	        }
	        if(küçük>array[i]){
	            küçük=array[i];
	        }

	    }
	    fark=büyük-küçük;    
	        System.out.println("Dizinin en büyük elemaný:"+ büyük);
	        System.out.println("Dizinin en küçük elemaný:"+ küçük);  
	        System.out.println("Dizideki en büyük sayý ile en küçük sayý arasýndaki fark: "+fark);
	    }
		
		
	}


