import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 * Created by seyeon on 2018. 2. 17..
 */
class KotlinWithAACApplication : Application()  {

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(AppLifecycleCallback())
    }

    private class AppLifecycleCallback : Application.ActivityLifecycleCallbacks {

        override fun onActivityPaused(activity: Activity?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onActivityResumed(activity: Activity?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onActivityStarted(activity: Activity?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onActivityDestroyed(activity: Activity?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onActivityStopped(activity: Activity?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

}