package cat.inspedralbes.m8.pt12.garcia.prova1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recyclerview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)
        val recyclerview = findViewById<RecyclerView>(R.id.list)

        val contacts = createContactList(10)

        recyclerview.adapter = ContactAdapter(contacts)
        recyclerview.layoutManager = LinearLayoutManager(this)
    }
    private fun createContactList(numContacts: Int): ArrayList<Contact> {
        val contacts = ArrayList<Contact>()
        var lastContactId = 0

        for (i in 1..numContacts) {
            contacts.add(Contact("Person " + ++lastContactId, i <= numContacts / 2))
        }

        return contacts
    }
}
class Contact(val name: String, val isOnline: Boolean)

