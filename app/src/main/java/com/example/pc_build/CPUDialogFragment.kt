package com.example.pc_build

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class CPUDialogFragment : DialogFragment(R.layout.cpu_fragment_dialog){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelbt: Button= view.findViewById(R.id.button9)
        val confirmbt: Button= view.findViewById((R.id.button8))
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        cancelbt.setOnClickListener {
            dismiss()
        }

        val cp1 = view.findViewById<RadioButton>(R.id.radioButton2)
        val cp2 = view.findViewById<RadioButton>(R.id.radioButton3)
        val cp3 = view.findViewById<RadioButton>(R.id.radioButton)


        confirmbt.setOnClickListener {
            val selectedOption: Int= radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)


            Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()


            if(radioButton == cp1){
                str ="CPU: Intel Core i7"
                price+= 327.24F
                st= "CPU: Intel Core i7"
                pricen=327.24F

            }
            else if (radioButton == cp2){
                str="CPU: Intel Core i5"
                price+= 148.58F
                st= "CPU: Intel Core i5"
                pricen=148.58F

            }
            else if (radioButton == cp3){
                str="CPU: Intel Core i3"
                price+= 80.87F
                st= "CPU: Intel Core i3"
                pricen=80.87F
            }
            dismiss()

        }
    }
}