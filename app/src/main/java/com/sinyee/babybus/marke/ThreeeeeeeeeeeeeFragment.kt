package com.sinyee.babybus.marke

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.sinyee.babybus.marke.databinding.FragmentThreeeeeeeeeeeeeBinding
import kotlinx.coroutines.delay

class ThreeeeeeeeeeeeeFragment : Fragment() {




    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentThreeeeeeeeeeeeeBinding = null
        super.onDestroy()
    }

    private fun juujjuju() {
        gtgijtijgijtgjtjigjtjgjjtjgitjtgji()
        hykkhkykyh()
    }

    private fun gtgijtijgijtgjtjigjtjgjjtjgitjtgji() {
        rogjtigjtjgjitjgjtjgjtijgtjjgjtjgt()
    }

    private fun rogjtigjtjgjitjgjtjgjtijgtjjgjtjgt() {
        Toast.makeText(
            requireContext(),
            "Oops something wrong, please try again...",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun hykkhkykyh() {
        requireActivity().onBackPressed()
    }

    private var fragmentThreeeeeeeeeeeeeBinding: FragmentThreeeeeeeeeeeeeBinding? = null
    private val binding
        get() = fragmentThreeeeeeeeeeeeeBinding ?: throw RuntimeException("FragmentThreeeeeeeeeeeeeBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentThreeeeeeeeeeeeeBinding = FragmentThreeeeeeeeeeeeeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gktokgtkgktkgtkgt()

        } catch (e: Exception) {
            juujjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gktokgtkgktkgtkgt() {
        lifecycleScope.launchWhenCreated {
            igjtigtjgjtjgitjgji()
            delay(2850)
            hyjhyjhyjjhyjhy()
        }
    }

    private fun igjtigtjgjtjgitjgji() {
        Toast.makeText(
            requireContext(),
            "Good job!",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun hyjhyjhyjjhyjhy() {
        findNavController().navigate(R.id.action_threeeeeeeeeeeeeFragment_to_laaaastaFragment)
    }
}