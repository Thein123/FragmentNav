package com.globaldroid.app.fragmentnav;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 1/12/2018.
 */
public class CustomListAdapter extends ArrayAdapter<Integer> {

        Context context;

        public CustomListAdapter(Context context, int resourceId,
                                     ArrayList<Integer> items) {
            super(context, resourceId, items);
            this.context = context;
        }



        private class ViewHolder {
            ImageView imageView;
            TextView txtTitle;
            TextView txtDesc;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
           // Returnitem rowItem = getItem(position);

            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.list_style, null);
                holder = new ViewHolder();


                holder.imageView = (ImageView) convertView.findViewById(R.id.itemimage);
                convertView.setTag(holder);

            } else
                holder = (ViewHolder) convertView.getTag();


//            Picasso.with(callerContext).invalidate(rowItem.getimageurl());

            holder.imageView.setImageResource(getItem(position));



            return convertView;
        }
    }


