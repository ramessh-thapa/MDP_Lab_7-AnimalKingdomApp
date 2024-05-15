package com.example.animalkingdom.ui.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.animalkingdom.R;

public class AnimalListFragmentDirections {
  private AnimalListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAnimalListFragmentToDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_animalListFragment_to_dashboardFragment);
  }
}
