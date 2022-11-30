package kr.co.js.issuetracker.ui.new

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewIssueViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is New-Issue Fragment"
    }
    val text: LiveData<String> = _text
}