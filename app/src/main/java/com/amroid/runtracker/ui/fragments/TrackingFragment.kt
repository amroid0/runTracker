package com.amroid.runtracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.amroid.runtracker.R
import com.amroid.runtracker.ui.viewmodels.RunningViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment :Fragment(R.layout.fragment_tracking) {
private val  viewModel:RunningViewModel by viewModels()
}