package com.amroid.runtracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amroid.runtracker.R
import com.amroid.runtracker.ui.viewmodels.RunningViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment :Fragment(R.layout.fragment_run) {
    private val viewmodel:RunningViewModel by viewModels()
}