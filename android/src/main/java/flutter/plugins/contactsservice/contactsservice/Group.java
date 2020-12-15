package flutter.plugins.contactsservice.contactsservice;
import java.util.HashMap;
/***
 * Represents an object which has a label and a value
 * such as an email or a phone
 ***/
public class Group implements Comparable<Group>{

    String identifier;
    String group_account_name;
    String name;

    Group(String id) {
        this.identifier = id;
    }

    Group() {
    }

    HashMap<String, Object> toMap() {
        HashMap<String, Object> groupMap = new HashMap<>();
        groupMap.put("identifier", identifier);
        groupMap.put("name", name);
        groupMap.put("group_account_name", group_account_name);
        return groupMap;
    }

    @SuppressWarnings("unchecked")
    static Group fromMap(HashMap map) {
        Group group = new Group();
        group.name = (String) map.get("name");
        group.identifier = (String) map.get("identifier");
        group.group_account_name = (String) map.get("group_account_name");
        return group;
    }

    @Override
    public int compareTo(Group contact) {
        String givenName1 = this.name == null ? "" : this.name.toLowerCase();
        String givenName2 = contact == null ? ""
                : (contact.name == null ? "" : contact.name.toLowerCase());
        return givenName1.compareTo(givenName2);
    }
}