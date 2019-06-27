package com.example.hellofragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnHomeFragmentListener} interface
 * to handle interaction events.
 */
public class HomeFragment extends Fragment {

    private OnHomeFragmentListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewHomeFragment = inflater.inflate(R.layout.fragment_home, container, false);
        TextView tvHome = viewHomeFragment.findViewById(R.id.tvHome);
        tvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e( "TAG", "THIS IS THE TV OF HOME");
                mListener.tvHomeClick();
            }
        });

        return viewHomeFragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (OnHomeFragmentListener) context;
        }

    //esto libera memoria
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnHomeFragmentListener {
        void tvHomeClick();
    }
}
