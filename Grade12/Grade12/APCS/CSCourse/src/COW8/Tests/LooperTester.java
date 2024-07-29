package COW8.Tests;

import COW8.Intake;
import COW8.Looper;

public class LooperTester
{
    public static void main(String [] arg){
        boolean one = testLevel1();
        boolean two = testLevel2();
        boolean three = testLevel3();
        boolean four = testLevel4();
        boolean five = testLevel5();
        boolean six = testLevel6();
        if(one && two && three && four && five && six){
            System.out.println("Looper works");
        }else{
            System.out.println("Looper does NOT work");
        }
    }

    public static boolean testLevel1(){
        int [] values = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, };
        Intake feed = new Intake(values);
        Looper student = new Looper();
        student.countUp(feed);
        if(feed.verify()){
            System.out.println("Level 1 works");
            return true;
        }else{
            System.out.println("Level 1 does NOT work");
            return false;
        }
    }

    public static boolean testLevel2(){
        boolean success = true;
        Looper student = new Looper();
        int [] values1 = {1, 1, 2, 3, 4, 5, 6, 7,
                2, 1, 2, 3, 4, 5, 6, 7,
                3, 1, 2, 3, 4, 5, 6, 7,
                4, 1, 2, 3, 4, 5, 6, 7, };
        int [] values2 = {1, 1, 2, 3,
                2, 1, 2, 3,
                3, 1, 2, 3,
                4, 1, 2, 3,
                5, 1, 2, 3,
                6, 1, 2, 3,};
        int [] values3 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, };
        Intake feed1 = new Intake(values1);
        student.countUp(feed1, 4, 7);
        Intake feed2 = new Intake(values2);
        student.countUp(feed2, 6, 3);
        Intake feed3 = new Intake(values3);
        student.countUp(feed3, 12, 20);
        if(!feed1.verify()){
            System.out.println("First test case fails for Level 2");
            success = false;
        }
        if(!feed2.verify()){
            System.out.println("Second test case fails for Level 2");
            success = false;
        }
        if(!feed3.verify()){
            System.out.println("Third test case fails for Level 2");
            success = false;
        }
        if(success){
            System.out.println("Level 2 works");
            return true;
        }else{
            System.out.println("Level 2 does NOT work");
            return false;
        }
    }

    public static boolean testLevel3(){
        boolean success = true;
        Looper student = new Looper();
        int [] values1 = {1, 1,
                2, 1, 2,
                3, 1, 2, 3,
                4, 1, 2, 3, 4,};
        int [] values2 = {1, 1,
                2, 1, 2,
                3, 1, 2, 3,
                4, 1, 2, 3, 4,
                5, 1, 2, 3, 4, 5,
                6, 1, 2, 3, 4, 5, 6,};
        int [] values3 = {1, 1,
                2, 1, 2,
                3, 1, 2, 3,
                4, 1, 2, 3, 4,
                5, 1, 2, 3, 4, 5,
                6, 1, 2, 3, 4, 5, 6,
                7, 1, 2, 3, 4, 5, 6, 7,
                8, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, };
        Intake feed1 = new Intake(values1);
        student.countUp(feed1, 4);
        Intake feed2 = new Intake(values2);
        student.countUp(feed2, 6);
        Intake feed3 = new Intake(values3);
        student.countUp(feed3, 12);
        if(!feed1.verify()){
            System.out.println("First test case fails for Level 3");
            success = false;
        }
        if(!feed2.verify()){
            System.out.println("Second test case fails for Level 3");
            success = false;
        }
        if(!feed3.verify()){
            System.out.println("Third test case fails for Level 3");
            success = false;
        }
        if(success){
            System.out.println("Level 3 works");
            return true;
        }else{
            System.out.println("Level 3 does NOT work");
            return false;
        }
    }

    public static boolean testLevel4(){
        boolean success = true;
        Looper student = new Looper();
        int [] values1 = {1, 1, 2, 3, 4, 5, 6,
                2, 1, 3, 5, 7, 9, 11,
                3, 1, 4, 7, 10, 13, 16,
                4, 1, 5, 9, 13, 17, 21, };
        int [] values2 = {1, 1, 2, 3,
                2, 1, 3, 5,
                3, 1, 4, 7,
                4, 1, 5, 9,
                5, 1, 6, 11,
                6, 1, 7, 13,};
        int [] values3 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                2, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39,
                3, 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58,
                4, 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77,
                5, 1, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 61, 66, 71, 76, 81, 86, 91, 96,
                6, 1, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85, 91, 97, 103, 109, 115,
                7, 1, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92, 99, 106, 113, 120, 127, 134,
                8, 1, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97, 105, 113, 121, 129, 137, 145, 153,
                9, 1, 10, 19, 28, 37, 46, 55, 64, 73, 82, 91, 100, 109, 118, 127, 136, 145, 154, 163, 172,
                10, 1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
                11, 1, 12, 23, 34, 45, 56, 67, 78, 89, 100, 111, 122, 133, 144, 155, 166, 177, 188, 199, 210,
                12, 1, 13, 25, 37, 49, 61, 73, 85, 97, 109, 121, 133, 145, 157, 169, 181, 193, 205, 217, 229, };
        Intake feed1 = new Intake(values1);
        student.countUpByRow (feed1, 4, 6);
        Intake feed2 = new Intake(values2);
        student.countUpByRow(feed2, 6, 3);
        Intake feed3 = new Intake(values3);
        student.countUpByRow(feed3, 12, 20);
        if(!feed1.verify()){
            System.out.println("First test case fails for Level 4");
            success = false;
        }
        if(!feed2.verify()){
            System.out.println("Second test case fails for Level 4");
            success = false;
        }
        if(!feed3.verify()){
            System.out.println("Third test case fails for Level 4");
            success = false;
        }
        if(success){
            System.out.println("Level 4 works");
            return true;
        }else{
            System.out.println("Level 4 does NOT work");
            return false;
        }
    }

    public static boolean testLevel5(){
        boolean success = true;
        Looper student = new Looper();
        int [] values1 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,
                2, 1, 3, 5, 7, 9, 11, 13, 15, 17, 15, 13, 11, 9, 7, 5, 3, 1,
                3, 1, 4, 7, 10, 13, 16, 13, 10, 7, 4, 1,
                4, 1, 5, 9, 13, 17, 13, 9, 5, 1, };
        int [] values2 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,
                2, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1,
                3, 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1,
                4, 1, 5, 9, 13, 17, 21, 25, 29, 33, 29, 25, 21, 17, 13, 9, 5, 1,
                5, 1, 6, 11, 16, 21, 26, 31, 26, 21, 16, 11, 6, 1,
                6, 1, 7, 13, 19, 25, 31, 25, 19, 13, 7, 1,};
        int [] values3 = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 200, 199, 198, 197, 196, 195, 194, 193, 192, 191, 190, 189, 188, 187, 186, 185, 184, 183, 182, 181, 180, 179, 178, 177, 176, 175, 174, 173, 172, 171, 170, 169, 168, 167, 166, 165, 164, 163, 162, 161, 160, 159, 158, 157, 156, 155, 154, 153, 152, 151, 150, 149, 148, 147, 146, 145, 144, 143, 142, 141, 140, 139, 138, 137, 136, 135, 134, 133, 132, 131, 130, 129, 128, 127, 126, 125, 124, 123, 122, 121, 120, 119, 118, 117, 116, 115, 114, 113, 112, 111, 110, 109, 108, 107, 106, 105, 104, 103, 102, 101, 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,
                2, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 117, 119, 121, 123, 125, 127, 129, 131, 133, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153, 155, 157, 159, 161, 163, 165, 167, 169, 171, 173, 175, 177, 179, 181, 183, 185, 187, 189, 191, 193, 195, 197, 199, 201, 199, 197, 195, 193, 191, 189, 187, 185, 183, 181, 179, 177, 175, 173, 171, 169, 167, 165, 163, 161, 159, 157, 155, 153, 151, 149, 147, 145, 143, 141, 139, 137, 135, 133, 131, 129, 127, 125, 123, 121, 119, 117, 115, 113, 111, 109, 107, 105, 103, 101, 99, 97, 95, 93, 91, 89, 87, 85, 83, 81, 79, 77, 75, 73, 71, 69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1,
                3, 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58, 61, 64, 67, 70, 73, 76, 79, 82, 85, 88, 91, 94, 97, 100, 103, 106, 109, 112, 115, 118, 121, 124, 127, 130, 133, 136, 139, 142, 145, 148, 151, 154, 157, 160, 163, 166, 169, 172, 175, 178, 181, 184, 187, 190, 193, 196, 199, 202, 199, 196, 193, 190, 187, 184, 181, 178, 175, 172, 169, 166, 163, 160, 157, 154, 151, 148, 145, 142, 139, 136, 133, 130, 127, 124, 121, 118, 115, 112, 109, 106, 103, 100, 97, 94, 91, 88, 85, 82, 79, 76, 73, 70, 67, 64, 61, 58, 55, 52, 49, 46, 43, 40, 37, 34, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1,
                4, 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 81, 85, 89, 93, 97, 101, 105, 109, 113, 117, 121, 125, 129, 133, 137, 141, 145, 149, 153, 157, 161, 165, 169, 173, 177, 181, 185, 189, 193, 197, 201, 197, 193, 189, 185, 181, 177, 173, 169, 165, 161, 157, 153, 149, 145, 141, 137, 133, 129, 125, 121, 117, 113, 109, 105, 101, 97, 93, 89, 85, 81, 77, 73, 69, 65, 61, 57, 53, 49, 45, 41, 37, 33, 29, 25, 21, 17, 13, 9, 5, 1,
                5, 1, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 61, 66, 71, 76, 81, 86, 91, 96, 101, 106, 111, 116, 121, 126, 131, 136, 141, 146, 151, 156, 161, 166, 171, 176, 181, 186, 191, 196, 201, 196, 191, 186, 181, 176, 171, 166, 161, 156, 151, 146, 141, 136, 131, 126, 121, 116, 111, 106, 101, 96, 91, 86, 81, 76, 71, 66, 61, 56, 51, 46, 41, 36, 31, 26, 21, 16, 11, 6, 1,
                6, 1, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85, 91, 97, 103, 109, 115, 121, 127, 133, 139, 145, 151, 157, 163, 169, 175, 181, 187, 193, 199, 205, 199, 193, 187, 181, 175, 169, 163, 157, 151, 145, 139, 133, 127, 121, 115, 109, 103, 97, 91, 85, 79, 73, 67, 61, 55, 49, 43, 37, 31, 25, 19, 13, 7, 1,
                7, 1, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92, 99, 106, 113, 120, 127, 134, 141, 148, 155, 162, 169, 176, 183, 190, 197, 204, 197, 190, 183, 176, 169, 162, 155, 148, 141, 134, 127, 120, 113, 106, 99, 92, 85, 78, 71, 64, 57, 50, 43, 36, 29, 22, 15, 8, 1,
                8, 1, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97, 105, 113, 121, 129, 137, 145, 153, 161, 169, 177, 185, 193, 201, 193, 185, 177, 169, 161, 153, 145, 137, 129, 121, 113, 105, 97, 89, 81, 73, 65, 57, 49, 41, 33, 25, 17, 9, 1,
                9, 1, 10, 19, 28, 37, 46, 55, 64, 73, 82, 91, 100, 109, 118, 127, 136, 145, 154, 163, 172, 181, 190, 199, 208, 199, 190, 181, 172, 163, 154, 145, 136, 127, 118, 109, 100, 91, 82, 73, 64, 55, 46, 37, 28, 19, 10, 1,
                10, 1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 201, 191, 181, 171, 161, 151, 141, 131, 121, 111, 101, 91, 81, 71, 61, 51, 41, 31, 21, 11, 1,
                11, 1, 12, 23, 34, 45, 56, 67, 78, 89, 100, 111, 122, 133, 144, 155, 166, 177, 188, 199, 210, 199, 188, 177, 166, 155, 144, 133, 122, 111, 100, 89, 78, 67, 56, 45, 34, 23, 12, 1,
                12, 1, 13, 25, 37, 49, 61, 73, 85, 97, 109, 121, 133, 145, 157, 169, 181, 193, 205, 193, 181, 169, 157, 145, 133, 121, 109, 97, 85, 73, 61, 49, 37, 25, 13, 1, };
        Intake feed1 = new Intake(values1);
        student.countUpToCeilingAndBack  (feed1, 4, 15);
        Intake feed2 = new Intake(values2);
        student.countUpToCeilingAndBack  (feed2, 6, 30);
        Intake feed3 = new Intake(values3);
        student.countUpToCeilingAndBack  (feed3, 12, 200);
        if(!feed1.verify()){
            System.out.println("First test case fails for Level 5");
            success = false;
        }
        if(!feed2.verify()){
            System.out.println("Second test case fails for Level 5");
            success = false;
        }
        if(!feed3.verify()){
            System.out.println("Third test case fails for Level 5");
            success = false;
        }
        if(success){
            System.out.println("Level 5 works");
            return true;
        }else{
            System.out.println("Level 5 does NOT work");
            return false;
        }
    }

    public static boolean testLevel6(){
        boolean success = true;
        Looper student = new Looper();
        int [] values1 = {1, 1, 0, -1, 0,
                2, 1, 2, 1, 0, -1, -2, -1, 0,
                3, 1, 2, 3, 2, 1, 0, -1, -2, -3, -2, -1, 0,
                4, 1, 2, 3, 4, 3, 2, 1, 0, -1, -2, -3, -4, -3, -2, -1, 0, };
        int [] values2 = {1, 1, 0, -1, 0,
                2, 1, 2, 1, 0, -1, -2, -1, 0,
                3, 1, 2, 3, 2, 1, 0, -1, -2, -3, -2, -1, 0,
                4, 1, 2, 3, 4, 3, 2, 1, 0, -1, -2, -3, -4, -3, -2, -1, 0,
                5, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -4, -3, -2, -1, 0,
                6, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -5, -4, -3, -2, -1, 0, };
        int [] values3 = {1, 1, 0, -1, 0,
                2, 1, 2, 1, 0, -1, -2, -1, 0,
                3, 1, 2, 3, 2, 1, 0, -1, -2, -3, -2, -1, 0,
                4, 1, 2, 3, 4, 3, 2, 1, 0, -1, -2, -3, -4, -3, -2, -1, 0,
                5, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -4, -3, -2, -1, 0,
                6, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -5, -4, -3, -2, -1, 0,
                7, 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -6, -5, -4, -3, -2, -1, 0,
                8, 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -7, -6, -5, -4, -3, -2, -1, 0,
                9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0,
                10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0,
                11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0,
                12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0,
        };
        Intake feed1 = new Intake(values1);
        student.fluctuateToCeiling (feed1, 4);
        Intake feed2 = new Intake(values2);
        student.fluctuateToCeiling (feed2, 6);
        Intake feed3 = new Intake(values3);
        student.fluctuateToCeiling (feed3, 12);
        if(!feed1.verify()){
            System.out.println("First test case fails for Level 6");
            success = false;
        }
        if(!feed2.verify()){
            System.out.println("Second test case fails for Level 6");
            success = false;
        }
        if(!feed3.verify()){
            System.out.println("Third test case fails for Level 6");
            success = false;
        }
        if(success){
            System.out.println("Level 6 works");
            return true;
        }else{
            System.out.println("Level 6 does NOT work");
            return false;
        }
    }

}