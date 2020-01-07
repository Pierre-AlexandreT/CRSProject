package com.pat.crsproject.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.pat.crsproject.R
import com.pat.crsproject.data.model.Seance
import com.pat.crsproject.ui.adapter.SeanceAdapter
import kotlinx.android.synthetic.main.seance_list_fragment.view.*

class SeanceListFragment : Fragment() {

    private var myListe : ArrayList<Seance> = ArrayList()


    private lateinit var seanceAdapter : SeanceAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.run {
            myListe.add(Seance(1,"Mariage","","",""))
            myListe.add(Seance(1,"Fete d'anniversaire","","",""))
            myListe.add(Seance(1,"Incroyable voyage","","",""))


        } ?: throw IllegalStateException("Invalid Activity")


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.seance_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        seanceAdapter = SeanceAdapter()


        view.seance_list.apply {
            adapter = seanceAdapter
            layoutManager= LinearLayoutManager(context)
        }


        seanceAdapter.submitList(myListe)

    }
}