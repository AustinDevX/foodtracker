package com.example.kadeem.foodtracker;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListFragment extends ListFragment {
    private int mNum;
    private ArrayList<String> mList ;

    public static ArrayListFragment newInstance(int num) {
        ArrayListFragment f = new ArrayListFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("num", num);
        f.setArguments(bundle);

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNum = getArguments() != null ? getArguments().getInt("num") : 1;

        mList = new ArrayList<>();
        mList.add("Omelet");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_fragment_layout, container, false);
        View textView = v.findViewById(R.id.text);
        ((TextView) textView).setText(String.format("Fragment #%d", mNum));
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, mList));
    }
}
