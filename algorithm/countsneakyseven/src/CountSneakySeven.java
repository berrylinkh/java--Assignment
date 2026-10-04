public class CountSneakySeven {
    public static int countSneakySeven(int number){
        int counter = 0;
        for (int count =0; count <=number; count++){
            if(count ==7){
                counter =0;
            }
            else if( count % 7 ==0) {
                counter++;
            }
            else if(count > 9 ){
                boolean isTrue = String.valueOf(count).contains("7");
                if(isTrue){
                    counter ++;
                }
            }
        }
        return counter;
    }
}
