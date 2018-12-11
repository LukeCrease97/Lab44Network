package ym.edu.tar.lab44network;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TARC on 8/6/2015.
 */
public class CourseAdapter extends ArrayAdapter<Course> {

    public CourseAdapter(Activity context, int resource, List<Course> list) {
        super(context, resource, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Course course = getItem(position); //Retrieve a record and put into course var

        LayoutInflater inflater  = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.course_record, parent, false);
        // parent = content_main of the mainActivity

        TextView textViewCode, textViewTitle, textViewCredit;

        textViewCode = rowView.findViewById(R.id.textViewCode);
        textViewTitle = rowView.findViewById(R.id.textViewTitle);
        textViewCredit = rowView.findViewById(R.id.textViewCredit);

        textViewCode.setText(String.format("%s : %s", getContext().getString(R.string.code), course.getCode()));
        textViewTitle.setText(String.format("%s : %s", textViewTitle.getText(), course.getTitle()));
        textViewCredit.setText(String.format("%s : %s", textViewCredit.getText(), course.getCredit()));
        return rowView;
    }
}