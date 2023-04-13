import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
                                         Ali Şer Gök
                                         ID: 2022719075
                                         18.11.2022
 */

public class AliSer_Gok {
    public static void main(String args[]) {

        System.out.println();
        System.out.println("Enter the number of the input file you want to calculate");
        System.out.println("1  - input01.txt");
        System.out.println("2  - input02.txt");
        System.out.println("3  - input03.txt");
        System.out.println("4  - input04.txt");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        double[][] input1Cordinates = new double[][]{
                {0.8913, 0.1850},
                {0.0925, 0.9325},
                {0.3600, 0.9263},
                {0.3413, 0.5650},
                {0.8900, 0.5600},
                {0.0788, 0.1937},
                {0.9025, 0.9238},
                {0.0938, 0.5713},
                {0.5925, 0.5625},
                {0.3438, 0.1875},
                {0.5950, 0.9263},
                {0.5925, 0.2300}};
        int[] input1Locations = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 12};
        ArrayList<Integer> input1Locationss = new ArrayList<>();
        input1Locationss.add(11);
        input1Locationss.add(2);
        input1Locationss.add(3);
        input1Locationss.add(4);
        input1Locationss.add(5);
        input1Locationss.add(6);
        input1Locationss.add(7);
        input1Locationss.add(8);
        input1Locationss.add(9);
        input1Locationss.add(10);
        input1Locationss.add(1);
        input1Locationss.add(12);

