package UdemyJavaCourse.Section5.CodingExercise23;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0||smallCount<0||goal<0){
            return false;
        }

        if (bigCount * 5 + smallCount == goal){
            return true;
        }else if(bigCount * 5 + smallCount > goal){
            for (int i=0; i<=bigCount; i++){
                for (int j = 0; j<=smallCount; j++){

                    if (i*5+j==goal){
                        return true;
                    }
                }
            }
        }else{
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));

    }


}
