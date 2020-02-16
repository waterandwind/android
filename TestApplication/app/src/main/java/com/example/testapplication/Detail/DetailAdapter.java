package com.example.testapplication.Detail;


import android.support.annotation.Nullable;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.testapplication.Bean.FoodBean;
import com.example.testapplication.R;
import com.example.testapplication.View.AddWidget;

import java.util.List;


class DetailAdapter extends BaseQuickAdapter<FoodBean, BaseViewHolder> {
	private AddWidget.OnAddClick onAddClick;

	DetailAdapter(@Nullable List<FoodBean> data, AddWidget.OnAddClick onAddClick) {
		super(R.layout.item_detail, data);
		this.onAddClick = onAddClick;
	}

	@Override
	protected void convert(BaseViewHolder helper, FoodBean item) {
		helper.setText(R.id.textView6, item.getName())
				.setText(R.id.textView7, item.getSale())
				.setText(R.id.textView8, item.getStrPrice(mContext))
				.setImageResource(R.id.imageView2, item.getIcon())
		;
		AddWidget addWidget = helper.getView(R.id.detail_addwidget);
		addWidget.setData(onAddClick,item);
	}
}
