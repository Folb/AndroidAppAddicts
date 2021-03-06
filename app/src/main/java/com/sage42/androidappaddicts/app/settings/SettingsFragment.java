/**
 *  Copyright (C) 2013-2014 Sage 42 Apps Sdn Bhd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.sage42.androidappaddicts.app.settings;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import android.app.Fragment;
import android.widget.ListView;

import com.sage42.androidappaddicts.R;

/**
 * The "About" page for the app. With lots of clickable links to call, email,
 * etc.
 */
@OptionsMenu(R.menu.general)
@EFragment(resName = "settings_fragment")
public class SettingsFragment extends Fragment
{
    @ViewById(R.id.settings_list)
    protected ListView mList;

    /**
     * Wire data into the display.
     */
    @AfterViews
    void init()
    {
        this.mList.setAdapter(new SettingsMenuListAdapter(this.getActivity()));
        this.mList.setOnItemClickListener(new SettingsMenuDrawClickListener());

    }

    /**
     * Set the screen title.
     */
    @Override
    public void onStart()
    {
        super.onStart();

        this.getActivity().getActionBar().setTitle(R.string.settings_settings_title);
    }

}