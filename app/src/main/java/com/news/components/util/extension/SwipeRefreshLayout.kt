package com.news.components.util.extension

import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

@BindingAdapter("android:onRefresh")
fun SwipeRefreshLayout.refresh(status: Boolean) {
    this.isRefreshing = status
}