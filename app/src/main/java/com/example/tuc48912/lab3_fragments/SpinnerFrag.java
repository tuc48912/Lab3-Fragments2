package com.example.tuc48912.lab3_fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link SpinnerFrag.OnFragmentInteractionListener} interface
// * to handle interaction events.
// * Use the {@link SpinnerFrag#newInstance} factory method to
// * create an instance of this fragment.
// */
public class SpinnerFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Spinner.
     */
    // TODO: Rename and change types and number of parameters
    public static SpinnerFrag newInstance(String param1, String param2) {
        SpinnerFrag fragment = new SpinnerFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public SpinnerFrag() {
        // Required empty public constructor
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
        View SpinView = inflater.inflate(R.layout.fragment_spinner, container, false);
        String[] nums = new String[10];

        nums[0] = "2";
        nums[1] = "4";
        nums[2] = "6";
        nums[3] = "8";
        nums[4] = "10";
        nums[5] = "12";
        nums[6] = "14";
        nums[7] = "16";
        nums[8] = "18";
        nums[9] = "20";


        //  Create adapter for Spinner widget
        ArrayAdapter<String> numAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, nums);
        final Spinner spinner = (Spinner) SpinView.findViewById(R.id.spin);


        //  Assign adapter to widget
        spinner.setAdapter(numAdapter);
        Button btn = (Button)SpinView.findViewById(R.id.btn);

        View.OnClickListener oclA = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (id == R.id.switch_fragments) {
//                    //  Only display switch action if in single pane mode
//                    if (!twoPanes) {
//                        doTransition();
//                    } else {
//
//                    }
//                }
            }
        };

        btn.setOnClickListener(oclA);



        return inflater.inflate(R.layout.fragment_spinner, container, false);
    }

    private void doTransition(){
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_spinner, new checkBoard())
                .addToBackStack(null)
                .commit();
    };

//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        try {
//            mListener = (OnFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        public void onFragmentInteraction(Uri uri);
//    }

}
