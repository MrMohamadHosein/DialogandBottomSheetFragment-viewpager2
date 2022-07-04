package ir.mrmohamadhosein.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.mrmohamadhosein.fragments.databinding.Fragment1Binding

class Fragment1 :Fragment() , MainDialog.MainDialogEvent {
    lateinit var binding :Fragment1Binding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = Fragment1Binding.inflate(layoutInflater , container , false)




        binding.btnOpenDialogFragment.setOnClickListener {

            val mainDialog = MainDialog(this)
            mainDialog.show(parentFragmentManager, null)

        }




        return binding.root

    }

    override fun sendTextData(data: String) {
        binding.txtMain.text = data

    }


}