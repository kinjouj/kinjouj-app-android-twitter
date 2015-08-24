package kinjouj.app.oretter.view.manager;

import android.app.Activity;
import android.support.design.widget.AppBarLayout;
import butterknife.Bind;

import kinjouj.app.oretter.MainActivity;
import kinjouj.app.oretter.R;

public class AppBarLayoutManager extends ViewManager<MainActivity> {

    @Bind(R.id.appbar_layout)
    AppBarLayout appBarLayout;

    public AppBarLayoutManager(Activity activity) {
        super(activity);
    }

    public void addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener listener) {
        appBarLayout.addOnOffsetChangedListener(listener);
    }

    public void removeOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener listener) {
        appBarLayout.removeOnOffsetChangedListener(listener);
    }
}
