package com.example.testapplication.Fragments;


import android.os.Bundle;


import com.example.testapplication.Adapters.FoodAdapter;
import com.example.testapplication.Adapters.TypeAdapter;
import com.example.testapplication.Main2Activity;
import com.example.testapplication.MainActivity;
import com.example.testapplication.R;
import com.example.testapplication.View.ListContainer;
import com.shizhefei.fragment.LazyFragment;

public class FirstFragment extends LazyFragment {

	private ListContainer listContainer;

	@Override
	protected void onCreateViewLazy(Bundle savedInstanceState) {
		super.onCreateViewLazy(savedInstanceState);
		setContentView(R.layout.fragment_first);
		listContainer = (ListContainer) findViewById(R.id.listcontainer);
		listContainer.setAddClick((Main2Activity) getActivity());
	}

	public FoodAdapter getFoodAdapter() {
		return listContainer.foodAdapter;
	}

	public TypeAdapter getTypeAdapter() {
		return listContainer.typeAdapter;
	}

}
