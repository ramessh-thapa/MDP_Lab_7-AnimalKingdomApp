// Generated by view binder compiler. Do not edit!
package com.example.animalkingdom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.animalkingdom.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAnimalListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton btnAddAnimal;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RecyclerView recyclerViewAnimal;

  private FragmentAnimalListBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton btnAddAnimal, @NonNull ConstraintLayout main,
      @NonNull RecyclerView recyclerViewAnimal) {
    this.rootView = rootView;
    this.btnAddAnimal = btnAddAnimal;
    this.main = main;
    this.recyclerViewAnimal = recyclerViewAnimal;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAnimalListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAnimalListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_animal_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAnimalListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAddAnimal;
      FloatingActionButton btnAddAnimal = ViewBindings.findChildViewById(rootView, id);
      if (btnAddAnimal == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.recyclerViewAnimal;
      RecyclerView recyclerViewAnimal = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewAnimal == null) {
        break missingId;
      }

      return new FragmentAnimalListBinding((ConstraintLayout) rootView, btnAddAnimal, main,
          recyclerViewAnimal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}