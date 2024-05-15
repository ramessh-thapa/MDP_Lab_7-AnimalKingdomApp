package com.example.animalkingdom.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.animalkingdom.R;

public class SpeciesListsFragmentDirections {
  private SpeciesListsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSpeciesListFragmentToDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_speciesListFragment_to_dashboardFragment);
  }
}
