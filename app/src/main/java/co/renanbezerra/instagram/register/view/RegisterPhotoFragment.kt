package co.renanbezerra.instagram.register.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import co.renanbezerra.instagram.R
import co.renanbezerra.instagram.common.view.CustomDialog

class RegisterPhotoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val customDialog = CustomDialog(requireContext())

        customDialog.setTitle(R.string.define_photo_profile)
        customDialog.addBottom(R.string.photo, R.string.gallery) {
            when (it.id) {
                R.string.photo -> {
                    Log.i("Test", "photo")
                }

                R.string.gallery -> {
                    Log.i("Test", "Gallery")
                }
            }
        }

        customDialog.show()
    }
}