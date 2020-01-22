package mozilla.voice.geckoviewexperiment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.mozilla.geckoview.GeckoRuntime
import org.mozilla.geckoview.GeckoSession

class MainActivity : AppCompatActivity() {
    private val HOME_PAGE = "http://kitfox.tola.me.uk"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val session = GeckoSession()
        val runtime = GeckoRuntime.create(this)

        session.open(runtime)
        geckoView.setSession(session)
        session.loadUri(HOME_PAGE)
    }
}
