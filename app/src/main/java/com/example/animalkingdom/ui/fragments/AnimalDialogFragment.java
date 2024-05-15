package com.example.animalkingdom.ui.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.example.animalkingdom.R;
import com.example.animalkingdom.data.model.Animal;
import com.example.animalkingdom.ui.fragments.base.BaseFragment;


public class AnimalDialogFragment extends DialogFragment{

    public BaseFragment parentFragment;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireContext(), R.style.CustomDialogStyle);

        builder.setTitle("Add New Animal");

        View dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.animal_dialog_fragment, null);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);

        dialog.setCanceledOnTouchOutside(false);

        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                EditText txtAnimalName = dialogView.findViewById(R.id.txtAnimalName);
                EditText txtAnimalHabitat = dialogView.findViewById(R.id.txtAnimalHabitat);
                EditText txtAnimalDiet = dialogView.findViewById(R.id.txtAnimalDiet);

                String name = txtAnimalName.getText().toString();
                String habitat = txtAnimalHabitat.getText().toString();
                String diet = txtAnimalDiet.getText().toString();

                if (name.isEmpty() || habitat.isEmpty() || diet.isEmpty()) {
                   Toast.makeText(requireContext(), "Enter data in all the fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Animal animal = new Animal(name,habitat,diet);
                    parentFragment.addItem(animal);
                    dialog.dismiss();
                }
            }
        });

        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.dismiss();
            }
        });
        return dialog;
    }
}