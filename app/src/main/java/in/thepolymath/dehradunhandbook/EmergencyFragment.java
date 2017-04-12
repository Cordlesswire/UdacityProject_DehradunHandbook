package in.thepolymath.dehradunhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EmergencyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Info> places = new ArrayList<Info>();
        places.add(new Info(getString(R.string.e1_name), getString(R.string.e1_desc)));
        places.add(new Info(getString(R.string.e2_name), getString(R.string.e2_desc)));
        places.add(new Info(getString(R.string.e3_name), getString(R.string.e3_desc)));
        places.add(new Info(getString(R.string.e4_name), getString(R.string.e4_desc)));
        places.add(new Info(getString(R.string.e5_name), getString(R.string.e5_desc)));
        places.add(new Info(getString(R.string.e6_name), getString(R.string.e6_desc)));
        places.add(new Info(getString(R.string.e7_name), getString(R.string.e7_desc)));
        places.add(new Info(getString(R.string.e8_name), getString(R.string.e8_desc)));
        places.add(new Info(getString(R.string.e9_name), getString(R.string.e9_desc)));
        places.add(new Info(getString(R.string.e10_name), getString(R.string.e10_desc)));
        places.add(new Info(getString(R.string.e11_name), getString(R.string.e11_desc)));

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
