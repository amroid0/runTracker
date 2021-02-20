package com.amroid.runtracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amroid.runtracker.R
import com.amroid.runtracker.ui.viewmodels.RunningViewModel
import com.amroid.runtracker.ui.viewmodels.StaticsViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StaticsFragment :Fragment(R.layout.fragment_statics) {
    private val viewmodel:StaticsViewModel by viewModels()
}