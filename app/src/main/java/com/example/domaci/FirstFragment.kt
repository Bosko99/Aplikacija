package com.example.domaci

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.domaci.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemList= listOf(
            "Jelena",
            "Jankovic",
            "28",
            "62",
            "175",
            "Zenski",
            "Random text: Kay was a good and kind boy. He grew beautiful roses in his window box, competing with his friends Gerda as to whose roses would be more beautiful. One day, a piece of the broken mirror  found  its way into his heart."
        )
        val adapter = Adapter(itemList)
        binding.recucleView.adapter = adapter

        binding.ButtonDropDown.text = (itemList[0] + " ﹀")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}