        double[][] input2Cordinates = new double[][]{
                {0.5250, 0.4538},
                {0.9125, 0.9213},
                {0.8025, 0.1700},
                {0.8525, 0.2200},
                {0.8725, 0.1500},
                {0.0813, 0.1075},
                {0.4788, 0.6200},
                {0.5488, 0.5938},
                {0.5725, 0.4962},
                {0.1363, 0.9225},
                {0.4500, 0.4450},
                {0.4038, 0.4875}};
        int[] input2Locations = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1, 11, 12};
        ArrayList<Integer> input2Locationss = new ArrayList<>();
        input2Locationss.add(10);
        input2Locationss.add(2);
        input2Locationss.add(3);
        input2Locationss.add(4);
        input2Locationss.add(5);
        input2Locationss.add(6);
        input2Locationss.add(7);
        input2Locationss.add(8);
        input2Locationss.add(9);
        input2Locationss.add(1);
        input2Locationss.add(11);
        input2Locationss.add(12);

        double[][] input3Cordinates = new double[][]{
                {0.3550, 0.5088},
                {0.7125, 0.8888},
                {0.8550, 0.6838},
                {0.9338, 0.4762},
                {0.8550, 0.2462},
                {0.6900, 0.0900},
                {0.4638, 0.0487},
                {0.1963, 0.1150},
                {0.0975, 0.3238},
                {0.4838, 0.9588},
                {0.1063, 0.7600},
                {0.2738, 0.8925}};
        int[] input3Locations = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1, 11, 12};
        ArrayList<Integer> input3Locationss = new ArrayList<>();
        input3Locationss.add(10);
        input3Locationss.add(2);
        input3Locationss.add(3);
        input3Locationss.add(4);
        input3Locationss.add(5);
        input3Locationss.add(6);
        input3Locationss.add(7);
        input3Locationss.add(8);
        input3Locationss.add(9);
        input3Locationss.add(1);
        input3Locationss.add(11);
        input3Locationss.add(12);


        double[][] input4Cordinates = new double[][]{
                {0.5250, 0.4538},
                {0.9125, 0.7213},
                {0.6525, 0.2200},
                {0.8725, 0.1500},
                {0.0813, 0.1075},
                {0.5725, 0.6962},
                {0.1363, 0.9225},
                {0.4038, 0.4875}};
        int[] input4Locations = new int[]{2, 3, 4, 5, 6, 1, 8};
        ArrayList<Integer> input4Locationss = new ArrayList<>();
        input4Locationss.add(7);
        input4Locationss.add(2);
        input4Locationss.add(3);
        input4Locationss.add(4);
        input4Locationss.add(5);
        input4Locationss.add(6);
        input4Locationss.add(1);
        input4Locationss.add(8);


        double minimumValue = Double.MAX_VALUE;
        ArrayList<int[]> routeList = new ArrayList<>();
        ArrayList<Double> tDL = new ArrayList<>();
        int length;

        switch (number) {  // I assign each input file to difrent method because migros is at the different index for each array. I needed to create different methods for each one
            case 1:
                length = input1Locations.length;
                permutation(input1Locations, input1Cordinates, 0, length - 1, minimumValue, routeList, tDL,input1Locationss,number);
                break;
            case 2:
                length = input2Locations.length;
                permutation(input2Locations, input2Cordinates, 0, length - 1, minimumValue, routeList, tDL,input2Locationss,number);
                break;
            case 3:
                length = input3Locations.length;
                permutation(input3Locations, input3Cordinates, 0, length - 1, minimumValue, routeList, tDL,input3Locationss,number);
                break;
            case 4:
                length = input4Locations.length;
                permutation(input4Locations, input4Cordinates, 0, length - 1, minimumValue, routeList, tDL, input4Locationss,number);
                break;
            default:
                System.out.println("Please enter a valid number.");

        }

        int indexMinVal=0;


        for (double e : tDL) {     //tDL is totaldistanceValue List
            if (e < minimumValue) {
                minimumValue = e;
                indexMinVal = tDL.indexOf(e);  // I think if I can find the minumum distance ı can fin it index in List and after I can pull its route from routeList by using minimum value index

            }
        }

        System.out.println("Shortest route length:      "+minimumValue);
        System.out.println();

        switch (number) {  // I assign each input file to difrent method because migros is at the different index for each array. I needed to create different methods for each one
           /*

           Since the route records added to the list exceed the memory,
           I have turned this part into a comment so that it does not give an error.
           If there was no memory overflow, correct routes would be found for
           input01, input02 and input03. For now, only the correct route can be found for input04
           because there is no memory overflow. However, the shortest distance can be calculated for all inputs.



           case 1:
                System.out.print("Migros "+Integer.toString(input1Locationss.get(0))+" --> ");
                for(int e: routeList.get(indexMinVal)){
                    System.out.print(e+"--> ");
                }
                System.out.print(Integer.toString(input1Locationss.get(0))+" Migros ");
                break;
            case 2:
                System.out.print("Migros "+Integer.toString(input2Locationss.get(0))+" --> ");
                for(int e: routeList.get(indexMinVal)){
                    System.out.print(e+"--> ");
                }
                System.out.print(Integer.toString(input2Locationss.get(0))+" Migros ");
                break;
            case 3:
                System.out.print("Migros "+Integer.toString(input3Locationss.get(0))+" --> ");
                for(int e: routeList.get(indexMinVal)){
                    System.out.print(e+"--> ");
                }
                System.out.print(Integer.toString(input3Locationss.get(0))+" Migros ");
                break;

            */
            case 4:
                System.out.print("Migros "+Integer.toString(input4Locationss.get(0))+" --> ");
                               for(int e: routeList.get(indexMinVal)){
                    System.out.print(e+"--> ");
                }
                System.out.print(Integer.toString(input4Locationss.get(0))+" Migros ");
                break;
                
            default:
                System.out.println("The route cannot be shown due to memory overflow but the Algorithm is correct.");
                System.out.println("Route can be calculated only for input04.txt as there is no memory overflow.");
                System.out.println("But if you still want to test the algorithm, you can activate other \"case\"");
                System.out.println("statements that are converted to comments in Switch Case and remove the \"if\" statement in the \"collector()\" method.");
        }


    }

    private static void permutation ( int[] loc, double[][] cord, int startIndex, int lastIndex, double minValue, ArrayList<int[]> routeList, ArrayList < Double > tDL, ArrayList < Integer > memory,int number) {

        ArrayList<Integer> memoryList=memory;     // I will look indexes according to this list

        
        
        if (startIndex == lastIndex ) {

            double x1;
            double x2;
            double y1;
            double y2;

            double totalDistance = 0;
            double distance = 0;
            int pos = 0;                        // element position in cordinates array
            double lastFirstDistance = 0;
            int locElement = 0;
            int lastElement = 0;
            int[] currentArray = new int[loc.length];
            
            


            for (int i = 0; i < loc.length; i++) {

                currentArray=loc;

                locElement = loc[i];


                if (i == 0) {                  // migros to first location

                    x1 = cord[0][0];
                    x2 = cord[memoryList.indexOf(locElement)][0];
                    y1 = cord[0][1];
                    y2 = cord[memoryList.indexOf(locElement)][1];



                    lastFirstDistance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
                    totalDistance+=lastFirstDistance;

                    lastElement = locElement;

                }

                else {                                                  // Step by step I calculate distances here

                    x1 = cord[memoryList.indexOf(locElement)][0];
                    x2 = cord[memoryList.indexOf(lastElement)][0];
                    y1 = cord[memoryList.indexOf(locElement)][1];
                    y2 = cord[memoryList.indexOf(lastElement)][1];

                    distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
                    lastElement = locElement;

                    totalDistance += distance;



                }

                if (i==loc.length-1){                                     // at last step we also need to
                    // calculate last location to migros

                    x1 = cord[0][0];
                    x2 = cord[memoryList.indexOf(locElement)][0];
                    y1 = cord[0][1];
                    y2 = cord[memoryList.indexOf(locElement)][1];

                    lastFirstDistance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
                    totalDistance+=lastFirstDistance;

                    lastElement = locElement;

                }
                


            }
            collector(routeList, tDL, totalDistance,currentArray,memoryList,number); // save all total distance and routes in a list.
            // After permutation, we will find min value and
            // route thanks to these lists


        }

        else {
            for (int i = startIndex; i <= lastIndex; i++) {
                loc = swapMethod(loc, startIndex, i);
                permutation(loc, cord, startIndex + 1, lastIndex, minValue, routeList, tDL, memoryList,number);
                loc = swapMethod(loc, startIndex, i);
            }
        }
    }

    public static int[] swapMethod ( int[] loc, int i, int j)
    {
        int x;
        int[] swapArray = loc;
        x= swapArray[i];
        swapArray[i] = swapArray[j];
        swapArray[j] = x;
        return swapArray;
    }

    private static void collector (ArrayList<int[]> routeList, ArrayList < Double > tDL, double totDist, int[] route, ArrayList<Integer> memoryList,int number){
        if(number==4){
            routeList.add(route);          // I wrote this if statements cause
            tDL.add(totDist);              // if I test Input1, Input2, Input3 inputs
        }                                  // the "route" records added to the "routeList ArrayList" exceeds memory.


        else {
            tDL.add(totDist);

        }

    }
}
