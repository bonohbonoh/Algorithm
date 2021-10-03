package Programmers;
import java.util.*;
public class Level_1_PushtheKeyPad {
    public static void main(String args[]) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = "";
        int left = 10, right = 12;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right = numbers[i];
            } else {
                if (numbers[i] == 0) numbers[i] = 11;
                int distanceL = Math.abs(((left - 1) / 3) - (numbers[i] / 3)) + Math.abs(((left-1)%3) -1);
                int distanceR = Math.abs(((right - 1) / 3) - (numbers[i] / 3)) + Math.abs(((right-1)%3) -1);
                if(distanceL > distanceR){
                    answer+="R";
                    right = numbers[i];
                }
                else if(distanceL < distanceR){
                    answer+="L";
                    left = numbers[i];
                }
                else{
                    if(hand.equals("right")){
                        answer+="R";
                        right = numbers[i];
                    }
                    else{
                        answer+="L";
                        left = numbers[i];
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
