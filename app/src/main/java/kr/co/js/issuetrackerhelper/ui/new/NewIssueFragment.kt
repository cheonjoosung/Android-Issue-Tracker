package kr.co.js.issuetrackerhelper.ui.new

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kr.co.js.issuetrackerhelper.databinding.FragmentNewIssueBinding

class NewIssueFragment : Fragment() {

    private var _binding: FragmentNewIssueBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val newIssueViewModel =
            ViewModelProvider(this).get(NewIssueViewModel::class.java)

        _binding = FragmentNewIssueBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        newIssueViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}