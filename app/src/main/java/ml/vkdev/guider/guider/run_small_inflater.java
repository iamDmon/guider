/*
 * Copyright (c) 2017. This Project is under Copyright and cannot be used. However the components are available under the MIT and GPL License on GitHub/vedantkarandikar
 */

package ml.vkdev.guider.guider;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class run_small_inflater extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.run_small, container, false);
    }

}
