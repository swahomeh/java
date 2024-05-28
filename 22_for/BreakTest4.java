public class BreakTest4 {
    public static void main(String[] args) {
       
        // outer:for(int i = 0;i<3;i++){
        //     System.out.println("outer:"+i);
        //     inner:for(int j = 0;j<3;j++){
        //         System.out.println(" inner:"+j);
        //         if(i == 2){
        //          continue inner;
        //         }
        //         innest:for(int k = 0;k<3;k++){
        //             if(j == 2){
        //                 continue innest;
        //              }
        //             System.out.println("  innest:"+k);
        //         }               
        //     }           
        // }
        
        // int i = 0;
        // outer:while(i<3){
        //     System.out.println("outer:"+i);
        //     int j = 0;
        //     inner:while(j<3){
        //         System.out.println(" inner:"+j);
        //         if(i == 2){
        //             j++;
        //          continue inner;
        //         }
        //         int k = 0;
        //         innest:while(k<3){
        //             if(j == 2){
        //                 k++;
        //                 continue innest;
        //              }
        //             System.out.println("  innest:"+k);
        //             k++;
        //         }
        //         j++;
        //     }
        //     i++;
        // } 

        int i = 0;
        outer:do{
            System.out.println("outer:"+i);
            int j = 0;
            inner:do{
                System.out.println(" inner:"+j);
                if(i == 2){
                    j++;
                 continue inner;
                }
                int k = 0;
                innest:do{
                    if(j == 2){
                        k++;
                        continue innest;
                     }
                    System.out.println("  innest:"+k);
                    k++;
                } while(k<3);
                j++;
            } while(j<3);
            i++;
        } while(i<3);              
    }
}