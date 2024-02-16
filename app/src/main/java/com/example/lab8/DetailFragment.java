package com.example.lab8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_detail, container, false);

    }
    public void setSelectedItem(String selectedItem) {
        TextView desc = getView().findViewById(R.id.detailsText);
        ImageView photo = getView().findViewById(R.id.photo);
        if (selectedItem == "Ветреница дубравная (Anemone nemorosa)"){
            desc.setText(R.string.Anemone_desc);
            photo.setImageResource(R.drawable.anemone);
        }
        if (selectedItem == "Горянка (Epimedium)"){
            desc.setText(R.string.Epimedium_desc);
            photo.setImageResource(R.drawable.epimedium);
        }
        if (selectedItem == "Зубянка железистая (Cardamine glanduligera)"){
            desc.setText(R.string.Glanduligera_desc);
            photo.setImageResource(R.drawable.glanduligera);
        }
        if (selectedItem == "Морозник (Helleborus)"){
            desc.setText(R.string.Helleborus_desc);
            photo.setImageResource(R.drawable.helleborus);
        }
        if (selectedItem == "Печёночница (Hepаtica)"){
            desc.setText(R.string.Hepatica_desc);
            photo.setImageResource(R.drawable.hepatica);
        }
        if (selectedItem == "Сердечник луговой (Cardamine pratensis)"){
            desc.setText(R.string.Pratensis_desc);
            photo.setImageResource(R.drawable.pratensis);
        }
        if (selectedItem == "Триллиум (Trillium)"){
            desc.setText(R.string.Trillium_desc);
            photo.setImageResource(R.drawable.trillium);
        }
    }
}
