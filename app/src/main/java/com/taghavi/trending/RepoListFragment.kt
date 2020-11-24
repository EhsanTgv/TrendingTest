package com.taghavi.trending

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.taghavi.trending.databinding.FragmentRepoListBinding

class RepoListFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentRepoListBinding
//    private lateinit var adapter: RepoListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewDataBinding = FragmentRepoListBinding.inflate(inflater, container, false).apply {
//            viewmodel =                ViewModelProviders.of(this@RepoListFragment).get(RepoListViewModel::class.java)
            lifecycleOwner = viewLifecycleOwner
        }
        return viewDataBinding.root
    }
}