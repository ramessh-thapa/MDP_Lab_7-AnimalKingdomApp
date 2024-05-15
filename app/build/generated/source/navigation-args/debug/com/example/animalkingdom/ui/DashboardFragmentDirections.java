package com.example.animalkingdom.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.animalkingdom.R;

public class DashboardFragmentDirections {
  private DashboardFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToAnimalListFragment() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_animalListFragment);
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToSpeciesListFragment() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_speciesListFragment);
  }
}
