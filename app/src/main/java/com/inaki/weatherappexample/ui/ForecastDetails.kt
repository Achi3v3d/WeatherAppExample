package com.inaki.weatherappexample.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inaki.weatherappexample.R
import com.inaki.weatherappexample.databinding.FragmentForecastDetailsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 = "param4"
private const val ARG_PARAM5 = "param5"
private const val ARG_PARAM6 = "param6"
private const val ARG_PARAM7 = "param7"
private const val ARG_PARAM8 = "param8"

/**
 * A simple [Fragment] subclass.
 * Use the [ForecastDetails.newInstance] factory method to
 * create an instance of this fragment.
 */
class ForecastDetails : Fragment() {
    private lateinit var binding: FragmentForecastDetailsBinding
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null
    private var param4: String? = null
    private var param5: String? = null
    private var param6: String? = null
    private var param7: String? = null
    private var param8: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getString(ARG_PARAM3)
            param4 = it.getString(ARG_PARAM4)
            param5 = it.getString(ARG_PARAM5)
            param6 = it.getString(ARG_PARAM6)
            param7 = it.getString(ARG_PARAM7)
            param8 = it.getString(ARG_PARAM8)

        }
        Log.d("check","testing --- $param6 ")
    }
//

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForecastDetailsBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
        //return inflater.inflate(R.layout.fragment_forecast_details, container, false)
    }

    override fun onResume() {
        super.onResume()
        binding.desDescription.text = param1
        binding.desWeather.text = param2
        binding.desFeel.text = param4.toString()
        binding.desHum.text = param8.toString()
        binding.desMax.text = param6.toString()
        binding.desMin.text = param7.toString()
        binding.desPressure.text = param3.toString()
        binding.desTemp.text = param5.toString()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ForecastDetails.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String, param3: String, param4: String, param5: String, param6: String, param7: String, param8: String) =
            ForecastDetails().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    putString(ARG_PARAM3, param3)
                    putString(ARG_PARAM4, param4)
                    putString(ARG_PARAM5, param5)
                    putString(ARG_PARAM6, param6)
                    putString(ARG_PARAM7, param7)
                    putString(ARG_PARAM8, param8)
                }
            }
    }
}