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

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentRecycleBinding.inflate(getActivity().getLayoutInflater());

        MyAdapterIma adapter = new MyAdapterIma();
        adapter.setData(getData());

        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(binding.recyclerView.getContext(), DividerItemDecoration.VERTICAL));


        return binding.getRoot();
    }

    private List<Fruit> getData() {

        fruitList.add(new Fruit("Sandia", "https://5aldia.cl/wp-content/uploads/2018/03/sandia.jpg", "S-A-N-D-I-A"));
        fruitList.add(new Fruit("Manzana", "https://www.semana.com/resizer/aFlCrqRB5tcLkt-aB8oGfRK9VZQ=/1280x720/smart/filters:format(jpg):quality(80)/cloudfront-us-east-1.images.arcpublishing.com/semana/UM4AUXGP25H6NM6CS7UENR32DQ.jpg", "M-A-N-Z-A-N-A"));
        fruitList.add(new Fruit("Melon", "https://frutonchile.cl/wp-content/uploads/2020/11/MELON-CALAMENO.jpg", "M-E-L-O-N"));
        fruitList.add(new Fruit("Banana", "https://fruittoday.com/wp-content/uploads/2021/11/cuanto-azucar-tiene-platano-1024x774.jpg", "B-A-N-A-N-A"));
        fruitList.add(new Fruit("Pera", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkrEvApr2rMOjQcJbK_T-uQyJBsVFbZZtXpW5y4wLgHjrK6FLlqYHyM-NnTgYI4uLEVIM&usqp=CAU", "P-E-R-A"));
        fruitList.add(new Fruit("Naranja", "https://i0.wp.com/historiasdelahistoria.com/wordpress-2.3.1-ES-0.1-FULL/wp-content/uploads/2015/11/naranja.jpg?w=607&ssl=1", "N-A-R-A-N-J-A"));
        fruitList.add(new Fruit("Mora", "https://cdn.ppfam.com/files/445-27896-imagen/mora.jpg", "M-O-R-A"));
        fruitList.add(new Fruit("Arandanos", "https://sanangel.edu.mx/sites/default/files/gdi/Mora-Azul-Banner.jpg", "A-R-A-N-D-A-N-O-S"));
        fruitList.add(new Fruit("Melocoton", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTSr_ctdogvZkBvILA1iYPQTplN8BCCbUUesgFuPqODj6pQqCQjN-gJpd9Ca9hpaHnH4o&usqp=CAU", "M-E-L-O-C-O-T-O-N"));
        fruitList.add(new Fruit("Damasco", "https://5aldia.cl/wp-content/uploads/2018/03/damasco.jpg", "D-A-M-A-S-C-O"));
        fruitList.add(new Fruit("Maracuya", "https://i0.wp.com/procamp.cl/wp-content/uploads/2020/07/marcuya.png?fit=600%2C600&ssl=1", "M-A-R-A-C-U-Y-A"));
        fruitList.add(new Fruit("Pomelo", "https://cugat.cl/multi/chillan/wp-content/uploads/sites/9/2022/07/2542025000002-2.jpg", "P-O-M-E-L-O"));
        return fruitList;
    }
}