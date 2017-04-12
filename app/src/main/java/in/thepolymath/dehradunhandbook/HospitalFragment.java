package in.thepolymath.dehradunhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HospitalFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Info> places = new ArrayList<Info>();
        places.add(new Info(getString(R.string.h1_name), getString(R.string.h1_desc)));
        places.add(new Info(getString(R.string.h2_name), getString(R.string.h2_desc)));
        places.add(new Info(getString(R.string.h3_name), getString(R.string.h3_desc)));
        places.add(new Info(getString(R.string.h4_name), getString(R.string.h4_desc)));
        places.add(new Info(getString(R.string.h5_name), getString(R.string.h5_desc)));
        places.add(new Info(getString(R.string.h6_name), getString(R.string.h6_desc)));
        places.add(new Info(getString(R.string.h7_name), getString(R.string.h7_desc)));
        places.add(new Info(getString(R.string.h8_name), getString(R.string.h8_desc)));
        places.add(new Info(getString(R.string.h9_name), getString(R.string.h9_desc)));
        places.add(new Info(getString(R.string.h10_name), getString(R.string.h10_desc)));
        places.add(new Info(getString(R.string.h11_name), getString(R.string.h11_desc)));
        places.add(new Info(getString(R.string.h12_name), getString(R.string.h12_desc)));
        places.add(new Info(getString(R.string.h13_name), getString(R.string.h13_desc)));
        places.add(new Info(getString(R.string.h14_name), getString(R.string.h14_desc)));
        places.add(new Info(getString(R.string.h15_name), getString(R.string.h15_desc)));
        places.add(new Info(getString(R.string.h16_name), getString(R.string.h16_desc)));

        InfoAdapter adapter = new InfoAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
