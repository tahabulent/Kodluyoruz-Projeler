package Hellow;

public class Step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fark;
	    int[] array=new int[10];
	    for(int i=0;i<array.length;i++){
	        array[i]=(int)(Math.random()*101);
	    }
	    int b�y�k,k���k;
	    b�y�k=array[0];
	    k���k=array[0];

	    for(int i=0;i<array.length;i++){
	        if(b�y�k<array[i]){
	            b�y�k=array[i];
	        }
	        if(k���k>array[i]){
	            k���k=array[i];
	        }

	    }
	    fark=b�y�k-k���k;    
	        System.out.println("Dizinin en b�y�k eleman�:"+ b�y�k);
	        System.out.println("Dizinin en k���k eleman�:"+ k���k);  
	        System.out.println("Dizideki en b�y�k say� ile en k���k say� aras�ndaki fark: "+fark);
	    }
		
		
	}


