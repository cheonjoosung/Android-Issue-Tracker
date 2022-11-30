package kr.co.js.issuetracker.ui.issues

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IssuesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is issues Fragment"
    }
    val text: LiveData<String> = _text
}