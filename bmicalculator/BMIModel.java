package ca.awkhan94.bmicalculator;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by user on 12/27/18.
 */
public class BMIModel
{
    private double weight;
    private double height;

    public BMIModel(String w, String h)
    {
        // notice that controller sends us the weight and the height as doubles
        // the controller is just an agent that talks with the view. it grabs the stuff from view it grabs in string
        //and pass them to you. the model will allow it to turn the strings into appropriate type to validate. Over here i want to
        //turn the weight from string to real number

        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);

    }

    /**
     * when you talk to the controller you always have to give a String. View only understands Strings
     * here String.format, format takes format descriptor and a double and turn it into whatever you want.
     * @return
     */
    public String getBMI()
    {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public String getWeightInPound() {
        int weightInP = (int) Math.round(this.weight * 2.20);
        return String.format("%d", weightInP);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //PrintStream output = System.out;

        BMIModel model = new BMIModel("100", "1.8");
        //String answer = model.getBMI();
        //System.out.println(answer);
        System.out.println("Your calculated BMI is: " + model.getBMI() + " and your wight in pound is: " + model.getWeightInPound());

        model = new BMIModel("50", "1.2");
        System.out.println("Your calculated BMI is: " + model.getBMI() + " and your wight in pound is: " + model.getWeightInPound());

        model = new BMIModel("70", "1.5");
        System.out.println("Your calculated BMI is: " + model.getBMI() + " and your wight in pound is: " + model.getWeightInPound());

        model = new BMIModel("90", "1.3");
        System.out.println("Your calculated BMI is: " + model.getBMI() + " and your wight in pound is: " + model.getWeightInPound());

        model = new BMIModel("65", "1.7");
        System.out.println("Your calculated BMI is: " + model.getBMI() + " and your wight in pound is: " + model.getWeightInPound());

    }
}
