public class MockExam2 {
	public static void main(String[] args){

		
    	 int [] shoesize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};

        int n = 0;
        System.out.println("All shoe sizes collection: ");
        while(n < shoesize.length){
            System.out.print(shoesize[n]);
            n++;
            System.out.print(" ");
        }

    	int j = 0;
        System.out.println("\n\nPants Sizes collection: ");
    	while(j < shoesize.length){

    	 	int shirt = shoesize[j]; // Shirt size == shoe size
    	 	int pants = shoesize[j]%2; // pants size == shoesize%2 
    	 	switch(pants){
    	 		case 0:    	 			
                    System.out.print(shirt + " ");
    	 			break;
    	 	}
    	 	j++;
    	}	

        int t = 0;
        System.out.println("\n\nSocks Sizes collection: ");
 		while(t < shoesize.length){

 			int sock = shoesize[t]; // sock size == shoe size
 			int shoe = shoesize[t]%11; // shoe size == shoesize%11

 			switch(shoe){
 			    case 0:
 			 	    System.out.print(sock + " ");
 			 	    break;
 			}
 			t++;
 		}
    	 		
        int s = 0;
        System.out.println("\n\nLarger shoe sizes collection (size+1): ");
        while(s < shoesize.length){
        	System.out.print((shoesize[s] + 1));
        	s++;
        	System.out.print(" ");
        }

	    int k = 0;
        System.out.println("\n\nMy shoe sizes collection (size+1) % 2: ");
	    while(k < shoesize.length){

	   		int me = shoesize[k] + 1;
	   		int you = me%2;

	   		switch(you){
	   		case 0:
	   		     System.out.print(me + " ");
	   		     break;
	   		}
	   		k++;
	   	}
    	   	
	   	int y = 0;
        System.out.println("\n\nOur shoe sizes (size+1) % 11: ");
	   	while(y < shoesize.length){	

	   		int us = shoesize[y] + 1;
	   		int we = us%11;

	   		switch(we){
	   			case 0:
	   		      System.out.print(us + " ");
	   		      break;
	   		}
	   	  y++;
	    }
	}		
}