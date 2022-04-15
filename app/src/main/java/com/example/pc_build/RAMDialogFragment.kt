package com.example.pc_build

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class RAMDialogFragment: DialogFragment(R.layout.ram_fragment_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelbt: Button = view.findViewById(R.id.button3)
        val confirmbt: Button = view.findViewById((R.id.button2))
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
            Toast.makeText(context,radioButton.text, Toast.LENGTH_SHORT).show()

            if(radioButton == cp1){
                str1 ="Memory: 16GB RAM"
                price+= 67.99F
                st="Memory: 16GB RAM"
                pricen=67.99F

            }
            else if (radioButton == cp2){
                str1 ="Memory: 8GB RAM"
                price+= 33.99F
                st="Memory: 8GB RAM"
                pricen=33.99F

            }
            else if (radioButton == cp3){
                str1 ="Memory: 4GB RAM"
                price+= 19.99F
                st="Memory: 4GB RAM"
                pricen=19.99F
            }
            dismiss()
        }
    }
}