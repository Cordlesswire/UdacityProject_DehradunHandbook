package in.thepolymath.dehradunhandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link InfoAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link in.thepolymath.dehradunhandbook.Info} objects.
 */
public class InfoAdapter extends ArrayAdapter<Info> {

    /**
     * Create a new {@link InfoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Info}s to be displayed.
     */
    public InfoAdapter(Context context, ArrayList<Info> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item, parent, false);
        }

        Info currentInfo = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.namePlace);
        name.setText(currentInfo.getNamePlace());

        TextView desc = (TextView) listItemView.findViewById(R.id.descPlace);
        desc.setText(currentInfo.getDescPlace());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (currentInfo.hasImage()) {
            image.setImageResource(currentInfo.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}