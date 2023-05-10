package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilfirstNum:TextInputLayout
    lateinit var  etfirstNum: TextInputEditText
    lateinit var etsecondNum: TextInputEditText
    lateinit var tilsecondNum:TextInputLayout
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btndivide:Button
    lateinit var btnMultiply:Button
    lateinit var btnresult:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        castviews()
    }
    fun castviews(){
        tilfirstNum = findViewById(R.id.tilfirstNum)
        etfirstNum = findViewById(R.id.etfirstNum)
        tilsecondNum =findViewById(R.id.tilsecondNum)
        etsecondNum = findViewById(R.id.etsecondNum)
        btnadd =findViewById(R.id.btnadd)
        btnMultiply= findViewById(R.id.btnmultiply)
        btndivide = findViewById(R.id.btndivide)
        btnresult = findViewById(R.id.btnResult)
        validate()
    }
    fun validate(){
        btnadd.setOnClickListener {
            var numone = etfirstNum.text.toString().toInt()
            var numtwo = etsecondNum.text.toString().toInt()
            var  output = numone +numtwo
            btnresult.text = output.toString()
        }
        btnMultiply.setOnClickListener {
            var numone = etfirstNum.text.toString().toInt()
            var numtwo = etsecondNum.text.toString().toInt()
            var  output = numone *numtwo
            btnresult.text = output.toString()
        }
        btnsubtract.setOnClickListener {
            var numone = etfirstNum.text.toString().toInt()
            var numtwo = etsecondNum.text.toString().toInt()
            var  output = numone - numtwo
            btnresult.text = output.toString()
        }
        btndivide.setOnClickListener {
            var numone = etfirstNum.text.toString().toInt()
            var numtwo = etsecondNum.text.toString().toInt()
            var  output = numone / numtwo
            btnresult.text = output.toString()
        }
    }
    ///
}