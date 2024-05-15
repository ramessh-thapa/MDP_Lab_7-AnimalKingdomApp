// Generated by view binder compiler. Do not edit!
package com.example.animalkingdom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.animalkingdom.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AnimalItemLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialCardView materialCardView;

  @NonNull
  public final TextView txtViewAnimalDiet;

  @NonNull
  public final TextView txtViewAnimalHabitat;

  @NonNull
  public final TextView txtViewAnimalName;

  private AnimalItemLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialCardView materialCardView, @NonNull TextView txtViewAnimalDiet,
      @NonNull TextView txtViewAnimalHabitat, @NonNull TextView txtViewAnimalName) {
    this.rootView = rootView;
    this.materialCardView = materialCardView;
    this.txtViewAnimalDiet = txtViewAnimalDiet;
    this.txtViewAnimalHabitat = txtViewAnimalHabitat;
    this.txtViewAnimalName = txtViewAnimalName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AnimalItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AnimalItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.animal_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AnimalItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.materialCardView;
      MaterialCardView materialCardView = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView == null) {
        break missingId;
      }

      id = R.id.txtViewAnimalDiet;
      TextView txtViewAnimalDiet = ViewBindings.findChildViewById(rootView, id);
      if (txtViewAnimalDiet == null) {
        break missingId;
      }

      id = R.id.txtViewAnimalHabitat;
      TextView txtViewAnimalHabitat = ViewBindings.findChildViewById(rootView, id);
      if (txtViewAnimalHabitat == null) {
        break missingId;
      }

      id = R.id.txtViewAnimalName;
      TextView txtViewAnimalName = ViewBindings.findChildViewById(rootView, id);
      if (txtViewAnimalName == null) {
        break missingId;
      }

      return new AnimalItemLayoutBinding((LinearLayout) rootView, materialCardView,
          txtViewAnimalDiet, txtViewAnimalHabitat, txtViewAnimalName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}