package ir.mrmohamadhosein.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import ir.mrmohamadhosein.fragments.databinding.DialogMainBinding

class MainDialog(private val mainDialogEvent: MainDialogEvent) : DialogFragment() {
    lateinit var binding: DialogMainBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//      val view = LayoutInflater.from(context).inflate(R.layout.dialog_main , null , false)

        val dialog = AlertDialog.Builder(context)

        binding = DialogMainBinding.inflate(layoutInflater, null, false)
        dialog.setView(binding.root)

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

        return dialog.create()
    }

    interface MainDialogEvent {
        fun sendTextData(data: String)
    }

}