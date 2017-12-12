package Home_OOP_task2;

import java.util.Random;

/**
 * Created by Viktoriia_Sherstiuk on 7/20/2017.
 */
public class Human {
    protected boolean gender;
    private String firstName;
    private String surname;
    private float height;
    private float weight;


    public Human(String firstName, String surname, float height, float weight) {
        this.setFirstName(firstName);
        this.surname = surname;
        this.setHeight(height);
        this.setWeight(weight);
    }


    public void setHeight(float height) {
        if (height < 50.0 || height > 300.0) {
            throw new IllegalArgumentException();
        } else {
            this.height = height;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        if (weight < 10 || weight > 250) {
            throw new IllegalArgumentException();
        }
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[[A-Za-z]*\\s]*")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


    public boolean speak(Human a) {
        if (this.gender == false && a.gender == false) {
            return true;
        } else if (this.gender == true && a.gender == false) {
            return true;
        } else if (this.gender == false && a.gender == true) {
            return true;
        } else if (this.gender == true && a.gender == true) {
            Random r1 = new Random();
            if (r1.nextInt(100) < 50) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean endureSociety(Human a) {
        if (this.gender != a.gender) {
            Random r2 = new Random();
            if (r2.nextInt(100) < 70)
                return true;
        } else if (this.gender == a.gender == true) {
            Random r3 = new Random();
            if (r3.nextInt(100) < 5.6)
                return true;
        } else {
            Random r4 = new Random();
            if (r4.nextInt(100) < 5)
                return true;
        }
        return false;
    }


    public boolean spendTime(Human a) {
        if (this.getHeight() > a.getHeight()) && (this.getHeight()-a.getHeight()*100/ ){
            Random r5 = new Random();
            if (r5.nextInt(100) < 85) {
                return true;
            }
        } else if (){

        }
    }
}

  /*  public boolean spendTime(Human a) {
        return;
    }

    public boolean tolerateSociety(Human a) {
        return;
    }

    public Human haveRelationship(Human a) {
        return;
    }*/

}
