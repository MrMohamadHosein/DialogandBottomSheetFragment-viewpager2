package ir.mrmohamadhosein.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.mrmohamadhosein.fragments.databinding.Fragment2Binding

class Fragment2 :Fragment(), MainBottomSheet.MainDialogEvent {
    lateinit var binding :Fragment2Binding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = Fragment2Binding.inflate(layoutInflater , container , false)


        binding.btnOpenDialogFragment.setOnClickListener {

            val mainBottomSheet = MainBottomSheet(this)
            mainBottomSheet.show(parentFragmentManager, null)

        }


        return binding.root
    }

    override fun sendTextData(data: String) {
        binding.txtMain.text = data

    }


}