public class BreakTest {
    public static void main(String[] args) {
       
        int limit = 7;
        int i = 0;
        // while (i < 10){
        //     System.out.println("Counter ="+i);
        //     if(i == limit)
        //         break;
        //     i++;
        // } 

        do {
            System.out.println("Counter ="+i);
            if (i == limit)
                break;
            i++;
        } while (
            i < 10
        );    
       
    }
}