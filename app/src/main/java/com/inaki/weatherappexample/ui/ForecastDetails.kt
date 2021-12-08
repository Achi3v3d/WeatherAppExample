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
    private var param3: Float? = null
    private var param4: Float? = null
    private var param5: Float? = null
    private var param6: Float? = null
    private var param7: Float? = null
    private var param8: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getFloat(ARG_PARAM3)
            param4 = it.getFloat(ARG_PARAM4)
            param5 = it.getFloat(ARG_PARAM5)
            param6 = it.getFloat(ARG_PARAM6)
            param7 = it.getFloat(ARG_PARAM7)
            param8 = it.getFloat(ARG_PARAM8)

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
        fun newInstance(param1: String, param2: String) =
            ForecastDetails().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    param3?.let { putFloat(ARG_PARAM3, it) }
                    param4?.let { putFloat(ARG_PARAM4, it) }
                    param5?.let { putFloat(ARG_PARAM5, it) }
                    param6?.let { putFloat(ARG_PARAM6, it) }
                    param7?.let { putFloat(ARG_PARAM7, it) }
                    param8?.let { putFloat(ARG_PARAM8, it) }
                }
            }
    }
}