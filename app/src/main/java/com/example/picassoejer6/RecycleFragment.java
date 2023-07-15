package com.example.picassoejer6;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.picassoejer6.databinding.FragmentRecycleBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecycleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecycleFragment extends Fragment {
    private List<Fruit> fruitList = new ArrayList<>();
    private FragmentRecycleBinding binding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecycleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecycleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecycleFragment newInstance(String param1, String param2) {
        RecycleFragment fragment = new RecycleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "holaddd");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG, "holasss");
        // Inflate the layout for this fragment
        binding = FragmentRecycleBinding.inflate(getActivity().getLayoutInflater());

        MyAdapterIma adapter = new MyAdapterIma();
        adapter.setData(getData());

        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(binding.recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        Log.e(TAG, "hola");
        return binding.getRoot();
    }

    private List<Fruit> getData() {

        fruitList.add(new Fruit("Sandia", "https://drive.google.com/file/d/1oDW_6VvIU3iAMkqYHYgp7moXcXTKnza4/view?usp=drive_link", "S A N D I A"));
        fruitList.add(new Fruit("Manzana", "https://drive.google.com/file/d/13PV4kexH7g1zGQQIoYYaciRLdZGrM8KT/view?usp=drive_link", "M A N Z A N A"));
        fruitList.add(new Fruit("Melon", "https://drive.google.com/file/d/12fIDNpo-64Z_2Estsh8GJk17crt_Z9Q1/view?usp=drive_link", "M E L O N"));
        fruitList.add(new Fruit("Banana", "https://drive.google.com/file/d/14YQ29EE6d6XIzRWkBYf6N23Q6CyQGOrA/view?usp=drive_link", "B A N A N A"));
        fruitList.add(new Fruit("Pera", "https://drive.google.com/file/d/1Fey16NdzcWns23WCGmbilx5JJzp9ZD2P/view?usp=drive_link", "P E R A"));
        fruitList.add(new Fruit("Naranja", "https://drive.google.com/file/d/1JIXlVbWJUFrFC-cbpF_lsXGA_4M2sRRN/view?usp=drive_link", "N A R A N J A"));
        fruitList.add(new Fruit("Mora", "https://drive.google.com/file/d/1S5A3m-RIH7y_cr9TrIzPM4Qt7ubwvaNN/view?usp=drive_link", "M O R A"));
        fruitList.add(new Fruit("Arandanos", "https://drive.google.com/file/d/1V4ds9d1szzfua8BOqC-jcM3H7mZdMfBB/view?usp=drive_link", "A R A N D A N O S"));
        fruitList.add(new Fruit("Melocoton", "https://drive.google.com/file/d/1i4AgSnO2L1ypGz1vr1OiAr_LTu-K2nrY/view?usp=drive_link", "M E L O C O T O N"));
        fruitList.add(new Fruit("Damasco", "https://drive.google.com/file/d/1py4wB_d4gVYdX_SkbSyyZTRWR0bsuNMM/view?usp=drive_link", "D A M A S C O"));
        fruitList.add(new Fruit("Maracuya", "https://drive.google.com/file/d/13j45wAngdSe6rzCi-czxMXIyhPznMd7F/view?usp=drive_link", "M A R A C U Y A"));
        fruitList.add(new Fruit("Pomelo", "https://drive.google.com/file/d/1xls_u_4sp6fZHNkS2ajxxwKZ-TjBn5Vj/view?usp=drive_link", "P O M E L O"));
        return fruitList;
    }
}