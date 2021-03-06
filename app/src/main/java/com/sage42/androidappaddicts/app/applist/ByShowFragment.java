/**
 * Copyright (C) 2013-2014 Sage 42 Apps Sdn Bhd Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under the
 * License.
 */
package com.sage42.androidappaddicts.app.applist;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.OptionsMenu;

import android.app.Fragment;

import com.sage42.androidappaddicts.R;

/**
 * Fragment to display the list of shows.
 */

@OptionsMenu(R.menu.general)
@EFragment(R.layout.applist_by_show_fragment)
public class ByShowFragment extends Fragment
{
    /**
     * Wire the data to the UI
     */
    @AfterViews
    void init()
    {
        // nothing yet
    }

    /**
     * Set the screen title.
     */
    @Override
    public void onStart()
    {
        super.onStart();

        this.getActivity().getActionBar().setTitle(R.string.applist_by_show_title);
    }

}
