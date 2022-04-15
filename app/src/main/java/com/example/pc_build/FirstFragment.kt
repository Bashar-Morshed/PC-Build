package com.example.pc_build

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

var price: Float = 0F
var pricen: Float = 0F
var st: String=""
var str: String=""
var str1: String=""
var str2: String= ""
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)



        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var flag : String="C"
        var v:View = inflater.inflate(R.layout.fragment_first, container, false)
        val spinnerVal:Spinner= v.findViewById(R.id.spinner)

        var options = arrayOf("","CPU","RAM","HardDisk")
        var cpuText : TextView = v.findViewById(R.id.textView9)
        var ramtext: TextView= v.findViewById(R.id.textView10)
        var hdtext: TextView= v.findViewById(R.id.textView11)
        val bt:Button=v.findViewById(R.id.button)
        val prtext : TextView= v.findViewById(R.id.textView8)


         spinnerVal.adapter=
             context?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, options) }

        spinnerVal.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag= options.get(p2)



                 if (flag== "RAM" ){
                    var dialog_var = RAMDialogFragment()
                    dialog_var.show(childFragmentManager,"Custom dialog")

                }
                else if(flag == "CPU"){
                     var dialog_var = CPUDialogFragment()
                     dialog_var.show(childFragmentManager,"Custom dialog")


                 }

                else if(flag == "HardDisk"){
                    var dialog_var = HardDiskDialogFragment()
                    dialog_var.show(childFragmentManager,"Custom dialog")
                }


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")

            }


        }
        bt.setOnClickListener {
            prtext.text= price.toString()
            hdtext.text= str2
            cpuText.text = str
            ramtext.text= str1

            price=0F
            str="CPU:"
            str1="Memory:"
            str2="HardDisk:"
        }





        // Inflate the layout for this fragment
        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}