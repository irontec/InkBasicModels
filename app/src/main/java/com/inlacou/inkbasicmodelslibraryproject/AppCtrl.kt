package com.inlacou.inkbasicmodelslibraryproject

import android.app.Application
import com.inlacou.inkspannable.InkSpannableConfig
import timber.log.Timber
import java.lang.ref.WeakReference

/**
 * Created by inlacou on 25/11/14.
 */
class AppCtrl : Application() {

	override fun onCreate() {
		super.onCreate()
		Timber.plant(Timber.DebugTree())

		// initialize the singleton
		instance = this
		
		InkSpannableConfig.context = WeakReference(this)
	}

	companion object {

		/**
		 * A singleton instance of the application class for easy access in other places
		 */
		lateinit var instance: AppCtrl
			private set
	}
}