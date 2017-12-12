package Home_OOP_task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Viktoriia_Sherstiuk on 7/20/2017.
 */
public class Start2 {


    public static void main(String[] args) throws IOException {
        Human human1 = null,human2= null ;
        // enter data for first specimen of human
        String sname1;
        String height1;
        float weight11;
        String name2;
        String sname2;
        float height22;
        float height11;
        float weight22;
        boolean sex1;
        boolean sex2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter sex of first specimen of human - true (man) or false (woman):  ");
        String gender1 = br.readLine();
        sex1 = Boolean.parseBoolean(gender1);
        System.out.print("Enter first name of first specimen of human: ");
        String name1 = br.readLine();
        System.out.print("Enter surname of first specimen of human: ");
        sname1 = br.readLine();
        System.out.print("Enter height of first specimen of human: ");
        height1 = br.readLine();
        height11 = Float.parseFloat(height1);
        System.out.print("Enter weight of first specimen of human: ");
        String weight1 = br.readLine();
        weight11 = Float.parseFloat(weight1);


        // enter data for second specimen of human
        System.out.print("Enter sex of second specimen of human: ");
        String gender2 = br.readLine();
        sex2 = Boolean.parseBoolean(gender2);
        System.out.print("Enter first name of second specimen of human: ");
        name2 = br.readLine();
        System.out.print("Enter surname of second specimen of human: ");
        sname2 = br.readLine();
        System.out.print("Enter height of second specimen of human: ");
        String height2 = br.readLine();
        height22 = Float.parseFloat(height2);
        System.out.print("Enter weight of second specimen of human: ");
        String weight2 = br.readLine();
        weight22 = Float.parseFloat(weight2);

        if (sex1) {
             human1 = new Men(name1, sname1, height11, weight11);
        } else {
            human1 = new Women(name1, sname1, height11, weight11);
        }
        if (sex2) {
            human2 = new Men(name2, sname2, height22, weight22);
        } else {
            human2 = new Women(name2, sname2, height22, weight22);
        }

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human1.speak(human2));
        System.out.println( human1.endureSociety(human2));


    }
}