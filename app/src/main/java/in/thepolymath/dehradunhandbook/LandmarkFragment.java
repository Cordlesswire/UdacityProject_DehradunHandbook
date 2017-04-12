package in.thepolymath.dehradunhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarkFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Info> places = new ArrayList<Info>();
        places.add(new Info(getString(R.string.land3_name), getString(R.string.land3_desc), R.drawable.fri));
        places.add(new Info(getString(R.string.land2_name), getString(R.string.land2_desc), R.drawable.clocktower));
        places.add(new Info(getString(R.string.land7_name), getString(R.string.land7_desc), R.drawable.malsi));
        places.add(new Info(getString(R.string.land1_name), getString(R.string.land1_desc), R.drawable.mindrolling));
        places.add(new Info(getString(R.string.land4_name), getString(R.string.land4_desc), R.drawable.survey));
        places.add(new Info(getString(R.string.land5_name), getString(R.string.land5_desc), R.drawable.chetwode));
        places.add(new Info(getString(R.string.land6_name), getString(R.string.land6_desc), R.drawable.sahastradhara));
        places.add(new Info(getString(R.string.land8_name), getString(R.string.land8_desc), R.drawable.robbers));
        places.add(new Info(getString(R.string.land9_name), getString(R.string.land9_desc), R.drawable.wadia));

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
