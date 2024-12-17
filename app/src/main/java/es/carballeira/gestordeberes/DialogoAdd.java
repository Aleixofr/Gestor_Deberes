package es.carballeira.gestordeberes;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogoAdd extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.ly_dialog_add_deberes, null);

        Trabajo.Asignatura[] asignaturas = Trabajo.Asignatura.values();

        Spinner spnAsignatura = view.findViewById(R.id.spn_asignatura);

        ArrayAdapter<Trabajo.Asignatura> arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, asignaturas);

        spnAsignatura.setAdapter(arrayAdapter);
    }
}
