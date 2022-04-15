package com.example.pc_build

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class HardDiskDialogFragment : DialogFragment(R.layout.harddisk_fragment_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelbt: Button = view.findViewById(R.id.button5)
        val confirmbt: Button = view.findViewById((R.id.button4))
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
                str2 ="HardDisk: 1 TB HDD"
                price+= 79.99F
                st= "HardDisk: 1 TB HDD"
                pricen=79.99F

            }
            else if (radioButton == cp2){
                str2 ="HardDisk: 500 GB HDD"
                price+= 51.99F
                st= "HardDisk: 500 GB HDD"
                pricen=51.99F

            }
            else if (radioButton == cp3){
                str2 ="HardDisk: 250 GB SSD"
                price+= 39.99F
                st= "HardDisk: 250 GB SSD"
                pricen=39.99F
            }
            dismiss()
        }
    }
}