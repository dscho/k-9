package com.fsck.k9.ui.settings.account

import android.os.Bundle
import android.view.View
import com.takisoft.preferencex.PreferenceFragmentCompat
import com.fsck.k9.ui.R

class EmailAddressListFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferencesFix(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.empty_preferences, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}