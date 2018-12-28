package ca.awkhan94.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity
{
    /**
     * Activity.java is like a controller and view is our activity_bmi.xml. When we selected the method in the view and wrote the the method
     * in the onclick properties. Now it makes the bridge between view and controller.
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    /**
     * it recieves a parameter v of type View, View is generic type. Its a void method it doesn't return anything.To import the package which contains the class you
     * press Ctrl + Alt which basically imports the parameter class. Once the button is clicked this method will be invoked.
     * We casted view to EditText because we want to tell its a EditText.
     * @param v
     */

    public void buttonClicked(View v)
    {
        View weightView = findViewById(R.id.weightBox);
        EditText weightEdit = (EditText) weightView;
        String weight = weightEdit.getText().toString(); // grasping the text from weightBox and return it.

        //Same for height but you can do on one shot:

        String height = ((EditText) findViewById(R.id.heightBox)).getText().toString();

        /*
        * Now we have seen how the view talk to the controller by invoking "buttonClicked"
        * and we have seen how the controller talk to the view by invoking "findViewById"
         */

        /**
         * Now we need to talk to the model and give the weight and the height. First
         * we instantiate the model
         */

        BMIModel model = new BMIModel(weight, height);
        String answer = model.getBMI();

        /**
         * this down part pokes the answer in to the textview
         */
        ((TextView) findViewById(R.id.answer)).setText(answer);
    }
}
