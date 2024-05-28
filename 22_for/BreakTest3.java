public class BreakTest3 {
    public static void main(String[] args) {
        // int i = 0;
        // while (i<10){
        //     if(i == 7){
        //         i++;
        //         continue;
        //     }
           
        //     System.out.println("outer:"+i);
        //     i++;
        // }

        int i = 0;
        do {
            if(i == 7){
                i++;
                continue;
            }
           
            System.out.println("outer:"+i);
            i++;
        } while (i<10);       
    }           
}