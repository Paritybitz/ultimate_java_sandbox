package COW2.Tests;

import COW2.Goldilocks;

public class GoldiLocksTester
{
    public static void main(String [] arg){
        testGoldilocks();
    }

    public static boolean testGoldilocks(){
        boolean one = testDoYouEnterHouse();
        boolean two = testHowsTheBed();
        boolean three = testHowsTheChair();
        boolean four = testHowsThePorridge();
        boolean five = testHowsEverything();
        boolean six = testWhichChairToSitIn();
        boolean seven = testWhichBedToSleepIn();
        boolean eight = testWhichPorridgeToEat();
        if(one && two && three && four && five && six && seven && eight){
            System.out.println("Goldilocks works");
            return true;
        }else{
            System.out.println("Goldilocks DOES NOT work");
            return false;
        }
    }

    public static boolean testDoYouEnterHouse(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        boolean [] locked = {true, false};
        boolean [] results = {false, true};

        for(int i = 0; i < locked.length; i++){
            if(student.doYouEnterHouse(locked[i]) != results[i]){
                System.out.println("DoYouEnterHouse failed, " + "DoYouEnterHouse(" + locked[i] + ")" + " results in " + student.doYouEnterHouse(locked[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("doYouEnterHouse works");
        }else{
            System.out.println("doYouEnterHouse does not work");
        }
        return output;
    }

    public static boolean testHowsTheBed(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        int [] stiffnesses = {-100, -99, -98, -97, -96, -95, -94, -93, -92, -91, -90, -89, -88, -87, -86, -85, -84, -83, -82, -81, -80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -70, -69, -68, -67, -66, -65, -64, -63, -62, -61, -60, -59, -58, -57, -56, -55, -54, -53, -52, -51, -50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -35, -34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, };
        boolean [] results = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, };

        for(int i = 0; i < results.length; i++){
            if(student.howsTheBed(stiffnesses[i]) != results[i]){
                System.out.println("howsTheBed failed, " + "howsTheBed(" + stiffnesses[i] + ")" + " results in " + student.howsTheBed(stiffnesses[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("howsTheBed works");
        }else{
            System.out.println("howsTheBed does not work");
        }
        return output;
    }

    public static boolean testHowsTheChair(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        String [] sizes = {"Small", "Medium", "Large"};
        boolean [] results = {false, true, false};

        for(int i = 0; i < sizes.length; i++){
            if(student.howsTheChair(sizes[i]) != results[i]){
                System.out.println("howsTheChair failed, " + "howsTheChair(" + sizes[i] + ")" + " results in " + student.howsTheChair(sizes[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("howsTheChair works");
        }else{
            System.out.println("howsTheChair does not work");
        }
        return output;
    }

    public static boolean testHowsThePorridge(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        double [] temps = {15.0, 16.5, 18.0, 19.5, 21.0, 22.5, 24.0, 25.5, 27.0, 28.5, 30.0, 31.5, 33.0, 34.5, 36.0, 37.5, 39.0, 40.5, 42.0, 43.5, 45.0, 46.5, 48.0, 49.5, 51.0, 52.5, 54.0, 55.5, 57.0, 58.5, 60.0, 61.5, 63.0, 64.5, 66.0, 67.5, 69.0, 70.5, 72.0, 73.5, 75.0, 76.5, 78.0, 79.5, 81.0, 82.5, 84.0, 85.5, 87.0, 88.5, 90.0, 91.5, 93.0, 94.5, 96.0, 97.5, 99.0, 100.5, 102.0, 103.5, 105.0, 106.5, 108.0, 109.5, 111.0, 112.5, 114.0, 115.5, 117.0, 118.5, 120.0, 121.5, 123.0, 124.5, 126.0, 127.5, 129.0, };
        boolean [] results = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, };

        for(int i = 0; i < temps.length; i++){
            if(student.howsThePorridge(temps[i]) != results[i]){
                System.out.println("howsThePorridge failed, " + "howsThePorridge(" + temps[i] + ")" + " results in " + student.howsThePorridge(temps[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("howsThePorridge works");
        }else{
            System.out.println("howsThePorridge does not work");
        }
        return output;
    }

    public static boolean testHowsEverything(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        double [] temps = {51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 51.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 69.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 81.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 87.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 93.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 105.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 111.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 117.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, 123.0, };
        String [] sizes = {"Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", };
        int [] stiffnesses = {-100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, -100, -50, 0, 50, 100, };
        boolean [] results = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, };

        for(int i = 0; i < temps.length; i++){
            if(student.howsEverything(temps[i], sizes[i], stiffnesses[i]) != results[i]){
                System.out.println("howsEverything failed, " + "howsEverything(" + temps[i] + ", \"" + sizes[i] + "\", " + stiffnesses[i] + ")" + " results in " + student.howsEverything(temps[i], sizes[i], stiffnesses[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("howsEverything works");
        }else{
            System.out.println("howsEverything does not work");
        }
        return output;
    }

    public static boolean testWhichChairToSitIn(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        String [] sizes1 = {"Small", "Small", "Small", "Small", "Small", "Small", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Medium", "Medium", "Medium", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Large", "Large", "Large", "Large", "Large", "Large", };
        String [] sizes2 = {"Small", "Small", "Small", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Large", "Large", "Large", "Small", "Small", "Small", "Medium", "Medium", "Medium", "Large", "Large", "Large", };
        String [] sizes3 = {"Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", "Small", "Medium", "Large", };
        int [] results = {-1, 3, 3, 2, 2, 2, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 2, 2, 2, 1, 3, 1, };

        for(int i = 0; i < sizes1.length; i++){
            if(student.whichChairToSitIn(sizes1[i], sizes2[i], sizes3[i]) != results[i]){
                System.out.println("whichChairToSitIn failed, " + "whichChairToSitIn(\"" + sizes1[i] + "\", \"" + sizes2[i] + "\", \"" + sizes3[i] + "\")" + " results in " + student.whichChairToSitIn(sizes1[i], sizes2[i], sizes3[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("whichChairToSitIn works");
        }else{
            System.out.println("whichChairToSitIn does not work");
        }
        return output;
    }

    public static boolean testWhichBedToSleepIn(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        int [] stiffnesses1 = {-75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, };
        int [] stiffnesses2 = {-75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, -75, -75, -75, -75, -75, -75, -75, -50, -50, -50, -50, -50, -50, -50, -25, -25, -25, -25, -25, -25, -25, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, };
        int [] stiffnesses3 = {-75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, -75, -50, -25, 0, 25, 50, 75, };
        int [] results = {1, 3, 3, 3, 1, 1, 1, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 3, 3, 3, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 3, 3, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 1, 1, 1, 3, 3, 3, 3, 1, 1, 1, 3, 3, 3, 3, 1, 1, 1, 2, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3, 1, 1, 3, 3, 3, 3, 3, 1, 1, 2, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 3, 1, };

        for(int i = 0; i < stiffnesses1.length; i++){
            if(student.whichBedToSleepIn(stiffnesses1[i], stiffnesses2[i], stiffnesses3[i]) != results[i]){
                System.out.println("whichBedToSleepIn failed, " + "whichBedToSleepIn(" + stiffnesses1[i] + ", " + stiffnesses2[i] + ", " + stiffnesses3[i] + ")" + " results in " + student.whichBedToSleepIn(stiffnesses1[i], stiffnesses2[i], stiffnesses3[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("whichBedToSleepIn works");
        }else{
            System.out.println("whichBedToSleepIn does not work");
        }
        return output;
    }

    public static boolean testWhichPorridgeToEat(){
        Goldilocks student = new Goldilocks();
        boolean output = true;

        double [] temps1 = {74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, };
        double [] temps2 = {74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 74.2, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 80.1, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 85.7, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 93.1, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 95.4, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 99.0, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, 100.6, };
        double [] temps3 = {74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, 74.2, 75.0, 80.1, 85.7, 90.0, 93.1, 95.4, 99.0, 100.6, };
        int [] results = {-1, 3, 3, 3, 3, 3, 3, 3, -1, 2, 2, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, -1, 3, 3, 3, 3, 3, 3, 3, -1, 1, 1, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 1, 1, -1, 3, 3, 3, 3, 3, 3, 3, -1, 2, 2, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, -1, 3, 3, 3, 3, 3, 3, 3, -1, };

        for(int i = 0; i < temps1.length; i++){
            if(student.whichPorridgeToEat(temps1[i], temps2[i], temps3[i]) != results[i]){
                System.out.println("whichPorridgeToEat failed, " + "whichPorridgeToEat(" + temps1[i] + ", " + temps2[i] + ", " + temps3[i] + ")" + " results in " + student.whichPorridgeToEat(temps1[i], temps2[i], temps3[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("whichPorridgeToEat works");
        }else{
            System.out.println("whichPorridgeToEat does not work");
        }
        return output;
    }

}