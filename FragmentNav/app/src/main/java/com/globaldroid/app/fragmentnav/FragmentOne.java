package com.globaldroid.app.fragmentnav;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 1/12/2018.
 */
public class FragmentOne extends Fragment {

    ArrayList<Integer> result=new ArrayList<>();
    ListView list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        int [] imgdata={R.drawable.album1,R.drawable.album2,R.drawable.album3,R.drawable.album4,R.drawable.album5,R.drawable.album6,
        R.drawable.album7,R.drawable.album8};
         for(int i:imgdata){

             result.add(new Integer(i));
         }


        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Fragment Two ");
        list=(ListView)getActivity().findViewById(R.id.list);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(),R.layout.list_style,result);

        list.setAdapter(adapter);
    }
}
