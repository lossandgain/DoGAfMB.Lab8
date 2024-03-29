package com.example.lab8;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {
    interface OnFragmentSendDataListener {
        void onSendData(String data);
    }
    private OnFragmentSendDataListener fragmentSendDataListener;
    String[] flowers = { "Ветреница дубравная (Anemone nemorosa)",
            "Горянка (Epimedium)",
            "Зубянка железистая (Cardamine glanduligera)",
            "Морозник (Helleborus)",
            "Печёночница (Hepаtica)",
            "Сердечник луговой (Cardamine pratensis)",
            "Триллиум (Trillium)"};
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            fragmentSendDataListener = (OnFragmentSendDataListener) context;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " должен реализовывать интерфейс OnFragmentInteractionListener");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        // получаем элемент ListView
        ListView flowersList = view.findViewById(R.id.list);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, flowers);
        // устанавливаем для списка адаптер
        flowersList.setAdapter(adapter);
        // добавляем для списка слушатель
        flowersList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String selectedItem = (String)parent.getItemAtPosition(position);
                // Посылаем данные Activity
                fragmentSendDataListener.onSendData(selectedItem);
            }
        });
        return view;
    }
}
