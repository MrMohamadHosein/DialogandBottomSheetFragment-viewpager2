package ir.mrmohamadhosein.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ir.mrmohamadhosein.fragments.databinding.DialogMainbottomBinding

class MainBottomSheet(private val mainDialogEvent: MainDialogEvent) : BottomSheetDialogFragment() {
    lateinit var binding: DialogMainbottomBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DialogMainbottomBinding.inflate(layoutInflater, null, false)

        binding.btnCancel.setOnClickListener {
            dismiss()
        }

        binding.btnAccept.setOnClickListener {

            val name = binding.edtName.text.toString()
            val lastName = binding.edtLastName.text.toString()

            if (name.isNotEmpty() && lastName.isNotEmpty()) {

                // send data to activity :)
                dismiss()
                mainDialogEvent.sendTextData(" $name $lastName ")

            } else {
                Toast.makeText(context, "لطفا نام و نام خانوادگی را وارد کنید", Toast.LENGTH_SHORT)
                    .show()
            }

        }

        return binding.root
    }


    interface MainDialogEvent {
        fun sendTextData(data: String)
    }

}