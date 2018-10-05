package ca.sheridancollege.prog39402_casestudy4.ui.displayFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class DisplayFragmentViewModel @Inject constructor() : ViewModel() {

    val imageId = MutableLiveData<Int>()

}
