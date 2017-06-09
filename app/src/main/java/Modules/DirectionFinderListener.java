package Modules;

import java.util.List;

/**
 * Created by hani on 6/7/17.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
