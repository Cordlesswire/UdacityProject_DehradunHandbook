package in.thepolymath.dehradunhandbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PilgrimFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Info> places = new ArrayList<Info>();
        places.add(new Info(getString(R.string.pil1_name), getString(R.string.pil1_desc),R.drawable.tapkeshwar));
        places.add(new Info(getString(R.string.pil2_name), getString(R.string.pil2_desc),R.drawable.laxmansidh));
        places.add(new Info(getString(R.string.pil3_name), getString(R.string.pil3_desc),R.drawable.chandrabani));
        places.add(new Info(getString(R.string.pil4_name), getString(R.string.pil4_desc),R.drawable.santla));
        places.add(new Info(getString(R.string.pil5_name), getString(R.string.pil5_desc),R.drawable.parkasheshwar));
        places.add(new Info(getString(R.string.pil6_name), getString(R.string.pil6_desc),R.drawable.bhadraj));
        places.add(new Info(getString(R.string.pil7_name), getString(R.string.pil7_desc),R.drawable.surkhanda));
        places.add(new Info(getString(R.string.pil8_name), getString(R.string.pil8_desc),R.drawable.jwalaji));
        places.add(new Info(getString(R.string.pil9_name), getString(R.string.pil9_desc),R.drawable.nagdevta));

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
