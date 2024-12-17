package es.carballeira.gestordeberes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrabajoAdapter extends RecyclerView.Adapter<TrabajoAdapter.TrabajoViewHolder> {
    ArrayList<Trabajo> tareas;

    public TrabajoAdapter(ArrayList<Trabajo> tareas) {
        this.tareas = tareas;
    }

    @NonNull
    @Override
    public TrabajoAdapter.TrabajoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TrabajoAdapter.TrabajoViewHolder trabajoViewHolder =
                new TrabajoViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.ly_trabajo,parent,false)
                );
        return trabajoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TrabajoAdapter.TrabajoViewHolder holder, int position) {
        Trabajo trabajo = tareas.get(position);
        holder.tv_asignatura.setText(trabajo.getAsignatura().toString());
        holder.tv_descripcion.setText(trabajo.getDescripcion());
        holder.tv_fecha.setText(trabajo.getFechaEntrega());
        holder.tv_estado.setText(trabajo.getEstado());
    }

    @Override
    public int getItemCount() {
        return tareas.size();
    }

    public class TrabajoViewHolder extends RecyclerView.ViewHolder {
        TextView tv_asignatura,
                 tv_descripcion,
                 tv_fecha,
                 tv_estado;

        public TrabajoViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_asignatura = itemView.findViewById(R.id.tv_asignatura);
            this.tv_descripcion = itemView.findViewById(R.id.tv_descripcion);
            this.tv_fecha = itemView.findViewById(R.id.tv_fecha);
            this.tv_estado = itemView.findViewById(R.id.tv_estado);
        }
    }
}
