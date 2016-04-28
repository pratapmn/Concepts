package mine.algo.company.apple;

/*
Apple phone interview
 *
 */

class Permutation {
    public static void main(String[] args) {
        permutations("abc"); // abc, acb, cab, cba, bac, bca
    }

    public static void permutations(String s) {
        char[] input = s.toCharArray();
        char[] result = new char[input.length];
        boolean[] used = new boolean[input.length];
        for(int i = 0; i < input.length; i ++){
            used[i] = false;
        }
        permuteOperation(input, result, used, 0);
    }

  /*
  ABC

  1 A

  2 AB

  3 ABC


  2 AC

  3 ACB

  */


    private static void permuteOperation(char[] s, char [] result, boolean used[], int reclevel){
        // I get the result
        if(reclevel == s.length){
            for(int i = 0; i < reclevel; i++){
                System.out.print(result[i]);
            }
            System.out.println();

        }

        for(int i = 0; i < s.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            result[reclevel] = s[i];
            permuteOperation(s, result, used, reclevel+1);
            used[i] = false;
        }
    }



    /*
    Second question refactor code

    public void moveCarForward(Object car) {
        if (car instanceof BMW) {
            BMW bmw = (BMW)car;
            bmw.startCar();
            bmw.shiftToDrive();
            bmw.pressGas();
        } else if (car instanceof Mercedes) {
            Mecerdes mercedes = (Mercedes)car;
            mercedes.startEngine();
            mercedes.shiftCarToDrive();
            mercedes.gasPedal();
        } else if (car instanceof Tesla) {
            Tesla tesla = (Tesla)car;
            tesla.pressButton();
            tesla.drive();
            tesla.electricPedal();
        }
    }


    My Solution:
    interface Car {
        void startCar();
        void shiftToDrive();
        void pressGas();
    }

    class BMW implements Car {
        void startCar(){
            System.out.println("Starting BMW");
        }
        void shiftToDrive(){
            System.out.println("Shifting BMW");
        }
        void pressGas(){
            System.out.println("Gas pressed BMW");
        }
    }

    // Tesla, Merc
    public void moveCarForward(Car car) {
        car.startCar();
        car.shiftToDrive();
        car.pressGas();
    }
    */
}
