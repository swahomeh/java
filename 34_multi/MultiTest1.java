public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	int i = 0;
        for(int[] tempNumber : lottogroups ){
            if (i%2 == 0)
                System.out.println("Group :"+i);

            int j = 0; 
            for(int tempNumber1 : tempNumber){
                if (j%2 == 0)
                    System.out.println("  Value "+j+" = "+tempNumber1);
                j++;
            }  
            i++;
        }
    }
}
