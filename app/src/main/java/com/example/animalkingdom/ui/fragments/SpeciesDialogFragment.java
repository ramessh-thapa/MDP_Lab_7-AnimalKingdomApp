package com.example.animalkingdom.ui.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.animalkingdom.data.model.Species;
import com.example.animalkingdom.ui.fragments.base.BaseFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.example.animalkingdom.R;

public class SpeciesDialogFragment extends DialogFragment {
    public BaseFragment parentFragment;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireContext(), R.style.CustomDialogStyle);
        builder.setTitle("Add New Species");
        View dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.specie_dialog_fragment, null);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);

        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Add", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                EditText txtSpeciesName = dialogView.findViewById(R.id.txtSpeciesName);
                EditText txtSpeciesDesc= dialogView.findViewById(R.id.txtSpeciesDesc);

                String name = txtSpeciesName.getText().toString();
                String desc= txtSpeciesDesc.getText().toString();

                if (name.isEmpty() || desc.isEmpty()) {
                    Toast.makeText(requireContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
                } else {
                    Species species = new Species(name,desc);
                    parentFragment.addItem(species);
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