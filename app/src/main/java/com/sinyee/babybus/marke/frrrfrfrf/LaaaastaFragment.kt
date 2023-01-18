package com.sinyee.babybus.marke.frrrfrfrf


import android.graphics.drawable.Drawable
import androidx.appcompat.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sinyee.babybus.marke.R
import com.sinyee.babybus.marke.databinding.FragmentLaaaastaBinding

class LaaaastaFragment : Fragment() {

    val thgyhyhyhyhy by lazy {
        ContextCompat.getDrawable(requireActivity(), R.drawable.muuuuuuu)
    }
    val hyjujikololoololol by lazy {
        ContextCompat.getDrawable(requireActivity(), R.drawable.muuuuuuu)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLaaaastaBinding = FragmentLaaaastaBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun gtughtugtughut() {
        tjihjjyhhugthgtuhgthgt()
    }

    private fun gtjgijjigtjijghijyhjiyjhjjhyijhy() {
        binding.progBbbb.progress = hhhhhhhhh
        hhhhhhhhh += 1
    }

    private fun hgtuhghthbvbbhvbbfbfvb() {
        findNavController().navigate(R.id.action_laaaastaFragment_to_threeeeeeeeeeeeeFragment)
    }

    private fun rjtijgjtjgjtgjgjtjgtjgt() {
        gthyjujuj = false
    }

    private fun jgtjtjgjtjjgifhrfyryfgryfgr(drawableList: List<Drawable?>) {
        tjgtjgtijggtj(drawableList)
        kiiiiiiiiiiii()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val drawableList = listOf(thgyhyhyhyhy, hyjujikololoololol).shuffled()

            jgtjtjgjtjjgifhrfyryfgryfgr(drawableList)
            rjtijgjtjgjtgjgjtjgtjgt()
            binding.btnPressgtgtghhy.setOnClickListener {
                if (hhhhhhhhh == 99) {
                    hgtuhghthbvbbhvbbfbfvb()

                }else{
                    gtjgijjigtjijghijyhjiyjhjjhyijhy()
                }
            }
            binding.btnClooooooosa.setOnClickListener {
                gtughtugtughut()
            }


        } catch (e: Exception) {
            uuuuuuuuuuuu()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun tjgtjgtijggtj(drawableList: List<Drawable?>) {
        binding.imgMainEnemeefrgyhyhyhyyh.setImageDrawable(drawableList.random())
    }


    private var hhhhhhhhh = 1
    private var gthyjujuj = true

    private var fragmentLaaaastaBinding: FragmentLaaaastaBinding? = null
    private val binding
        get() = fragmentLaaaastaBinding ?: throw RuntimeException("FragmentLaaaastaBinding = null")



    private fun uuuuuuuuuuuu() {
        Toast.makeText(
            requireContext(),
            "I have some error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }


    private fun kiiiiiiiiiiii() {
        binding.progBbbb.progress = hhhhhhhhh
    }

    override fun onPause() {
        hhhhhhhhh = 1
        onDestroy()
        super.onPause()
    }

    private fun tjihjjyhhugthgtuhgthgt() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Close game")
            .setPositiveButton("Yes, close") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    override fun onDestroy() {
        fragmentLaaaastaBinding = null
        super.onDestroy()
    }


}