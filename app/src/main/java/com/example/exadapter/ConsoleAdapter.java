package com.example.exadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ConsoleAdapter extends RecyclerView.Adapter<ConsoleAdapter.ViewHolder> {

    private List<Console> localDataSet;

    public ConsoleAdapter(List<Console> localDataSet) {
        this.localDataSet = localDataSet;
    }

    @NonNull
    @Override
    public ConsoleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.text_row_item, parent, false
        );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConsoleAdapter.ViewHolder holder, int position) {
        Console console = localDataSet.get(position);
        holder.getTextView().setText(console.nome);
        holder.getImageView().setImageResource(console.img);
        holder.getTextViewAno().setText(console.ano);
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;
        private final TextView textViewAno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.txtNomeConsole);
            imageView = (ImageView) itemView.findViewById(R.id.imgConsole);
            textViewAno = (TextView) itemView.findViewById(R.id.txtAnoConsole);
        }

        public TextView getTextView(){
            return textView;
        }

        public TextView getTextViewAno(){
            return textViewAno;
        }

        public ImageView getImageView(){
            return imageView;
        }
    }

}