package com.example.strandberg95.csn_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Strandberg95 on 2016-03-21.
 */
public class Controller  {

    //private CSNActivity viewer;
    private Calculator calc;

    public Controller(){
        //viewer = new CSNActivity();
        calc = new Calculator();
    }

    public float calculatePercentage(float earned){
        return calc.calculatePercentage(earned);
    }

}
