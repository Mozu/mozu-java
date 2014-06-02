package com.mozu.android.SalesAssistantUnbranded.ui.tenantselection;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mozu.android.SalesAssistantUnbranded.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by rodrigo_alvarez on 2/24/14.
 */
public class TenantSelectionFragment extends Fragment implements TenantSelectionView {

    private TenantSelectionActivity mPresenter;

    public static TenantSelectionFragment newInstance(LinkedHashMap<Integer, String> allowedScopesMap) {
        TenantSelectionFragment fragment = new TenantSelectionFragment();
        Bundle args = new Bundle();
        args.putSerializable("allowedScopesMap", allowedScopesMap);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tenantselection, container, false);

        @SuppressWarnings("unchecked") final LinkedHashMap<Integer, String> allowedScopesMap = (LinkedHashMap<Integer, String>)getArguments().getSerializable("allowedScopesMap");

        ListView tenantListView = (ListView)v.findViewById(R.id.listView);
        tenantListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(mPresenter != null) {
                    mPresenter.onTenantSelected((Integer) allowedScopesMap.keySet().toArray()[i]);
                }
            }
        });
        tenantListView.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.item_tenants, R.id.item, new ArrayList<String>(allowedScopesMap.values())));

        return v;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mPresenter = (TenantSelectionActivity) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must be TenantSelectionActivity");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter = null;
    }

    @Override
    public Fragment asFragment() {
        return this;
    }
}
