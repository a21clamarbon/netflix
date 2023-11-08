package cat.inspedralbes.m8.pt12.garcia.prova1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
class ContactAdapter(private val mContacts: List<Contact>):RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView = view.findViewById(R.id.contact_name)
        val messageButton = view.findViewById(R.id.message_button)
}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context: Context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.recyclerview, parent, false)
        return ViewHolder(contactView)
    }
    override fun getItemCount(): Int {
        return mContacts.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact: Contact = mContacts.get(position)
        val texView =holder.nameTextView
        texView.text = contact.name
        val button = holder.messageButton
        button.text = if (contact.isOnline) "Online" else "Offline"
        button.isEnabled = contact.isOnline
    }