package com.tagakov.nlickr

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.bluelinelabs.conductor.Controller


class FeedController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup) = TextView(container.context).apply { setText("Hello world!") }

}