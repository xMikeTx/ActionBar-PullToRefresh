package uk.co.senab.actionbarpulltorefresh.library.viewdelegates;

import com.origamilabs.library.views.StaggeredGridView;

import uk.co.senab.actionbarpulltorefresh.library.PullToRefreshAttacher;
import android.view.View;
import android.widget.AbsListView;

public class StaggeredGridViewDelegate extends
		PullToRefreshAttacher.ViewDelegate {

	public static final Class SUPPORTED_VIEW_CLASS = StaggeredGridView.class;

	@Override
	public boolean isScrolledToTop(View view) {
		StaggeredGridView absListView = (StaggeredGridView) view;
		if (absListView.getFirstPosition() == 0) {
			return true;
		}
//		} else if (absListView.getFirstVisiblePosition() == 0) {
//			final View firstVisibleChild = absListView.getChildAt(0);
//			return firstVisibleChild != null && firstVisibleChild.getTop() >= 0;
//		}
		return false;
	}
}
