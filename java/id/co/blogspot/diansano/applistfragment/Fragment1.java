package id.co.blogspot.diansano.applistfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends ListFragment {

    TextView tvFragment2;

    String[] presidents = {"Soekarno", "Soeharto", "Habibie", "Gus Dur", "Megawati", "SBY", "Jokowi"};
    String[] deskripsi = {"president 1", "president 2", "president 3", "president 4",
            "president 5", "president 6", "president 7"};

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
                presidents));
    }

    @Override
    public void onListItemClick(ListView parent, View v, int position, long id) {
        super.onListItemClick(parent, v, position, id);
        tvFragment2 = getActivity().findViewById(R.id.tvFragment2);
        tvFragment2.setText(presidents[position] + " adalah " + deskripsi[position]);
        //Toast.makeText(getActivity(), presidents[position], Toast.LENGTH_SHORT).show();
    }


}
