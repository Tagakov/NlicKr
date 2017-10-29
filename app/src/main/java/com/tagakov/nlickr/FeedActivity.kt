package com.tagakov.nlickr

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction

class FeedActivity : AppCompatActivity() {

    private lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feed)
        router = Conductor.attachRouter(this, findViewById(R.id.container), savedInstanceState)

        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(FeedController()))
        }
    }
}
