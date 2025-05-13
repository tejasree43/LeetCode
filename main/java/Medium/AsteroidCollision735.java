package Medium;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision735 {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int value : asteroids) {
            if (value>0){
                stack.push(value);
            }
            else{

                    while (!stack.isEmpty()&&stack.peek()>0&& stack.peek()<Math.abs(value)) {
                        stack.pop();
                    }

                }

        }
        int[] answer = new int[stack.size()];
        while (!stack.isEmpty()) {
            for (int i = answer.length-1; i >= 0; i--){
             answer[i] = stack.peek();
            stack.pop();
        }
      }
     return answer;
    }

    public static void main(String[] args) {
    AsteroidCollision735 asteroid = new AsteroidCollision735();
  //  int[] asteroids = {5,10,-5};
     //  int[] asteroids = {8,-8};
     int[] asteroids = {10,2,-5};
      // int[] asteroids = { -2,-1,1,2};
      //  int[] asteroids ={ -2,-2,1,-2};
   int[] output= asteroid.asteroidCollision(asteroids);

        Arrays.stream(output).forEach(System.out::println);
    }

    }
